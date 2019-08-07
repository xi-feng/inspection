package com.qhit.service;

import com.qhit.pojo.TbQing;

import java.util.List;

public interface TbQingService {
    int addTbQings(TbQing tbQing);
    List<TbQing> selectByStauts(String stauts);
}
