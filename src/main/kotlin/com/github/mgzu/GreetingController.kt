package com.github.mgzu

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
class GreetingController {

    @GetMapping
    fun hello() = "Hello Spring and Kotlin, powered by Quarkus"

    @GetMapping("/{name}")
    fun testForPathVariable(@PathVariable name: String) = """
                Hello Kotlin and Java 17, $name
                """
}
