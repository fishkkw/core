package core.sys.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import core.common.Environment;
import core.sys.controller.UserInfoController;
import core.sys.dao.CataLogMapper;
import core.sys.entity.CataLog;
import core.sys.service.CataLogService;

/**
 * 
 * @author Administrator
 * @date 2019-12-09
 */
@Service
@Repository("cataLogService")
public class ICataLogImpl implements CataLogService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	public CataLogMapper cataLogMapper;

	@Override
	public List<CataLog> getCataLogByMchId(String mchId) {
		return cataLogMapper.selectCataLogByMchId(mchId);
	}

	@Override
	public int insertSelective(CataLog record) {
		return cataLogMapper.insert(record);
	}

}
