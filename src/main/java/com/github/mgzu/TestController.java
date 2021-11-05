package com.github.mgzu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaGuangZu
 * @since 2021-11-05
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "hello java 17";
    }
}
