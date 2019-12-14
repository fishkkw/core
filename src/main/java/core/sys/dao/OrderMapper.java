package core.sys.dao;

import core.sys.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}