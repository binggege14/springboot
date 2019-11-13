package com.yiyang.entity;

import java.util.Date;

public class CusBed {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String customerId;

    private String contentId;

    private Date nursingTime;

    private String nursingContent;

    private String nursingCount;

    private String staffinfoId;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public Date getNursingTime() {
        return nursingTime;
    }

    public void setNursingTime(Date nursingTime) {
        this.nursingTime = nursingTime;
    }

    public String getNursingContent() {
        return nursingContent;
    }

    public void setNursingContent(String nursingContent) {
        this.nursingContent = nursingContent == null ? null : nursingContent.trim();
    }

    public String getNursingCount() {
        return nursingCount;
    }

    public void setNursingCount(String nursingCount) {
        this.nursingCount = nursingCount == null ? null : nursingCount.trim();
    }

    public String getStaffinfoId() {
        return staffinfoId;
    }

    public void setStaffinfoId(String staffinfoId) {
        this.staffinfoId = staffinfoId == null ? null : staffinfoId.trim();
    }
}