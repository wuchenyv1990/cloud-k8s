package com.wuchenyv1990.cloud.k8s.svc.c.service;

import com.wuchenyv1990.cloud.k8s.svc.c.domain.service.ServiceC;
import com.wuchenyv1990.cloud.k8s.svc.common.service.util.RandomUtil;
import org.springframework.stereotype.Service;

@Service
public class ServiceCImpl implements ServiceC {

    private static final String RLT = "svc-c";

    @Override
    public String getInfo() {
        return RLT;
    }

    @Override
    public String getSlowly() {
        return RandomUtil.returnAfter(() -> RLT, 5);
    }

    @Override
    public String getFailRandom() {
        return RandomUtil.returnMayThrowExp(() -> RLT);
    }

}
