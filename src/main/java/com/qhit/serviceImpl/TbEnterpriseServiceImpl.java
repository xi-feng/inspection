package com.qhit.serviceImpl;

import com.qhit.mapper.TbEnterpriseDao;
import com.qhit.pojo.TbEnterprise;
import com.qhit.service.TbEnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbEnterpriseServiceImpl implements TbEnterpriseService {
    @Resource
    TbEnterpriseDao tbEnterpriseDao;
    //添加TbEnterprise
    @Override
    public int addTbEnterprise(TbEnterprise tbEnterprise) {
        return tbEnterpriseDao.insert(tbEnterprise);
    }
}
