package com.api.oauth.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthController {

    @GetMapping("/hello")
    public ResponseEntity<String> authTest() {
        return ResponseEntity.ok("Hello Ok");
    }

    @PostMapping("/postHello")
    public ResponseEntity<String> postHello() {
        return ResponseEntity.ok("Post Hello");
    }


}
