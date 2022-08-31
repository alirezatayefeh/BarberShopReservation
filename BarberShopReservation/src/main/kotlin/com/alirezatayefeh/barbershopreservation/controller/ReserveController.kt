package com.alirezatayefeh.barbershopreservation.controller

import com.alirezatayefeh.barbershopreservation.model.ReserveDto
import com.alirezatayefeh.barbershopreservation.service.ReserveService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping(ReserveController.PATH)
class ReserveController @Autowired constructor(
    private val reserveService: ReserveService,
) {
    companion object {
        const val PATH = "/edge/v1/reserve"
    }

    @GetMapping(value = ["/allReserve/{userId}"])
    fun getAllReservedTime(
        @RequestParam(value = "offset", defaultValue = "0") offset: Int,
        @RequestParam(value = "limit", defaultValue = "10") limit: Int,
        @PathVariable("userId") userId: UUID
    ) {
        val reserveList = reserveService.getAllReserveTimes(offset, limit, userId)
    }

    @GetMapping(value = ["/reserve/{time}"])
    fun getReservedTime(@PathVariable("time") time: Int) {
        val reserveTime = reserveService.getReserveTime(time)
    }

    @PutMapping(value = ["/set"])
    fun setTime(@RequestBody reserveDto: ReserveDto) {
        reserveService.setTime(reserveDto)
    }

    @DeleteMapping(value = ["/delete}"])
    fun deleteTime(@RequestBody reserveDto: ReserveDto) {
        reserveService.deleteTime(reserveDto)
    }
}