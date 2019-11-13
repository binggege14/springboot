package com.yiyang.entity;

import java.util.Date;

public class Servicetarget {
    private Integer id;

    private Long customerid;

    private Long serviceid;

    private Date start;

    private Date end;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}