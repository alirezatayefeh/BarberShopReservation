package com.alirezatayefeh.barbershopreservation.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(SettingsController.PATH)
class SettingsController {
    companion object {
        const val PATH = "/edge/v1/settings"
    }
}