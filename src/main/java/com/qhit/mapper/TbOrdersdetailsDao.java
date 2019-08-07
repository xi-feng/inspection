package com.qhit.mapper;

import java.util.List;

import com.qhit.pojo.TbOrdersdetails;
import com.qhit.pojo.TbOrdersdetailsExample;
import org.apache.ibatis.annotations.Param;

public interface TbOrdersdetailsDao {
    long countByExample(TbOrdersdetailsExample example);

    int deleteByExample(TbOrdersdetailsExample example);

    int deleteByPrimaryKey(String ordersdetailsNo);

    int insert(TbOrdersdetails record);

    int insertSelective(TbOrdersdetails record);

    List<TbOrdersdetails> selectByExample(TbOrdersdetailsExample example);

    TbOrdersdetails selectByPrimaryKey(String ordersdetailsNo);

    int updateByExampleSelective(@Param("record") TbOrdersdetails record, @Param("example") TbOrdersdetailsExample example);

    int updateByExample(@Param("record") TbOrdersdetails record, @Param("example") TbOrdersdetailsExample example);

    int updateByPrimaryKeySelective(TbOrdersdetails record);

    int updateByPrimaryKey(TbOrdersdetails record);
    int inz(TbOrdersdetails record);
    List<TbOrdersdetails> selectByordersdetailsNo(String ordersdetailsNo);
}