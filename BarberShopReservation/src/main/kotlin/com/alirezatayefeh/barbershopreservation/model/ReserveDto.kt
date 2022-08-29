package com.alirezatayefeh.barbershopreservation.model

import java.io.Serializable
import java.util.UUID

class ReserveDto : Serializable {
    var reserveTimes: Int? = null
    var userId: UUID? = null
}