package com.wuchenyv1990.cloud.k8s.svc.common.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-c", url = "${svc-c-host:localhost}:${svc-c-port:8080}")
public interface ClientC {

    @GetMapping("/info")
    String getInfo();

    @GetMapping("/info/slowly")
    String getSlowly();

    @GetMapping("/info/fail")
    String getFailRandom();

}
