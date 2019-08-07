package com.qhit.serviceImpl;

import com.qhit.mapper.TbPayDao;
import com.qhit.pojo.TbPay;
import com.qhit.service.TbPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbPayServiceImpl implements TbPayService {
    @Resource
    TbPayDao tbPayDao;
    @Override
    public int addTbPays(TbPay tbPay) {
        return tbPayDao.inz(tbPay);
    }
}
