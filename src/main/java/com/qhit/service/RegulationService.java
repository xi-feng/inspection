package com.qhit.service;

import com.qhit.pojo.Regulation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegulationService {
    List<Regulation> getRegulationList();
    int mgzadd(@Param("sensitive")String sensitive,@Param("id")String id);
}
