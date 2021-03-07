package com.wuchenyv1990.cloud.k8s.svc.a.infra.acl;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.ServiceB;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;
import com.wuchenyv1990.cloud.k8s.svc.common.infra.feign.client.ClientB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {

    @Autowired
    private ClientB clientB;

    @Override
    public BC queryInfoBC() {
        return clientB.queryInfo().toBC();
    }

    @Override
    public BC queryInfoBCSlowly() {
        return clientB.querySlowly().toBC();
    }

    @Override
    public BC queryInfoBCFailRandom() {
        return clientB.queryFailRandom().toBC();
    }
}
