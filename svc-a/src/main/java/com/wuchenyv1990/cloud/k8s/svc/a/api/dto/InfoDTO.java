package com.wuchenyv1990.cloud.k8s.svc.a.api.dto;

import com.wuchenyv1990.cloud.k8s.svc.a.domain.entity.Info;

public class InfoDTO {

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

    @Override
    public String toString() {
        return "InfoDTO{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public static InfoDTO fromInfo(Info info) {
        InfoDTO dto = new InfoDTO();
        dto.setA(info.getA());
        dto.setB(info.getB());
        dto.setC(info.getC());
        dto.setD(info.getD());
        return dto;

    }
}
