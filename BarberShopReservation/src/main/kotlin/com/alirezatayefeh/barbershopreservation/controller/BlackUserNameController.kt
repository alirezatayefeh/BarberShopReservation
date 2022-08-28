package com.alirezatayefeh.barbershopreservation.controller

import com.alirezatayefeh.barbershopreservation.service.BlackUserNameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(BlackUserNameController.PATH)
class BlackUserNameController @Autowired constructor(
    private val blackUserNameService: BlackUserNameService,
) {
    companion object {
        const val PATH = "edge/v1/blackUserName"
    }

    @GetMapping(value = [""])
    fun getAllBlackUserNames(
        @RequestParam(value = "offset", defaultValue = "0") offset: Int,
        @RequestParam(value = "limit", defaultValue = "10") limit: Int
    ) {
        blackUserNameService.getAllBlackNameService(offset, limit)
    }
}