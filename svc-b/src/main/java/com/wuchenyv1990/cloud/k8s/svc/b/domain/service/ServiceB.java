package com.wuchenyv1990.cloud.k8s.svc.b.domain.service;

import com.wuchenyv1990.cloud.k8s.svc.common.domain.model.BC;

public interface ServiceB {

    BC getInfo();

    BC getSlowly();

    BC getFailRandom();

}
