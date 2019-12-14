package core.sys.dao;

import core.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String account);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String account);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}