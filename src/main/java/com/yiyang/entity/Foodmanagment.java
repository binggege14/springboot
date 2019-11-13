package com.yiyang.entity;

import java.util.Date;

public class Foodmanagment {
    private Byte id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private Byte customerid;

    private Byte foodid;

    private Date foodtime;

    private String foodweek;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
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

    public Byte getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Byte customerid) {
        this.customerid = customerid;
    }

    public Byte getFoodid() {
        return foodid;
    }

    public void setFoodid(Byte foodid) {
        this.foodid = foodid;
    }

    public Date getFoodtime() {
        return foodtime;
    }

    public void setFoodtime(Date foodtime) {
        this.foodtime = foodtime;
    }

    public String getFoodweek() {
        return foodweek;
    }

    public void setFoodweek(String foodweek) {
        this.foodweek = foodweek == null ? null : foodweek.trim();
    }
}