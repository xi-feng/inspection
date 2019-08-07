package com.qhit.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_enterprise
 * @author 
 */
public class TbEnterprise implements Serializable {
    /**
     * 电商检验检疫备案编号
     */
    private String cbecodeinsp;

    /**
     * 电商名称
     */
    private String cbename;

    /**
     * 业务类型（进口，出口，进出口）
     */
    private String type;

    /**
     * 审核类型（新增，变更，注销）
     */
    private String auditType;

    /**
     * 审核状态（初审，复审）
     */
    private String stauts;

    /**
     * 单位联系人
     */
    private String person;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp;
    }

    public String getCbename() {
        return cbename;
    }

    public void setCbename(String cbename) {
        this.cbename = cbename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
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
        TbEnterprise other = (TbEnterprise) that;
        return (this.getCbecodeinsp() == null ? other.getCbecodeinsp() == null : this.getCbecodeinsp().equals(other.getCbecodeinsp()))
            && (this.getCbename() == null ? other.getCbename() == null : this.getCbename().equals(other.getCbename()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAuditType() == null ? other.getAuditType() == null : this.getAuditType().equals(other.getAuditType()))
            && (this.getStauts() == null ? other.getStauts() == null : this.getStauts().equals(other.getStauts()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCbecodeinsp() == null) ? 0 : getCbecodeinsp().hashCode());
        result = prime * result + ((getCbename() == null) ? 0 : getCbename().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAuditType() == null) ? 0 : getAuditType().hashCode());
        result = prime * result + ((getStauts() == null) ? 0 : getStauts().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cbecodeinsp=").append(cbecodeinsp);
        sb.append(", cbename=").append(cbename);
        sb.append(", type=").append(type);
        sb.append(", auditType=").append(auditType);
        sb.append(", stauts=").append(stauts);
        sb.append(", person=").append(person);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}