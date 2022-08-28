package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.repository.AdminRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService @Autowired constructor(
    private val adminRepository: AdminRepository,
) {
    fun getAllReserveTimes(offset: Int, limit: Int) {
        TODO("Not yet implemented")
    }

    fun openShop() {
        TODO("Not yet implemented")
    }

    fun closeShop() {
        TODO("Not yet implemented")
    }
}