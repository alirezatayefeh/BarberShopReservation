package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.repository.BlackUserNameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BlackUserNameService @Autowired constructor(
    private val blackUserNameRepository: BlackUserNameRepository,
) {
    fun getAllBlackNameService(offset: Int, limit: Int) {
        TODO("Not yet implemented")
    }
}