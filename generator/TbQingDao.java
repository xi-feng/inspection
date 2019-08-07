package generator;

import com.qhit.pojo.TbQing;
import com.qhit.pojo.TbQingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQingDao {
    long countByExample(TbQingExample example);

    int deleteByExample(TbQingExample example);

    int deleteByPrimaryKey(String qingNo);

    int insert(TbQing record);

    int insertSelective(TbQing record);

    List<TbQing> selectByExample(TbQingExample example);

    TbQing selectByPrimaryKey(String qingNo);

    int updateByExampleSelective(@Param("record") TbQing record, @Param("example") TbQingExample example);

    int updateByExample(@Param("record") TbQing record, @Param("example") TbQingExample example);

    int updateByPrimaryKeySelective(TbQing record);

    int updateByPrimaryKey(TbQing record);
}