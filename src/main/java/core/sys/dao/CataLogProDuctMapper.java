package core.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import core.sys.entity.CataLogProDuct;

@Mapper
public interface CataLogProDuctMapper {
	int deleteByPrimaryKey(CataLogProDuct record);

	int insert(CataLogProDuct record);
}