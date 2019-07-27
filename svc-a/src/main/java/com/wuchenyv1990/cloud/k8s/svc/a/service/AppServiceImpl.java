package com.wuchenyv1990.cloud.k8s.svc.a.service;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.model.Info;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.AppService;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.model.BC;
import com.wuchenyv1990.cloud.k8s.svc.common.service.client.ClientB;
import com.wuchenyv1990.cloud.k8s.svc.common.service.client.ClientD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    private static final String RLT = "svc-a";

    @Autowired
    ClientB clientB;

    @Autowired
    ClientD clientD;


    @Override
    public Info getInfo() {
        BC bc = clientB.getInfo().toBC();
        String d = clientD.getInfo();
        return buildInfo(bc, d);
    }

    @Override
    public Info getSlowly() {
        BC bc = clientB.getSlowly().toBC();
        String d = clientD.getSlowly();
        return buildInfo(bc, d);
    }

    @Override
    public Info getFailRandom() {
        BC bc = clientB.getFailRandom().toBC();
        String d = clientD.getFailRandom();
        return buildInfo(bc, d);
    }

    private Info buildInfo(BC bc, String d) {
        Info info = new Info();
        info.setA(RLT);
        info.setB(bc.getB());
        info.setC(bc.getC());
        info.setD(d);
        return info;
    }
}
