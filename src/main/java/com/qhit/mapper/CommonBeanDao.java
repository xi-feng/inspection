package com.qhit.mapper;

import com.qhit.pojo.CommonBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonBeanDao {

    List<CommonBean> commonBeanAll (@Param("stauts")String stauts);
    int zongtiaoshu(@Param("stauts")String stauts);
}
