package com.wuchenyv1990.cloud.k8s.svc.b.controller;

import com.wuchenyv1990.cloud.k8s.svc.b.domain.service.ServiceB;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.dto.BCDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @Autowired
    ServiceB serviceB;

    @GetMapping("/info")
    public BCDTO getInfo() {
        return BCDTO.fromBC(serviceB.getInfo());
    }

    @GetMapping("/info/slowly")
    public BCDTO getSlowly() {
        return BCDTO.fromBC(serviceB.getSlowly());
    }

    @GetMapping("/info/fail")
    public BCDTO getFailRandom() {
        return BCDTO.fromBC(serviceB.getFailRandom());
    }

}
