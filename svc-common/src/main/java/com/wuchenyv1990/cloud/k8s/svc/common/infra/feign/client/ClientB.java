package com.wuchenyv1990.cloud.k8s.svc.common.infra.feign.client;

import com.wuchenyv1990.cloud.k8s.svc.common.api.dto.BCDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-b", url = "http://${B_SVC_NAME:localhost}:${B_SVC_PORT:8080}")
public interface ClientB {

    @GetMapping("/info")
    BCDTO queryInfo();

    @GetMapping("/info/slowly")
    BCDTO querySlowly();

    @GetMapping("/info/fail")
    BCDTO queryFailRandom();

}
