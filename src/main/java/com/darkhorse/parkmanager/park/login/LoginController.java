package com.darkhorse.parkmanager.park.login;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darkhorse.parkmanager.config.service.TokenService;

@RestController
@RequestMapping("api/login")
public class LoginController {

    private final TokenService tokenService;

    public LoginController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("")
    public String getToken(Authentication authentication) {
        return tokenService.generateToken(authentication);
    }
}
