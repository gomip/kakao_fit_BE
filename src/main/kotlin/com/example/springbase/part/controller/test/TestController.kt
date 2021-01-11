package com.example.springbase.part.controller.test

import com.example.springbase.fwk.base.BaseController
import com.example.springbase.part.dto.test.GetTestOut
import com.example.springbase.part.dto.test.PostTestIn
import com.example.springbase.part.service.test.TestService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * 21.01.05 | gomip | created
 * 21.01.11 | gomip | post, delete, patch api 작성
 */

@RestController
@RequestMapping("/test")
@Api("테스트 컨트롤러")
class TestController : BaseController(){
    @Autowired lateinit var service: TestService

    @GetMapping
    @ApiOperation("테스트 api - get")
    fun testController() : GetTestOut {
        return service.testService()
    }

    @PostMapping
    @ApiOperation("테스트 api - post")
    fun testPostController(@RequestBody input: PostTestIn) : GetTestOut{
        return service.testPost(input)
    }
}