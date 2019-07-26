package com.wuchenyv1990.cloud.k8s.svc.a.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${svc-b-host}:${svc-b-port:8080}")
public interface ClientB {
}
