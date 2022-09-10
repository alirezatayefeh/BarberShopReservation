package com.alirezatayefeh.barbershopreservation.repository

import com.alirezatayefeh.barbershopreservation.model.ReserveEntity
import com.alirezatayefeh.barbershopreservation.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface AdminRepository : JpaRepository<ReserveEntity, Int>{
    @Query("from ReserveEntity r where r.deletionTimestamp = 0")
    fun findReserveTime(): List<UserEntity>
}