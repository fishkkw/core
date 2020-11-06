package core.dao;

import core.entity.AccountMap;
import core.entity.AccountMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapMapper {
    long countByExample(AccountMapExample example);

    int deleteByExample(AccountMapExample example);

    int insert(AccountMap record);

    int insertSelective(AccountMap record);

    List<AccountMap> selectByExample(AccountMapExample example);

    int updateByExampleSelective(@Param("record") AccountMap record, @Param("example") AccountMapExample example);

    int updateByExample(@Param("record") AccountMap record, @Param("example") AccountMapExample example);
}