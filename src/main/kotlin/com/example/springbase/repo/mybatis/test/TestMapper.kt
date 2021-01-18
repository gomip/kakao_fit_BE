package com.example.springbase.repo.mybatis.test

import com.example.springbase.part.dto.test.GetTestOut
import com.example.springbase.part.dto.test.PostTestIn
import org.springframework.stereotype.Repository

/**
 * 21.01.05 | gomip | created
 * 21.01.11 | gomip | post, delete, patch api 작성
 */

@Repository
interface TestMapper{
    fun selectTestOne(): GetTestOut
    fun selectTestWithId(id: String) : GetTestOut
}