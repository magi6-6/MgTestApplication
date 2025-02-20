package com.mg.test.newland;

import java.util.Date;

/**
 * 退费字典
 * Created by Administrator on 2020/08/31.
 */
public class RefundDict {

    //字典类型
    private String dictType;
    //字典类型描述
    private String typeDesc;
    //字典值
    private String dictValue;
    //字典值描述
    private String valueDesc;
    //实体属性描述
    private String entityRemark;
    //地市
    private Date startDate;
    //数据状态
    private Date endDate;
    //创建时间
    private Date createDate;

    private String rowId;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getValueDesc() {
        return valueDesc;
    }

    public void setValueDesc(String valueDesc) {
        this.valueDesc = valueDesc;
    }

    public String getEntityRemark() {
        return entityRemark;
    }

    public void setEntityRemark(String entityRemark) {
        this.entityRemark = entityRemark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RefundDict{" + "dictType='" + dictType + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", valueDesc='" + valueDesc + '\'' +
                ", entityRemark='" + entityRemark + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createDate=" + createDate +
                '}';
    }


    public static final class RefundDictBuilder {
        private String dictType;
        private String typeDesc;
        private String dictValue;
        private String valueDesc;
        private String entityRemark;
        private Date startDate;
        private Date endDate;
        private Date createDate;
        private String rowId;

        private RefundDictBuilder() {
        }

        public static RefundDictBuilder aRefundDict() {
            return new RefundDictBuilder();
        }

        public RefundDictBuilder withDictType(String dictType) {
            this.dictType = dictType;
            return this;
        }

        public RefundDictBuilder withTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }

        public RefundDictBuilder withDictValue(String dictValue) {
            this.dictValue = dictValue;
            return this;
        }

        public RefundDictBuilder withValueDesc(String valueDesc) {
            this.valueDesc = valueDesc;
            return this;
        }

        public RefundDictBuilder withEntityRemark(String entityRemark) {
            this.entityRemark = entityRemark;
            return this;
        }

        public RefundDictBuilder withStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public RefundDictBuilder withEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public RefundDictBuilder withCreateDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public RefundDictBuilder withRowId(String rowId) {
            this.rowId = rowId;
            return this;
        }

        public RefundDict build() {
            RefundDict refundDict = new RefundDict();
            refundDict.setDictType(dictType);
            refundDict.setTypeDesc(typeDesc);
            refundDict.setDictValue(dictValue);
            refundDict.setValueDesc(valueDesc);
            refundDict.setEntityRemark(entityRemark);
            refundDict.setStartDate(startDate);
            refundDict.setEndDate(endDate);
            refundDict.setCreateDate(createDate);
            refundDict.setRowId(rowId);
            return refundDict;
        }
    }
}
