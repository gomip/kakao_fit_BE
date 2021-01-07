package com.example.springbase.part.controller.com

import com.example.springbase.fwk.base.BaseController
import com.example.springbase.part.service.com.UserService
import com.example.springbase.model.entity.com.ComUserMst
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 21.01.07 | gomip | created
 */

@RestController
@RequestMapping("/user")
@Api("사용자 컨트롤로")
class UserController : BaseController() {
    @Autowired lateinit var service: UserService

    @GetMapping
    @ApiOperation("사용자 조회")
    fun getUser() : List<ComUserMst> {
        return service.getUser()
    }
}