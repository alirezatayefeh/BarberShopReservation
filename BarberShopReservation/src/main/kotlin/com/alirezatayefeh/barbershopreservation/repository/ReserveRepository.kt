package com.alirezatayefeh.barbershopreservation.repository

import com.alirezatayefeh.barbershopreservation.model.UserEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ReserveRepository : JpaRepository<UserEntity, Int> {

    @Query("from UserEntity u where u.uuid = :userId and u.deletionTimestamp = 0")
    fun findReserveTimeBYUserId(userId: UUID, pageable: Pageable): UserEntity?

    @Query("from UserEntity u where u.reserveTime = :time and u.deletionTimestamp = 0")
    fun findReserveByTime(time: Int): UserEntity?
}