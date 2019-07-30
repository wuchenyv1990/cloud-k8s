package com.wuchenyv1990.cloud.k8s.svc.common.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-d", url = "http://${D_SVC_NAME:localhost}:${D_SVC_PORT:8080}")
public interface ClientD {

    @GetMapping("/info")
    String getInfo();

    @GetMapping("/info/slowly")
    String getSlowly();

    @GetMapping("/info/fail")
    String getFailRandom();

}
