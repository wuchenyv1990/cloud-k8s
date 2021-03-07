package com.wuchenyv1990.cloud.k8s.svc.a.application.impl;

import com.wuchenyv1990.cloud.k8s.svc.a.application.InfoService;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.entity.Info;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.ServiceB;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.ServiceD;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    public static final String RLT = "svc-a";
    @Autowired
    private ServiceB serviceB;

    @Autowired
    private ServiceD serviceD;

    @Override
    public Info query() {
        BC bc = serviceB.queryInfoBC();
        String d = serviceD.queryInfoD();
        return Info.buildInfo(bc, d);
    }

    @Override
    public Info querySlowly() {
        BC bc = serviceB.queryInfoBCSlowly();
        String d = serviceD.queryInfoDSlowly();
        return Info.buildInfo(bc, d);
    }

    @Override
    public Info queryFailRandom() {
        BC bc = serviceB.queryInfoBCFailRandom();
        String d = serviceD.queryInfoDFailRandom();
        return Info.buildInfo(bc, d);
    }

}
