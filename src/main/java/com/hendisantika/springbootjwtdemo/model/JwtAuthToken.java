package com.hendisantika.springbootjwtdemo.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-17
 * Time: 20:52
 */
public class JwtAuthToken extends UsernamePasswordAuthenticationToken {

    private String token;

    public JwtAuthToken(String token) {
        super(null, null);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public Object getCredentials() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getPrincipal() {
        // TODO Auto-generated method stub
        return null;
    }

}