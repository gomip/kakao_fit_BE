package com.example.springbase.model.entity.com

import java.io.Serializable
import java.time.OffsetDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * 21.01.07 | gomip | created
 */

@Entity
@Table(name = "com_user_mst")
data class ComUserMst (
    @Id
    var userId      : String = "",
    var userName    : String = "",
    var nickName    : String = "",
    var createUserId: String? = null,
    var createDt    : OffsetDateTime? = null,
    var updateUserId: String? = null,
    var updateDt    : OffsetDateTime? = null
) : Serializable