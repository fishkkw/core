package core.sys.dao;

import core.sys.entity.CataLog;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CataLogMapper {
	int deleteByPrimaryKey(String id);

	int insert(CataLog record);

	int insertSelective(CataLog record);

	CataLog selectByPrimaryKey(String id);

	List<CataLog> selectCataLogByMchId(String mchId);

	int updateByPrimaryKeySelective(CataLog record);

	int updateByPrimaryKeyWithBLOBs(CataLog record);

	int updateByPrimaryKey(CataLog record);
}