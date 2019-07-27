package com.wuchenyv1990.cloud.k8s.svc.a.domain.service;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.model.Info;

public interface AppService {

    Info getInfo();

    Info getSlowly();

    Info getFailRandom();

}
