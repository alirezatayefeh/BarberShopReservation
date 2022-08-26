package com.alirezatayefeh.barbershopreservation.controller

import com.alirezatayefeh.barbershopreservation.model.ProfileDto
import com.alirezatayefeh.barbershopreservation.service.ProfileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping(ProfileController.PATH)
class ProfileController @Autowired constructor(
    private val profileService: ProfileService,
) {
    companion object {
        const val PATH = "/edge/v1/profile"
    }

    @GetMapping(value = ["/{uuid}"])
    fun getProfile(@PathVariable("uuid") userId: UUID) {
        profileService.getProfile(userId)
    }

    @PutMapping(value = ["upddate/{uuid}"])
    fun updateProfile(
        @PathVariable("uuid") userId: UUID,
        @RequestBody profileDto: ProfileDto
    ) {
        profileService.updateProfile(userId, profileDto)
    }
}