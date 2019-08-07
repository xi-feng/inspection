package com.qhit.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_goods
 * @author 
 */
public class TbGoods implements Serializable {
    /**
     * 检验检疫商品备案编号
     */
    private String goodsinsp;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品货号
     */
    private String goodsNo;

    /**
     * 审核类型（新增，变更，注销）
     */
    private String auditType;

    /**
     * 审核状态（初审，复审）
     */
    private String stauts;

    /**
     * 经营企业名称
     */
    private String cbename;

    /**
     * 经营企业检验检疫备案编号
     */
    private String cbecodeinsp;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getGoodsinsp() {
        return goodsinsp;
    }

    public void setGoodsinsp(String goodsinsp) {
        this.goodsinsp = goodsinsp;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
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

    public String getCbename() {
        return cbename;
    }

    public void setCbename(String cbename) {
        this.cbename = cbename;
    }

    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp;
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
        TbGoods other = (TbGoods) that;
        return (this.getGoodsinsp() == null ? other.getGoodsinsp() == null : this.getGoodsinsp().equals(other.getGoodsinsp()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getAuditType() == null ? other.getAuditType() == null : this.getAuditType().equals(other.getAuditType()))
            && (this.getStauts() == null ? other.getStauts() == null : this.getStauts().equals(other.getStauts()))
            && (this.getCbename() == null ? other.getCbename() == null : this.getCbename().equals(other.getCbename()))
            && (this.getCbecodeinsp() == null ? other.getCbecodeinsp() == null : this.getCbecodeinsp().equals(other.getCbecodeinsp()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsinsp() == null) ? 0 : getGoodsinsp().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getAuditType() == null) ? 0 : getAuditType().hashCode());
        result = prime * result + ((getStauts() == null) ? 0 : getStauts().hashCode());
        result = prime * result + ((getCbename() == null) ? 0 : getCbename().hashCode());
        result = prime * result + ((getCbecodeinsp() == null) ? 0 : getCbecodeinsp().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsinsp=").append(goodsinsp);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", auditType=").append(auditType);
        sb.append(", stauts=").append(stauts);
        sb.append(", cbename=").append(cbename);
        sb.append(", cbecodeinsp=").append(cbecodeinsp);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}