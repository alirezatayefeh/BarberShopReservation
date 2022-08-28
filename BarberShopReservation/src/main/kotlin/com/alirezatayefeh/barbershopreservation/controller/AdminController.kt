package com.alirezatayefeh.barbershopreservation.controller

import com.alirezatayefeh.barbershopreservation.service.AdminService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(AdminController.PATH)
class AdminController @Autowired constructor(
    private val adminService: AdminService,
) {
    companion object {
        const val PATH = "/edge/v1/admin"
    }

    @GetMapping(value = ["/reserveTime"])
    fun getAllReserveTimes(
        @RequestParam(value = "offset", defaultValue = "0") offset: Int,
        @RequestParam(value = "limit", defaultValue = "10") limit: Int,
    ) {
        adminService.getAllReserveTimes(offset, limit)
    }

    @PutMapping(value = ["/{shopStatus:open|close}"])
    fun setShopStatus(@PathVariable shopStatus: String) {
        if (shopStatus == "open")
            adminService.openShop()

        if (shopStatus == "close")
            adminService.closeShop()
    }
}