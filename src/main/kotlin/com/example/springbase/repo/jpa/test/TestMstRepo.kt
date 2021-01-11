package com.example.springbase.repo.jpa.test

import com.example.springbase.model.entity.test.TestMst
import org.springframework.data.jpa.repository.JpaRepository

/**
 * 21.01.11 | gomip | created
 */
interface TestMstRepo : JpaRepository<TestMst, String>{

}