package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SettingsService @Autowired constructor(
    private val userRepository: UserRepository,
) {
}