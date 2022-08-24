package com.alirezatayefeh.barbershopreservation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(AdminController.PATH)
class AdminController {
    companion object {
        const val PATH = "/edge/v1/admin"
    }
}