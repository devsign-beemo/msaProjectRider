package com.clone.rider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiderController {


    @GetMapping("riderTest")
    private String testApi() {
        return "hello rider";
    }

    @PostMapping("rider/matching")
    private String riderMatching() {
        return "";
    }

}
