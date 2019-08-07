package com.qhit.serviceImpl;

import com.qhit.mapper.RatiotableDao;
import com.qhit.pojo.Ratiotable;
import com.qhit.service.RatiotableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RatiotableServiceImpl implements RatiotableService{
    @Resource
    RatiotableDao ratiotableDao;
    @Override
    public Ratiotable getRatio() {

        return ratiotableDao.selectByPrimaryKey(1);
    }

    @Override
    public List<Ratiotable> RatiotableAll() {
        return ratiotableDao.selectByExample(null);
    }
}
