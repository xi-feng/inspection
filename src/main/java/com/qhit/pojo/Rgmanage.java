package com.qhit.pojo;

import java.util.Date;

public class Rgmanage {
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
     */
    private Date createTime;
    /**
     * 订单明细编号
     */
    private String ordersdetailsNo;


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
    private Integer goodsNumber;

    /**
     * 金额
     */
    private Float total;

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

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}
