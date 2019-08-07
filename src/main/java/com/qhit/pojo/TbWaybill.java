package com.qhit.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_waybill
 * @author 
 */
public class TbWaybill implements Serializable {
    private String waybillNo;

    private String wlqycodeinsp;

    private String wlqyname;

    private String sender;

    private String receiver;

    private String address;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getWlqycodeinsp() {
        return wlqycodeinsp;
    }

    public void setWlqycodeinsp(String wlqycodeinsp) {
        this.wlqycodeinsp = wlqycodeinsp;
    }

    public String getWlqyname() {
        return wlqyname;
    }

    public void setWlqyname(String wlqyname) {
        this.wlqyname = wlqyname;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        TbWaybill other = (TbWaybill) that;
        return (this.getWaybillNo() == null ? other.getWaybillNo() == null : this.getWaybillNo().equals(other.getWaybillNo()))
            && (this.getWlqycodeinsp() == null ? other.getWlqycodeinsp() == null : this.getWlqycodeinsp().equals(other.getWlqycodeinsp()))
            && (this.getWlqyname() == null ? other.getWlqyname() == null : this.getWlqyname().equals(other.getWlqyname()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWaybillNo() == null) ? 0 : getWaybillNo().hashCode());
        result = prime * result + ((getWlqycodeinsp() == null) ? 0 : getWlqycodeinsp().hashCode());
        result = prime * result + ((getWlqyname() == null) ? 0 : getWlqyname().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", waybillNo=").append(waybillNo);
        sb.append(", wlqycodeinsp=").append(wlqycodeinsp);
        sb.append(", wlqyname=").append(wlqyname);
        sb.append(", sender=").append(sender);
        sb.append(", receiver=").append(receiver);
        sb.append(", address=").append(address);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}