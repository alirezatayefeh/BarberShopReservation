package com.alirezatayefeh.barbershopreservation.repository

import com.alirezatayefeh.barbershopreservation.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<UserEntity, Int> {
}