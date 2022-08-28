package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.repository.ReserveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReserveService @Autowired constructor(
    private val reserveRepository: ReserveRepository,
){
    fun getAllReserveTimes(offset: Int, limit: Int) {
        TODO("Not yet implemented")
    }

    fun getReserveTime(time: Int) {
        TODO("Not yet implemented")
    }

    fun setTime(time: Int) {
        TODO("Not yet implemented")
    }

    fun deleteTime(time: Int) {
        TODO("Not yet implemented")
    }
}