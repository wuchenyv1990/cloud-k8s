package com.wuchenyv1990.cloud.k8s.svc.c.api.rest;

import com.wuchenyv1990.cloud.k8s.svc.c.application.ServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerC {

    @Autowired
    private ServiceC serviceC;

    @GetMapping("/info")
    public String getInfo() {
        return serviceC.queryInfoC();
    }

    @GetMapping("/info/slowly")
    public String getSlowly() {
        return serviceC.queryInfoCSlowly();
    }

    @GetMapping("/info/fail")
    public String getFailRandom() {
        return serviceC.queryInfoCFailRandom();
    }

}
