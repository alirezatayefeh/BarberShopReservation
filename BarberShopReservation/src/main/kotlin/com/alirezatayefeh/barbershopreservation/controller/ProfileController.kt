package com.alirezatayefeh.barbershopreservation.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(ProfileController.PATH)
class ProfileController {
    companion object {
        const val PATH = "/edge/v1/profile"
    }
}