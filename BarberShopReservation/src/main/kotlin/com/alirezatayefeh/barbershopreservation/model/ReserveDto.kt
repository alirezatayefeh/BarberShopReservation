package com.alirezatayefeh.barbershopreservation.model

import java.io.Serializable

class ReserveDto : Serializable {
    var reserveTimes: Int? = null
    var userEntity: UserEntity? = null
}