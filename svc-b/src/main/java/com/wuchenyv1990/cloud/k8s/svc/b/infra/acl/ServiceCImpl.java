package com.wuchenyv1990.cloud.k8s.svc.b.infra.acl;

import com.wuchenyv1990.cloud.k8s.svc.b.domain.service.ServiceC;
import com.wuchenyv1990.cloud.k8s.svc.common.infra.feign.client.ClientC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCImpl implements ServiceC {

    @Autowired
    private ClientC clientC;

    @Override
    public String queryInfoC() {
        return clientC.queryInfo();
    }

    @Override
    public String queryInfoCSlowly() {
        return clientC.querySlowly();
    }

    @Override
    public String queryInfoCFailRandom() {
        return clientC.queryFailRandom();
    }
}
