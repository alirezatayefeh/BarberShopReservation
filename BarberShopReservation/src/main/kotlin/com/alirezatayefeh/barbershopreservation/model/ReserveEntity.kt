package com.alirezatayefeh.barbershopreservation.model

import com.sun.istack.NotNull
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
@Table(name = "reserve")
class ReserveEntity {
    @Id
    var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "uuid")
    open var userEnt: UserEntity? = null

    @Column
    open var reserveTime: Int? = null

    @NotNull
    @javax.persistence.Column(name = "deletion_timestamp")
    open var deletionTimestamp: Long = 0L


    fun toDto(): ReserveDto {
        val reserveEntity = this
        return ReserveDto().apply {
            this.userEntity = reserveEntity.userEnt
            this.reserveTimes = reserveEntity.reserveTime
        }
    }
}