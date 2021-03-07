package com.wuchenyv1990.cloud.k8s.svc.a.domain.service;

import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;

public interface ServiceB {

    BC queryInfoBC();

    BC queryInfoBCSlowly();

    BC queryInfoBCFailRandom();

}
