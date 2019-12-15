package core.sys.service;

import java.util.List;

import core.sys.entity.CataLog;

public interface CataLogService {

	public List<CataLog> getCataLogByMchId(String mchId);

	public int insertSelective(CataLog record);

}
