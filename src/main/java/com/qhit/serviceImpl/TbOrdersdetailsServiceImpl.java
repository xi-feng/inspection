package com.qhit.serviceImpl;

import com.qhit.mapper.TbOrdersdetailsDao;
import com.qhit.pojo.TbOrdersdetails;
import com.qhit.service.TbOrdersdetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbOrdersdetailsServiceImpl implements TbOrdersdetailsService

{
   @Resource
    TbOrdersdetailsDao tbOrdersdetailsDao;
    @Override
    public int addTbOrdersdetails(TbOrdersdetails tbOrdersdetails) {

        return tbOrdersdetailsDao.inz(tbOrdersdetails);
    }

    @Override
    public List<TbOrdersdetails> getTbOrdersdetails(String ordersNo) {
        return tbOrdersdetailsDao.selectByordersdetailsNo(ordersNo);
    }


}
