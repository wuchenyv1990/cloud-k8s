package com.wuchenyv1990.cloud.k8s.svc.a.controller;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.dto.InfoDTO;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    @Autowired
    AppService appService;

    @GetMapping("/info")
    public InfoDTO getInfo() {
        return InfoDTO.fromInfo(appService.getInfo());
    }

    @GetMapping("/info/slowly")
    public InfoDTO getSlowly() {
        return InfoDTO.fromInfo(appService.getSlowly());
    }

    @GetMapping("/info/fail")
    public InfoDTO getFailRandom() {
        return InfoDTO.fromInfo(appService.getFailRandom());
    }

}
