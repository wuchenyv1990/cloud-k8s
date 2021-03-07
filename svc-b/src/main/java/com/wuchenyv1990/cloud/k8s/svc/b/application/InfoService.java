package com.wuchenyv1990.cloud.k8s.svc.b.application;

import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;

public interface InfoService {

    BC queryInfoBC();

    BC queryInfoBCSlowly();

    BC queryInfoBCFailRandom();

}
