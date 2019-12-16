package core.sys.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;

import core.common.Environment;
import core.sys.controller.UserInfoController;
import core.sys.dao.CataLogMapper;
import core.sys.entity.CataLog;
import core.sys.service.CataLogService;
import core.util.DateUtils;
import core.util.SnowflakeIdGenerator;

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
	public List<JSONObject> selectCataLogByMchIdShow(String mchId) {
		return cataLogMapper.selectCataLogByMchIdShow(mchId);
	}

	@Override
	public boolean insertSelective(MultipartFile file, String name, String sort, String remark) {
		CataLog record = new CataLog();
		try {
			InputStream inputStream = file.getInputStream();
			byte[] pictureData = new byte[(int) file.getSize()];
			inputStream.read(pictureData);
			record.setImage(pictureData);
			record.setMchId(Environment.getMerchId());
			record.setCreateTime(DateUtils.dateTimeToDateStringIfTimeEndZero(new Date()));
			record.setName(name);
			record.setSort(sort);
			record.setRemark(remark);
			record.setIsEnable(false);
			record.setIsDel(false);
			record.setCreateUser(Environment.getAccount());
			record.setId(String.valueOf(SnowflakeIdGenerator.getInstance()));
		} catch (IOException e) {
			logger.error("insertSelective error : {}", e);
			e.printStackTrace();
		} catch (ParseException e) {
			logger.error("insertSelective error : {}", e);
			e.printStackTrace();
		}
		return cataLogMapper.insert(record) > 0;
	}

}
