package com.wuchenyv1990.cloud.k8s.svc.common.infra;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients("com.wuchenyv1990.cloud.k8s.svc.common.service.client")
@Configuration
public class FeignConfigutation {
}
