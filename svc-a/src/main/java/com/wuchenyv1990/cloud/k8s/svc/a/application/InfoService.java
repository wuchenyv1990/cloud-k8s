package com.wuchenyv1990.cloud.k8s.svc.a.application;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.entity.Info;

public interface InfoService {

    Info query();

    Info querySlowly();

    Info queryFailRandom();

}
