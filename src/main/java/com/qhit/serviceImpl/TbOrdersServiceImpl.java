package com.qhit.serviceImpl;

import com.qhit.mapper.TbOrdersDao;
import com.qhit.pojo.TbOrders;
import com.qhit.service.TbOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class TbOrdersServiceImpl implements TbOrdersService {
    @Resource
    TbOrdersDao tbOrdersDao;
    @Override
    public int addTbOrders(TbOrders tbOrders) {
        return tbOrdersDao.inz(tbOrders);
    }

    @Override
    public TbOrders getTbOrders(String ordersNo) {
        return tbOrdersDao.selectByPrimaryKey(ordersNo);
    }
}
