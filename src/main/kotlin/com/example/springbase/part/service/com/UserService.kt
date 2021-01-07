package com.example.springbase.part.service.com

import com.example.springbase.fwk.base.BaseService
import com.example.springbase.repo.jpa.com.ComUserMstRepo
import com.example.springbase.model.entity.com.ComUserMst
import com.example.springbase.repo.mybatis.com.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 21.01.07 | gomip | created
 */

@Service
class UserService : BaseService(){
    @Autowired lateinit var mapper : UserMapper
    @Autowired lateinit var repo : ComUserMstRepo

    // 사용자 조회
    fun getUser() : List<ComUserMst> {
        return repo.findAll()
    }
}