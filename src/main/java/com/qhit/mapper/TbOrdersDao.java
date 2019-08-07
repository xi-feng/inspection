package com.qhit.mapper;

import java.util.List;

import com.qhit.pojo.TbOrders;
import com.qhit.pojo.TbOrdersExample;
import org.apache.ibatis.annotations.Param;

public interface TbOrdersDao {
    long countByExample(TbOrdersExample example);

    int deleteByExample(TbOrdersExample example);

    int deleteByPrimaryKey(String ordersNo);

    int insert(TbOrders record);

    int insertSelective(TbOrders record);

    List<TbOrders> selectByExample(TbOrdersExample example);

    TbOrders selectByPrimaryKey(String ordersNo);

    int updateByExampleSelective(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByExample(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByPrimaryKeySelective(TbOrders record);

    int updateByPrimaryKey(TbOrders record);
    int inz(TbOrders record);
}