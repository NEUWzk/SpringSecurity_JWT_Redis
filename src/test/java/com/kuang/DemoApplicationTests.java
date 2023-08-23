package com.kuang;

import com.kuang.config.JwtUtil;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() throws Exception {
        Claims claims = JwtUtil.parseJWT("eyJhbGciOiJIUzI1NiJ9." +
                "eyJqdGkiOiIxM2FkNzA3NTExZDc0MDZiYThkZWM2OGM4MDMxMGFhMCIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY5Mjc2MDQzNCwiZXhwIjoxNjk2MzYwNDM0fQ.2x1jzTawn3Kl4XzGhsV7GJbLBjsJJtsztPVmGjD6_oA");
        System.out.println(claims.getSubject());
    }

}
