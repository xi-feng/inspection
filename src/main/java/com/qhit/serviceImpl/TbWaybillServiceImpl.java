package com.qhit.serviceImpl;

import com.qhit.mapper.TbWaybillDao;
import com.qhit.pojo.TbWaybill;
import com.qhit.service.TbWaybillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbWaybillServiceImpl implements TbWaybillService {
    @Resource
    TbWaybillDao tbWaybillDao;
    @Override
    public int addTbWaybills(TbWaybill tbWaybill) {
        return tbWaybillDao.inz(tbWaybill);
    }
}
