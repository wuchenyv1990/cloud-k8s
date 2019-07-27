package com.wuchenyv1990.cloud.k8s.svc.d.service;

import com.wuchenyv1990.cloud.k8s.svc.common.service.util.RandomUtil;
import com.wuchenyv1990.cloud.k8s.svc.d.domain.service.ServiceD;
import org.springframework.stereotype.Service;

@Service
public class ServiceDImpl implements ServiceD {

    private static final String RLT = "svc-d";

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
