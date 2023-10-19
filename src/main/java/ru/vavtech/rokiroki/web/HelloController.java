package ru.vavtech.rokiroki.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {

    @GetMapping()
    public ResponseEntity<String> getEmployee() {
        return ResponseEntity.ok("Hello World!!!");
    }
}
