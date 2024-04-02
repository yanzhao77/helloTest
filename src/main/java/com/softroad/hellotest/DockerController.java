package com.softroad.hellotest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        log.info("Hello Docker!");
        return "Hello Docker!";
    }
}
