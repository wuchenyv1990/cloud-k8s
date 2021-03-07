package com.wuchenyv1990.cloud.k8s.svc.c.application.impl;

import com.wuchenyv1990.cloud.k8s.svc.c.application.ServiceC;
import com.wuchenyv1990.cloud.k8s.svc.common.util.RandomUtil;
import org.springframework.stereotype.Service;

@Service
public class ServiceCImpl implements ServiceC {

    private static final String RLT = "svc-c";

    @Override
    public String queryInfoC() {
        return RLT;
    }

    @Override
    public String queryInfoCSlowly() {
        return RandomUtil.returnAfter(() -> RLT, 5);
    }

    @Override
    public String queryInfoCFailRandom() {
        return RandomUtil.returnMayThrowExp(() -> RLT);
    }

}
