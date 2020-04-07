package com.example.webflux;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author lanruqi
 * @date 2020/4/7
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("hello hello~");
    }
}
