package com.yiyang.entity;

import java.util.Date;

public class Outgoing {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String customerid;

    private String outgoingreason;

    private Date outgongtime;

    private Date expectedreturntime;

    private Date actualreturntime;

    private String escorted;

    private String relation;

    private String escortedtel;

    private String auditstatus;

    private String auditperson;

    private Date audittime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getOutgoingreason() {
        return outgoingreason;
    }

    public void setOutgoingreason(String outgoingreason) {
        this.outgoingreason = outgoingreason == null ? null : outgoingreason.trim();
    }

    public Date getOutgongtime() {
        return outgongtime;
    }

    public void setOutgongtime(Date outgongtime) {
        this.outgongtime = outgongtime;
    }

    public Date getExpectedreturntime() {
        return expectedreturntime;
    }

    public void setExpectedreturntime(Date expectedreturntime) {
        this.expectedreturntime = expectedreturntime;
    }

    public Date getActualreturntime() {
        return actualreturntime;
    }

    public void setActualreturntime(Date actualreturntime) {
        this.actualreturntime = actualreturntime;
    }

    public String getEscorted() {
        return escorted;
    }

    public void setEscorted(String escorted) {
        this.escorted = escorted == null ? null : escorted.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getEscortedtel() {
        return escortedtel;
    }

    public void setEscortedtel(String escortedtel) {
        this.escortedtel = escortedtel == null ? null : escortedtel.trim();
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus == null ? null : auditstatus.trim();
    }

    public String getAuditperson() {
        return auditperson;
    }

    public void setAuditperson(String auditperson) {
        this.auditperson = auditperson == null ? null : auditperson.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }
}