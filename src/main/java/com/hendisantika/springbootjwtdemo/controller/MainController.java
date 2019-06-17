package com.hendisantika.springbootjwtdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-18
 * Time: 05:35
 */
@RestController
@RequestMapping("/index")
public class MainController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> index() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("message", "Authenticated and authorised successfully !");
        map.put("result", "success!");

        return map;
    }

}