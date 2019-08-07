package com.qhit.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_pay
 * @author 
 */
public class TbPay implements Serializable {
    private String payNo;

    private String ordersNo;

    private String zfcodeinsp;

    private String zfname;

    private String payName;

    private Float payMoney;

    private String payType;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo;
    }

    public String getZfcodeinsp() {
        return zfcodeinsp;
    }

    public void setZfcodeinsp(String zfcodeinsp) {
        this.zfcodeinsp = zfcodeinsp;
    }

    public String getZfname() {
        return zfname;
    }

    public void setZfname(String zfname) {
        this.zfname = zfname;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Float payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbPay other = (TbPay) that;
        return (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getOrdersNo() == null ? other.getOrdersNo() == null : this.getOrdersNo().equals(other.getOrdersNo()))
            && (this.getZfcodeinsp() == null ? other.getZfcodeinsp() == null : this.getZfcodeinsp().equals(other.getZfcodeinsp()))
            && (this.getZfname() == null ? other.getZfname() == null : this.getZfname().equals(other.getZfname()))
            && (this.getPayName() == null ? other.getPayName() == null : this.getPayName().equals(other.getPayName()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getOrdersNo() == null) ? 0 : getOrdersNo().hashCode());
        result = prime * result + ((getZfcodeinsp() == null) ? 0 : getZfcodeinsp().hashCode());
        result = prime * result + ((getZfname() == null) ? 0 : getZfname().hashCode());
        result = prime * result + ((getPayName() == null) ? 0 : getPayName().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payNo=").append(payNo);
        sb.append(", ordersNo=").append(ordersNo);
        sb.append(", zfcodeinsp=").append(zfcodeinsp);
        sb.append(", zfname=").append(zfname);
        sb.append(", payName=").append(payName);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payType=").append(payType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}