package com.qhit.service;

import com.qhit.pojo.TbOrders;

public interface TbOrdersService {
    //添加订单表 TbOrders
    int addTbOrders(TbOrders tbOrders);
    //根据订单编号查询订单表
    TbOrders getTbOrders(String ordersNo);
}
