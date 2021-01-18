package com.example.springbase.part.service.test

import com.example.springbase.fwk.base.BaseService
import com.example.springbase.model.entity.test.TestMst
import com.example.springbase.part.dto.test.GetTestOut
import com.example.springbase.part.dto.test.PostTestIn
import com.example.springbase.repo.jpa.test.TestMstRepo
import com.example.springbase.repo.mybatis.test.TestMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 21.01.05 | gomip | created
 * 21.01.11 | gomip | post, delete, patch api 작성
 */
@Service
class TestService : BaseService(){
    @Autowired lateinit var mapper: TestMapper
    @Autowired lateinit var repo: TestMstRepo

    fun testService() : GetTestOut{
        return mapper.selectTestOne()
    }

    fun testPost() : GetTestOut{
//        log.debug("input : $input")
//        var tmp = TestMst()
//        tmp.id = input.id
//        tmp.value = input.value

//        log.debug("tmp : $tmp")
//        repo.saveAndFlush(tmp)

        return mapper.selectTestOne()
//        return mapper.selectTestWithId(input.id)
    }
}