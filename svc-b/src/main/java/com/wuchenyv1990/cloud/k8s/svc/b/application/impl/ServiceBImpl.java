package com.wuchenyv1990.cloud.k8s.svc.b.application.impl;

import com.wuchenyv1990.cloud.k8s.svc.b.application.InfoService;
import com.wuchenyv1990.cloud.k8s.svc.b.domain.service.ServiceC;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;
import com.wuchenyv1990.cloud.k8s.svc.common.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements InfoService {

    private static final String RLT = "svc-b";

    @Autowired
    private ServiceC serviceC;

    @Override
    public BC queryInfoBC() {
        return new BC(RLT, serviceC.queryInfoC());
    }

    @Override
    public BC queryInfoBCSlowly() {
        return new BC(RandomUtil.returnAfter(() ->RLT, 5), serviceC.queryInfoCSlowly());
    }

    @Override
    public BC queryInfoBCFailRandom() {
        return new BC(RandomUtil.returnMayThrowExp(() ->RLT), serviceC.queryInfoCFailRandom());
    }

}
