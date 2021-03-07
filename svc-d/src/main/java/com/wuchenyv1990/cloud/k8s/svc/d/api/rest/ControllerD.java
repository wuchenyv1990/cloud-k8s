package com.wuchenyv1990.cloud.k8s.svc.d.api.rest;

import com.wuchenyv1990.cloud.k8s.svc.d.application.ServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerD {

    @Autowired
    private ServiceD serviceD;

    @GetMapping("/info")
    public String getInfo() {
        return serviceD.queryInfoD();
    }

    @GetMapping("/info/slowly")
    public String getSlowly() {
        return serviceD.queryInfoDSlowly();
    }

    @GetMapping("/info/fail")
    public String getFailRandom() {
        return serviceD.queryInfoDFailRandom();
    }

}
