package com.alirezatayefeh.barbershopreservation.exception.base

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
open class BadRequestException : Exception {
    private val statusCode: Int

    constructor(statusCode: Int = 400) {
        this.statusCode = statusCode
    }

}