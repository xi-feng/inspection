package com.qhit.serviceImpl;

import com.qhit.mapper.TbGoodsDao;


import com.qhit.pojo.TbGoods;
import com.qhit.service.TbGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class TbGoodsServiceImpl implements TbGoodsService {
    @Resource
    TbGoodsDao tbGoodsDao;
    @Override
    public int addTbGoods(TbGoods tbGoods) {
        return tbGoodsDao.insert(tbGoods);
    }
}
