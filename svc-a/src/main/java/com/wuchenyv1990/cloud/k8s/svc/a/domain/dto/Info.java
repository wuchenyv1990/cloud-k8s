package com.wuchenyv1990.cloud.k8s.svc.a.domain.dto;

public class Info {

    private String aInfo;

    private String bInfo;

    private String cInfo;

    private String dInfo;

    public String getaInfo() {
        return aInfo;
    }

    public void setaInfo(String aInfo) {
        this.aInfo = aInfo;
    }

    public String getbInfo() {
        return bInfo;
    }

    public void setbInfo(String bInfo) {
        this.bInfo = bInfo;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    public String getdInfo() {
        return dInfo;
    }

    public void setdInfo(String dInfo) {
        this.dInfo = dInfo;
    }

    @Override
    public String toString() {
        return "InfoDTO{" +
                "aInfo='" + aInfo + '\'' +
                ", bInfo='" + bInfo + '\'' +
                ", cInfo='" + cInfo + '\'' +
                ", dInfo='" + dInfo + '\'' +
                '}';
    }
}
