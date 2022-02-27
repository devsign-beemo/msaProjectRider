package com.clone.rider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
public class RiderController {

    @GetMapping("/riderTest")
    private String testApi() {
        return "hello rider";
    }

    @GetMapping("/matching")
    private String riderMatching() {
        //find rider
        //rider push
        return "riderMatching";
    }

    @PostMapping("/changeStatus")
    private String changePickupStatus() {

        //pickup 상태
        //배달완료 상태
        return "pickupStateChange";
    }

    @PostMapping("/selectOrder")
    private String selectOrder() {
        return "selectOrder";
    }
}
