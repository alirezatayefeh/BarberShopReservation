package com.alirezatayefeh.barbershopreservation.model

import java.util.UUID

class UserDto(
    uuid: UUID? = null,
    userName: String? = null,
    age: Age? = null,
    role: UserRole? = null,
    userStatus: UserStatus? = null,
    isAdmin: Boolean? = null,
) : UserEntity() {
}