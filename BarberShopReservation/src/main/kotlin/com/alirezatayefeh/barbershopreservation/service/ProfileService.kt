package com.alirezatayefeh.barbershopreservation.service

import com.alirezatayefeh.barbershopreservation.model.Profile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProfileService @Autowired constructor(
    private val profile: Profile
){
    fun getProfile(userId: UUID) {
        TODO("Not yet implemented")
    }

    fun updateProfile(userId: UUID, profile: Profile) {
        TODO("Not yet implemented")
    }
}