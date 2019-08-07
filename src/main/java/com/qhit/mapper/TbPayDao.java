package com.qhit.mapper;

import java.util.List;

import com.qhit.pojo.TbPay;
import com.qhit.pojo.TbPayExample;
import org.apache.ibatis.annotations.Param;

public interface TbPayDao {
    long countByExample(TbPayExample example);

    int deleteByExample(TbPayExample example);

    int deleteByPrimaryKey(String payNo);

    int insert(TbPay record);

    int insertSelective(TbPay record);

    List<TbPay> selectByExample(TbPayExample example);

    TbPay selectByPrimaryKey(String payNo);

    int updateByExampleSelective(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByExample(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByPrimaryKeySelective(TbPay record);

    int updateByPrimaryKey(TbPay record);
    int inz(TbPay record);
}