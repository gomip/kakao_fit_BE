package com.example.springbase.part.dto.com

import java.time.OffsetDateTime

/**
 * 21.01.07 | gomip | created
 */
data class GetUserOut (
        val userId      : String? = null,                                                           // 사용자 아이디
        val userName    : String? = null,                                                           // 사용자 명
        val nickName    : String? = null,                                                           // 별명
        val createUserId: String? = null,                                                           // 생성자 아이디
        val createDt    : OffsetDateTime? = null,                                                   // 생성일시
        val updateUserId: String? = null,                                                           // 수정자 아이디
        val updateDt    : OffsetDateTime? = null                                                    // 수정 일시
)