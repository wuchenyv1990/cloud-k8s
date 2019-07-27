package com.wuchenyv1990.cloud.k8s.svc.c.controller;

import com.wuchenyv1990.cloud.k8s.svc.c.domain.service.ServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerC {

    @Autowired
    ServiceC serviceC;

    @GetMapping("/info")
    public String getInfo() {
        return serviceC.getInfo();
    }

    @GetMapping("/info/slowly")
    public String getSlowly() {
        return serviceC.getSlowly();
    }

    @GetMapping("/info/fail")
    public String getFailRandom() {
        return serviceC.getFailRandom();
    }

}
