package com.qhit.mapper;

import java.util.List;

import com.qhit.pojo.Ratiotable;
import com.qhit.pojo.RatiotableExample;
import org.apache.ibatis.annotations.Param;

public interface RatiotableDao {
    long countByExample(RatiotableExample example);

    int deleteByExample(RatiotableExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Ratiotable record);

    int insertSelective(Ratiotable record);

    List<Ratiotable> selectByExample(RatiotableExample example);

    Ratiotable selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Ratiotable record, @Param("example") RatiotableExample example);

    int updateByExample(@Param("record") Ratiotable record, @Param("example") RatiotableExample example);

    int updateByPrimaryKeySelective(Ratiotable record);

    int updateByPrimaryKey(Ratiotable record);
}