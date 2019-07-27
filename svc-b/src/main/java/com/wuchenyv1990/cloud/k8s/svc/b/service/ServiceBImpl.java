package com.wuchenyv1990.cloud.k8s.svc.b.service;

import com.wuchenyv1990.cloud.k8s.svc.b.domain.service.ServiceB;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.model.BC;
import com.wuchenyv1990.cloud.k8s.svc.common.service.client.ClientC;
import com.wuchenyv1990.cloud.k8s.svc.common.service.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {

    private static final String RLT = "svc-b";

    @Autowired
    ClientC clientC;

    @Override
    public BC getInfo() {
        return new BC(RLT, clientC.getInfo());
    }

    @Override
    public BC getSlowly() {
        return new BC(RandomUtil.returnAfter(() ->RLT, 5), clientC.getInfo());
    }

    @Override
    public BC getFailRandom() {
        return new BC(RandomUtil.returnMayThrowExp(() ->RLT), clientC.getInfo());
    }

}
