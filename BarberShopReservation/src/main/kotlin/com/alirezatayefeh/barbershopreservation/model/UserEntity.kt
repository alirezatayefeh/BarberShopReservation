package com.alirezatayefeh.barbershopreservation.model

import org.hibernate.annotations.ColumnDefault
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity {
    @Id
    val uuid: UUID? = null

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
}