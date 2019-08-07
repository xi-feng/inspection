package com.qhit.service;

import com.qhit.pojo.TbOrdersdetails;

import java.util.List;

public interface TbOrdersdetailsService {

    int addTbOrdersdetails(TbOrdersdetails tbOrdersdetails);
    //根据订单号查询订单明细
    List<TbOrdersdetails> getTbOrdersdetails(String ordersNo);
}
