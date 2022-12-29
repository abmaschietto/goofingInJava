package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1")
public class GetTest {

    @GetMapping(value = "/teste")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok().body("Teste com sucesso!");
    }
}
