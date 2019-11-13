package com.yiyang.entity;

import java.util.Date;

public class Checkin {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String customername;

    private Integer customerage;

    private String customersex;

    private String idcard;

    private String roomid;

    private String buildingid;

    private String recordid;

    private String eldertype;

    private Date checktime;

    private Date duetime;

    private String phone;

    private String bedid;

    private String psychocs;

    private String attention;

    private Date borntime;

    private String height;

    private String maritalstatus;

    private String weight;

    private String bloodtype;

    private String filepath;

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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Integer getCustomerage() {
        return customerage;
    }

    public void setCustomerage(Integer customerage) {
        this.customerage = customerage;
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(String buildingid) {
        this.buildingid = buildingid == null ? null : buildingid.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getEldertype() {
        return eldertype;
    }

    public void setEldertype(String eldertype) {
        this.eldertype = eldertype == null ? null : eldertype.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getDuetime() {
        return duetime;
    }

    public void setDuetime(Date duetime) {
        this.duetime = duetime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBedid() {
        return bedid;
    }

    public void setBedid(String bedid) {
        this.bedid = bedid == null ? null : bedid.trim();
    }

    public String getPsychocs() {
        return psychocs;
    }

    public void setPsychocs(String psychocs) {
        this.psychocs = psychocs == null ? null : psychocs.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public Date getBorntime() {
        return borntime;
    }

    public void setBorntime(Date borntime) {
        this.borntime = borntime;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus == null ? null : maritalstatus.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }
}