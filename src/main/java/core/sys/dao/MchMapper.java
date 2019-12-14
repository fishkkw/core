package core.sys.dao;

import core.sys.entity.Mch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MchMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mch record);

    int insertSelective(Mch record);

    Mch selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mch record);

    int updateByPrimaryKey(Mch record);
}