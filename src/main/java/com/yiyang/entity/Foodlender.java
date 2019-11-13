package com.yiyang.entity;

import java.util.Date;

public class Foodlender {
    private Byte id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String foodname;

    private String foodtype;

    private String foodlabel;

    private Double foodprice;

    private String foodimage;

    private String momalflag;

    private String suppleweek;

    private String supplytype;

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

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype == null ? null : foodtype.trim();
    }

    public String getFoodlabel() {
        return foodlabel;
    }

    public void setFoodlabel(String foodlabel) {
        this.foodlabel = foodlabel == null ? null : foodlabel.trim();
    }

    public Double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(Double foodprice) {
        this.foodprice = foodprice;
    }

    public String getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(String foodimage) {
        this.foodimage = foodimage == null ? null : foodimage.trim();
    }

    public String getMomalflag() {
        return momalflag;
    }

    public void setMomalflag(String momalflag) {
        this.momalflag = momalflag == null ? null : momalflag.trim();
    }

    public String getSuppleweek() {
        return suppleweek;
    }

    public void setSuppleweek(String suppleweek) {
        this.suppleweek = suppleweek == null ? null : suppleweek.trim();
    }

    public String getSupplytype() {
        return supplytype;
    }

    public void setSupplytype(String supplytype) {
        this.supplytype = supplytype == null ? null : supplytype.trim();
    }
}