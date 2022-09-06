package com.alirezatayefeh.barbershopreservation.repository

import com.alirezatayefeh.barbershopreservation.model.ReserveEntity
import com.alirezatayefeh.barbershopreservation.model.UserEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ReserveRepository : JpaRepository<ReserveEntity, Int> {

    @Query("from ReserveEntity r join r.userEnt u where u.uuid = :userId and r.deletionTimestamp = 0")
    fun findReserveTimeBYUserId(userId: UUID, pageable: Pageable): List<UserEntity>

    @Query("from ReserveEntity r join r.userEnt u where u.uuid = :userId and r.reserveTime = :time and r.deletionTimestamp = 0")
    fun findReserveByTimeAndUserId(userId: UUID, time: Int): UserEntity?
}