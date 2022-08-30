package com.alirezatayefeh.barbershopreservation.service

import ReserveTimeIsNotExistException
import com.alirezatayefeh.barbershopreservation.model.ReserveDto
import com.alirezatayefeh.barbershopreservation.model.ReserveEntity
import com.alirezatayefeh.barbershopreservation.model.UserEntity
import com.alirezatayefeh.barbershopreservation.repository.ReserveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ReserveService @Autowired constructor(
    private val reserveRepository: ReserveRepository,
) {
    fun getAllReserveTimes(offset: Int, limit: Int) {

    }

    fun getReserveTime(time: Int) {
        TODO("Not yet implemented")
    }

    fun setTime(reserveDto: ReserveDto) {
        val time = reserveDto.reserveTimes ?: error("time must not be null.")
        val userId = reserveDto.userId ?: error("userId must not be null.")
        val userEntity = reserveIsExistByUserIdAndTime(userId, time)
        if (userEntity != null)
            return

        ReserveEntity().apply {
            this.reserveTime = time
 //           this.userId =
        }.also {
            reserveRepository.save(it)
        }
    }

    fun deleteTime(reserveDto: ReserveDto) {
        val time = reserveDto.reserveTimes ?: error("time must not be  null.")
        val userId = reserveDto.userId ?: error("userId must not be null.")

        val userEntity = reserveIsExistByUserIdAndTime(userId, time)
            ?: throw ReserveTimeIsNotExistException("User with userId: $userId does not reserve at $time")

        ReserveEntity()?.apply {
            this.deletionTimestamp = 0
        }.also { reserveRepository.save(it) }

    }

    private fun reserveIsExistByUserIdAndTime(userId: UUID, time: Int): UserEntity? {
        return  reserveRepository.findReserveByTimeAndUserId(userId, time)
    }
}