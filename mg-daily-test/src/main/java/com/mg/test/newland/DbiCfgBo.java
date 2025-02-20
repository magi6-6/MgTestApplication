package com.mg.test.newland;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by zhaoyc on 2016/7/13.
 */
public class DbiCfgBo implements Cloneable{

    private static  Logger logger = LoggerFactory.getLogger(DbiCfgBo.class);
    private static String tag    = "DbiCfgBo====";
    private String dbiId;
    private Date startDate;
    private  String dbiName;
    private short dbiLevel;
    private String preDbiId;
    private short isHasChild;
    private short isShowChild;
    private short isDiscount;
    private int displayOrder;
    private short isAdjust;
    private short isNegative;
    private Date endDate;
    private Date createDate;
    private  String remark;
    private short isNewBusiness;
    private long templateId;
    private int busiType;
    private short showType;

    public String getDbiId() {
        return dbiId;
    }

    public void setDbiId(String dbiId) {
        this.dbiId = dbiId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDbiName() {
        return dbiName;
    }

    public void setDbiName(String dbiName) {
        this.dbiName = dbiName;
    }

    public short getDbiLevel() {
        return dbiLevel;
    }

    public void setDbiLevel(short dbiLevel) {
        this.dbiLevel = dbiLevel;
    }

    public String getPreDbiId() {
        return preDbiId;
    }

    public void setPreDbiId(String preDbiId) {
        this.preDbiId = preDbiId;
    }

    public short getIsHasChild() {
        return isHasChild;
    }

    public void setIsHasChild(short isHasChild) {
        this.isHasChild = isHasChild;
    }

    public short getIsShowChild() {
        return isShowChild;
    }

    public void setIsShowChild(short isShowChild) {
        this.isShowChild = isShowChild;
    }

    public short getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(short isDiscount) {
        this.isDiscount = isDiscount;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public short getIsAdjust() {
        return isAdjust;
    }

    public void setIsAdjust(short isAdjust) {
        this.isAdjust = isAdjust;
    }

    public short getIsNegative() {
        return isNegative;
    }

    public void setIsNegative(short isNegative) {
        this.isNegative = isNegative;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public short getIsNewBusiness() {
        return isNewBusiness;
    }

    public void setIsNewBusiness(short isNewBusiness) {
        this.isNewBusiness = isNewBusiness;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public int getBusiType() {
        return busiType;
    }

    public void setBusiType(int busiType) {
        this.busiType = busiType;
    }

    public short getShowType() {
        return showType;
    }

    public void setShowType(short showType) {
        this.showType = showType;
    }


    @Override
    public Object clone() {
        Object obj = null;
        try
        {
            obj = super.clone();
        }
        catch( CloneNotSupportedException e )
        {
            logger.error(tag + "DbiCfgBo clone() error:" + e);
        }

        return obj;
    }

    @Override
    public String toString() {
        return "DbiCfgBo{" +
                "dbiId='" + dbiId + '\'' +
                ", startDate=" + startDate +
                ", dbiName='" + dbiName + '\'' +
                ", dbiLevel=" + dbiLevel +
                ", preDbiId='" + preDbiId + '\'' +
                ", isHasChild=" + isHasChild +
                ", isShowChild=" + isShowChild +
                ", isDiscount=" + isDiscount +
                ", displayOrder=" + displayOrder +
                ", isAdjust=" + isAdjust +
                ", isNegative=" + isNegative +
                ", endDate=" + endDate +
                ", createDate=" + createDate +
                ", remark='" + remark + '\'' +
                ", isNewBusiness=" + isNewBusiness +
                ", templateId=" + templateId +
                ", busiType=" + busiType +
                ", showType=" + showType +
                '}';
    }
}
