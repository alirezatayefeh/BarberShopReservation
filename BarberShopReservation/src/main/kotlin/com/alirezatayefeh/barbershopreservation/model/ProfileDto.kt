package com.alirezatayefeh.barbershopreservation.model

import java.io.Serializable
import java.util.UUID

class ProfileDto : Serializable {
    var uuid: UUID? = null
    var phoneNumber: String? = null
    var userName: String? = null
    var gender: Gender? = null
    var isAdmin: Boolean? = null

    fun validate(userId: UUID) {
        if (userName.isNullOrBlank() || userName.isNullOrEmpty() || userName!!.length > 30)
            throw Exception()

        userName?.let {  }
    }
}