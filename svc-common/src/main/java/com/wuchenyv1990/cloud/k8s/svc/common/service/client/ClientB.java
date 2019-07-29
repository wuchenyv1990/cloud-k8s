package com.wuchenyv1990.cloud.k8s.svc.common.service.client;

import com.wuchenyv1990.cloud.k8s.svc.common.domain.dto.BCDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-b", url = "${SVC-B-HOST:localhost}:${SVC-B-PORT:8080}")
public interface ClientB {

    @GetMapping("/info")
    BCDTO getInfo();

    @GetMapping("/info/slowly")
    BCDTO getSlowly();

    @GetMapping("/info/fail")
    BCDTO getFailRandom();

}
