package com.wuchenyv1990.cloud.k8s.svc.d.application.impl;

import com.wuchenyv1990.cloud.k8s.svc.common.util.RandomUtil;
import com.wuchenyv1990.cloud.k8s.svc.d.application.ServiceD;
import org.springframework.stereotype.Service;

@Service
public class ServiceDImpl implements ServiceD {

    private static final String RLT = "svc-d";

    @Override
    public String queryInfoD() {
        return RLT;
    }

    @Override
    public String queryInfoDSlowly() {
        return RandomUtil.returnAfter(() -> RLT, 5);
    }

    @Override
    public String queryInfoDFailRandom() {
        return RandomUtil.returnMayThrowExp(() -> RLT);
    }

}
