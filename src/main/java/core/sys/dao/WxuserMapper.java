package core.sys.dao;

import core.sys.entity.Wxuser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WxuserMapper {
    int deleteByPrimaryKey(String openid);

    int insert(Wxuser record);

    int insertSelective(Wxuser record);

    int selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(Wxuser record);

    int updateByPrimaryKey(Wxuser record);
}