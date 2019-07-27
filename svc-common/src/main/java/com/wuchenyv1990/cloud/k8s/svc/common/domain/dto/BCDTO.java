package com.wuchenyv1990.cloud.k8s.svc.common.domain.dto;

import com.wuchenyv1990.cloud.k8s.svc.common.domain.model.BC;

public class BCDTO {

    private String b;

    private String c;

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

    public static BCDTO fromBC(BC bc) {
        BCDTO dto = new BCDTO();
        dto.setB(bc.getB());
        dto.setC(bc.getC());
        return dto;
    }

    public BC toBC() {
        BC bc = new BC();
        bc.setB(this.getB());
        bc.setC(this.getC());
        return bc;
    }

}
