package com.github.mgzu

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
class GreetingController {

    @GetMapping
    fun hello() = "Hello Spring"

    @GetMapping("/{name}")
    fun testForPathVariable(@PathVariable name: String) = """
                hello java 17, $name
                """
}
