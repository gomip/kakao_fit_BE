package com.example.springbase.repo.mybatis.com

import com.example.springbase.part.dto.com.GetUserOut
import org.springframework.stereotype.Repository

/**
 * 21.01.07 | gomip | created
 */

@Repository
interface UserMapper {
    fun selectUser() : List<GetUserOut>
}