package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.model.ReserveDto
import com.alirezatayefeh.barbershopreservation.model.UserEntity
import com.alirezatayefeh.barbershopreservation.repository.ReserveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReserveService @Autowired constructor(
    private val reserveRepository: ReserveRepository,
) {
    fun getAllReserveTimes(offset: Int, limit: Int) {
        TODO("Not yet implemented")
    }

    fun getReserveTime(time: Int) {
        TODO("Not yet implemented")
    }

    fun setTime(reserveDto: ReserveDto) {
        val time = reserveDto.reserveTimes ?: error("time must not be null.")
        val reserveTime = reserveTimeIsExist(time)
        if (reserveTime)
            return

        UserEntity().apply {
            this.reserveTime = time
            this.uuid = reserveDto.userId
        }.also {
            reserveRepository.save(it)
        }
    }

    fun deleteTime(time: Int) {
        TODO("Not yet implemented")
    }

    private fun reserveTimeIsExist(time: Int): Boolean {
        val userEntity = reserveRepository.findReserveByTime(time)
        return userEntity == null
    }
}