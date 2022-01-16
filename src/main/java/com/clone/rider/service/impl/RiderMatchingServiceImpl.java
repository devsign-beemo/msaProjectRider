package com.clone.rider.service.impl;

import com.clone.rider.service.RiderMatchingService;
import org.springframework.stereotype.Service;

@Service
public class RiderMatchingServiceImpl implements RiderMatchingService {


    @Override
    public String findRider() {
        return "find rider";
    }

}
