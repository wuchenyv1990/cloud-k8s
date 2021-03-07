package com.wuchenyv1990.cloud.k8s.svc.b.api.rest;

import com.wuchenyv1990.cloud.k8s.svc.b.application.InfoService;
import com.wuchenyv1990.cloud.k8s.svc.common.api.dto.BCDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public BCDTO getInfo() {
        return BCDTO.fromBC(infoService.queryInfoBC());
    }

    @GetMapping("/info/slowly")
    public BCDTO getSlowly() {
        return BCDTO.fromBC(infoService.queryInfoBCSlowly());
    }

    @GetMapping("/info/fail")
    public BCDTO getFailRandom() {
        return BCDTO.fromBC(infoService.queryInfoBCFailRandom());
    }

}
