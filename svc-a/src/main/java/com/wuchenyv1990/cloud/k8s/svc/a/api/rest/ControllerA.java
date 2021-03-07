package com.wuchenyv1990.cloud.k8s.svc.a.api.rest;

import com.wuchenyv1990.cloud.k8s.svc.a.api.dto.InfoDTO;
import com.wuchenyv1990.cloud.k8s.svc.a.application.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public InfoDTO queryInfo() {
        return InfoDTO.fromInfo(infoService.query());
    }

    @GetMapping("/info/slowly")
    public InfoDTO queryInfoSlowly() {
        return InfoDTO.fromInfo(infoService.querySlowly());
    }

    @GetMapping("/info/fail")
    public InfoDTO queryInfoFailRandom() {
        return InfoDTO.fromInfo(infoService.queryFailRandom());
    }

}
