package com.qhit.mapper;

import java.util.List;

import com.qhit.pojo.Regulation;
import com.qhit.pojo.RegulationExample;
import org.apache.ibatis.annotations.Param;

public interface RegulationDao {
    long countByExample(RegulationExample example);

    int deleteByExample(RegulationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Regulation record);

    int insertSelective(Regulation record);

    List<Regulation> selectByExample(RegulationExample example);

    Regulation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Regulation record, @Param("example") RegulationExample example);

    int updateByExample(@Param("record") Regulation record, @Param("example") RegulationExample example);

    int updateByPrimaryKeySelective(Regulation record);

    int updateByPrimaryKey(Regulation record);
}