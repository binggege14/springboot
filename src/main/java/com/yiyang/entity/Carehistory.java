package com.yiyang.entity;

public class Carehistory {
    private Long customid;

    private Long serviceid;

    private String time;

    private String detial;

    private Integer servicenumber;

    private Long nurseid;

    public Long getCustomid() {
        return customid;
    }

    public void setCustomid(Long customid) {
        this.customid = customid;
    }

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getDetial() {
        return detial;
    }

    public void setDetial(String detial) {
        this.detial = detial == null ? null : detial.trim();
    }

    public Integer getServicenumber() {
        return servicenumber;
    }

    public void setServicenumber(Integer servicenumber) {
        this.servicenumber = servicenumber;
    }

    public Long getNurseid() {
        return nurseid;
    }

    public void setNurseid(Long nurseid) {
        this.nurseid = nurseid;
    }
}