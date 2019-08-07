package com.qhit.pojo;

import java.util.Date;

public class CommonBean {
    /**
     * 清单编号
     */
    private String qingNo;

    /**
     * 订单编号
     */
    private String ordersNo;

    /**
     * 运单编号
     */
    private String waybillNo;

    /**
     * 支付单号
     */
    private String payNo;

    /**
     * 状态(0.退单1.人工审单2.负面清单3.查验4.禁止处境初审5.禁止处境复审6.禁止处境7.放行)
     */
    private String stauts;

    /**
     * 创建时间
     *
     */
    private Date createTime;

    /**
     * TbOrders
     * 订单编号
     */
   // private String ordersNo;

    /**
     * 电商名称
     */
    private String cbename;

    /**
     * 电商检验检疫备案编号
     */
    private String cbecodeinsp;

    /**
     * 商品数量
     */
    private Integer goodsNumber;

    /**
     * 下单人
     */
    private String userName;

    /**
     * 订单总金额
     */
    private Float totalMoney;

    /**
     * 创建时间
     */
    //private Date createTime;

    /**
     * 订单明细编号
     * 订单明细
     */
    private String ordersdetailsNo;

    /**
     * 订单编号
     */
    //private String ordersNo;

    /**
     * 商品货号
     */
    private String goodsNo;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 检验检疫商品备案编号
     */
    private String goodsinsp;

    /**
     * 商品价格
     */
    private Float goodsPrice;

    /**
     * 商品数量
     */
   // private Integer goodsNumber;

    /**
     * 金额
     */
    private Float total;

    /**
     * 创建时间
     */
   // private Date createTime;
    /**
     * 运单表
     */
    //private String waybillNo;

    private String wlqycodeinsp;

    private String wlqyname;

    private String sender;

    private String receiver;

    private String address;

    //private Date createTime;

    /**
     * 商品表
     * 检验检疫商品备案编号
     */
    //private String goodsinsp;

    /**
     * 商品名称
     */
   // private String goodsName;

    /**
     * 商品货号
     */
   // private String goodsNo;

    /**
     * 审核类型（新增，变更，注销）
     */
    private String auditType;

    /**
     * 审核状态（初审，复审）
     */
    //private String stautss;

    /**
     * 经营企业名称
     */
    //private String cbename;

    /**
     * 经营企业检验检疫备案编号
     */
    //private String cbecodeinsp;

    /**
     * 创建时间
     */
    //private Date createTime;


    public String getQingNo() {
        return qingNo;
    }

    public void setQingNo(String qingNo) {
        this.qingNo = qingNo;
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getOrdersdetailsNo() {
        return ordersdetailsNo;
    }

    public void setOrdersdetailsNo(String ordersdetailsNo) {
        this.ordersdetailsNo = ordersdetailsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsinsp() {
        return goodsinsp;
    }

    public void setGoodsinsp(String goodsinsp) {
        this.goodsinsp = goodsinsp;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
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

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }


}
