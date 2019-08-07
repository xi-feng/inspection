package com.qhit.serviceImpl;

import com.qhit.mapper.TbOrdersDao;
import com.qhit.mapper.TbOrdersdetailsDao;
import com.qhit.mapper.TbQingDao;
import com.qhit.pojo.TbOrdersdetails;
import com.qhit.pojo.TbOrdersdetailsExample;
import com.qhit.pojo.TbQing;
import com.qhit.pojo.TbQingExample;
import com.qhit.service.TbQingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbQingServiceImpl implements TbQingService {
    @Resource
    TbQingDao tbQingDao;

    @Override
    public int addTbQings(TbQing tbQing) {
        return tbQingDao.inz(tbQing);
    }

    @Override
    public List<TbQing> selectByStauts(String stauts) {
        TbQingExample tbQingExample =new TbQingExample();
        TbQingExample.Criteria criteria=tbQingExample.createCriteria();
        criteria.andStautsEqualTo(stauts);
        List<TbQing> tbQings = tbQingDao.selectByExample(tbQingExample);

        return tbQings;
    }
}
