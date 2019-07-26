package com.wuchenyv1990.cloud.k8s.svc.a.service;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.dto.Info;
import com.wuchenyv1990.cloud.k8s.svc.a.domain.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    ClientB clientB;

    @Autowired
    ClientD clientD;

    @Override
    public Info getInfo() {
        return null;
    }

    @Override
    public Info getSlowly() {
        return null;
    }

    @Override
    public Info getFailRandom() {
        return null;
    }

}
