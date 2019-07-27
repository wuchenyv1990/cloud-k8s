package com.wuchenyv1990.cloud.k8s.svc.d.controller;

import com.wuchenyv1990.cloud.k8s.svc.d.domain.service.ServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerD {

    @Autowired
    ServiceD serviceD;

    @GetMapping("/info")
    public String getInfo() {
        return serviceD.getInfo();
    }

    @GetMapping("/info/slowly")
    public String getSlowly() {
        return serviceD.getSlowly();
    }

    @GetMapping("/info/fail")
    public String getFailRandom() {
        return serviceD.getFailRandom();
    }

}
