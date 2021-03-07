package com.wuchenyv1990.cloud.k8s.svc.a.domain.entity;

import com.wuchenyv1990.cloud.k8s.svc.a.application.impl.InfoServiceImpl;
import com.wuchenyv1990.cloud.k8s.svc.common.domain.entity.BC;

public class Info {

    private String a;

    private String b;

    private String c;

    private String d;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public static Info buildInfo(BC bc, String d) {
        Info info = new Info();
        info.setA(InfoServiceImpl.RLT);
        info.setB(bc.getB());
        info.setC(bc.getC());
        info.setD(d);
        return info;
    }

}
