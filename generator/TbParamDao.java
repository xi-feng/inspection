package generator;

import com.qhit.pojo.TbParam;
import com.qhit.pojo.TbParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbParamDao {
    long countByExample(TbParamExample example);

    int deleteByExample(TbParamExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbParam record);

    int insertSelective(TbParam record);

    List<TbParam> selectByExample(TbParamExample example);

    TbParam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByExample(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByPrimaryKeySelective(TbParam record);

    int updateByPrimaryKey(TbParam record);
}