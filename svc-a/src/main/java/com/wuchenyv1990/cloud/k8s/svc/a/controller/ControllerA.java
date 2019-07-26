package com.wuchenyv1990.cloud.k8s.svc.a.controller;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    @Autowired
    AppService appService;




}
