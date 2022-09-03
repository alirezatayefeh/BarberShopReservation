package com.alirezatayefeh.barbershopreservation.model

import com.sun.istack.NotNull
import org.hibernate.annotations.ColumnDefault
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
open class UserEntity: Serializable {
    @Id
    var uuid: UUID? = null

    @Column
    open var userName: String? = null

    @Column
    @Enumerated(EnumType.STRING)
    open var age: Age? = null

    @Column
    @Enumerated(EnumType.STRING)
    open var role: UserRole? = null

    @Column
    @Enumerated(EnumType.STRING)
    open var userStatus: UserStatus? = null

    @Column
    @ColumnDefault("false")
    open var isAdmin: Boolean? = false

    @Column
    open var phoneNumber: String? = null

    @Column
    open var password: String? = null

    @Column
    open var reserveTime: Int? = null

    @OneToMany(mappedBy = "reserveTime")
    open var user: MutableList<ReserveEntity>? = null

    @NotNull
    @Column(name = "deletion_timestamp")
    open var deletionTimestamp: Long = 0L

    fun toDto(): UserDto {
        val userEntity = this
        return UserDto().apply {
            this.uuid = userEntity.uuid
            this.userName = userEntity.userName
            this.age = userEntity.age
            this.role = userEntity.role
            this.userStatus = userEntity.userStatus
            this.isAdmin = userEntity.isAdmin
        }
    }
}