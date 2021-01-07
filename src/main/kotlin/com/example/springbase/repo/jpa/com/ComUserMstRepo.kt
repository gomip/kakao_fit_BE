package com.example.springbase.repo.jpa.com

import com.example.springbase.model.entity.com.ComUserMst
import org.springframework.data.jpa.repository.JpaRepository

/**
 * 21.01.07 | gomip | created
 */

interface ComUserMstRepo : JpaRepository<ComUserMst, String> {
}