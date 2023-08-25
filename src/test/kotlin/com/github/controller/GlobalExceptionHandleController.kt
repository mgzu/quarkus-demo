package com.github.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author MaGuangZu
 * @since 2021-11-05
 */
@RestController
@RequestMapping("/exception")
class GlobalExceptionHandleController {

    @GetMapping("handle")
    fun handle(): String {
        throw Exception("test")
    }

}
