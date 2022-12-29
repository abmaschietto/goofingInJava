package com.example.demo.controllers;

import com.example.demo.models.Activity;
import com.example.demo.repositories.feign.BoredApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("v1")
public class GetTest {

    private final BoredApi boredApi;

    @GetMapping(value = "/teste")
    public ResponseEntity<Activity> teste(){
        return ResponseEntity.ok().body(boredApi.getActivity());
    }
}
