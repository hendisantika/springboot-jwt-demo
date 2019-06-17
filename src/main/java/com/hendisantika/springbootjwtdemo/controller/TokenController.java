package com.hendisantika.springbootjwtdemo.controller;

import com.hendisantika.springbootjwtdemo.jwt.JwtGen;
import com.hendisantika.springbootjwtdemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-18
 * Time: 05:36
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGen generator;

    public TokenController(JwtGen generator) {

        this.generator = generator;
    }

    @PostMapping
    public String generate(@RequestBody final User user) {

        return generator.generate(user);
    }

}