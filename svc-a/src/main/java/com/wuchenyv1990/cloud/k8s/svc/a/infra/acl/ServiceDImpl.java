package com.wuchenyv1990.cloud.k8s.svc.a.infra.acl;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.ServiceD;
import com.wuchenyv1990.cloud.k8s.svc.common.infra.feign.client.ClientD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDImpl implements ServiceD {

    @Autowired
    private ClientD clientD;

    @Override
    public String queryInfoD() {
        return clientD.queryInfo();
    }

    @Override
    public String queryInfoDSlowly() {
        return clientD.querySlowly();
    }

    @Override
    public String queryInfoDFailRandom() {
        return clientD.queryFailRandom();
    }

}
