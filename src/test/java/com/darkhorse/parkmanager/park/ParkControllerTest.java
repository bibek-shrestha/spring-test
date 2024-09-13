package com.darkhorse.parkmanager.park;

import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import com.darkhorse.parkmanager.config.SecurityConfig;
import com.darkhorse.parkmanager.config.service.TokenService;
import com.darkhorse.parkmanager.park.login.LoginController;

@WebMvcTest({ParkController.class, LoginController.class})
@Import({SecurityConfig.class, TokenService.class})
public class ParkControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void whenUnauthenticatedThen401() throws Exception {
        this.mvc.perform(get("/api/parks"))
            .andExpect(status().isUnauthorized());
    }

}
