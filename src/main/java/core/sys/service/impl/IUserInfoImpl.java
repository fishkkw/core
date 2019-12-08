package core.sys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import core.sys.controller.UserInfoController;
import core.sys.dao.UserInfoMapper;
import core.sys.entity.UserInfo;
import core.sys.service.UserInfoImpl;

/**
 * 
 * @author Administrator
 * @date 2019-12-09
 */
@Service
@Repository("userInfoService")
public class IUserInfoImpl implements UserInfoImpl {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	public UserInfoMapper userInfoMapper;

	/**
	 * @author Administrator
	 * @param account
	 *            用户账号
	 * @return Userinfo 用户信息
	 */
	@Override
	public UserInfo selectByPrimaryKey(String account) {
		logger.info("selectByPrimaryKey start...");
		logger.info("selectByPrimaryKey end...");
		return userInfoMapper.selectByPrimaryKey(account);
	}

}
