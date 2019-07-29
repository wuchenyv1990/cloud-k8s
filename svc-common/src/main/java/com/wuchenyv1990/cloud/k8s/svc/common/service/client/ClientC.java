package com.wuchenyv1990.cloud.k8s.svc.common.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-c", url = "${SVC-C-HOST:localhost}:${SVC-C-PORT:8080}")
public interface ClientC {

    @GetMapping("/info")
    String getInfo();

    @GetMapping("/info/slowly")
    String getSlowly();

    @GetMapping("/info/fail")
    String getFailRandom();

}
