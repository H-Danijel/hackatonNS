package com.ey.hackaton.nssmart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

    /**
     * @return test hello
     */
    @GetMapping("/hello")
    public String hello(){
            return "hello";
    }

}
