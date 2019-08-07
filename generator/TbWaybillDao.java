package generator;

import com.qhit.pojo.TbWaybill;
import com.qhit.pojo.TbWaybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWaybillDao {
    long countByExample(TbWaybillExample example);

    int deleteByExample(TbWaybillExample example);

    int deleteByPrimaryKey(String waybillNo);

    int insert(TbWaybill record);

    int insertSelective(TbWaybill record);

    List<TbWaybill> selectByExample(TbWaybillExample example);

    TbWaybill selectByPrimaryKey(String waybillNo);

    int updateByExampleSelective(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByExample(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByPrimaryKeySelective(TbWaybill record);

    int updateByPrimaryKey(TbWaybill record);
}