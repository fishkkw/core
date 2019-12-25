package core.sys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import core.common.Environment;
import core.sys.controller.UserInfoController;
import core.sys.dao.UserMapper;
import core.sys.entity.User;
import core.sys.service.UserInfoService;

/**
 * 
 * @author Administrator
 * @date 2019-12-09
 */
@Service
@Repository("userInfoService")
public class IUserInfoImpl implements UserInfoService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	public UserMapper userInfoMapper;

	/**
	 * @author Administrator
	 * @param account
	 *            用户账号
	 * @return Userinfo 用户信息
	 */
	@Override
	public User selectByPrimaryKey(String account) {
		logger.info("selectByPrimaryKey start...");
		logger.info("getMerchId:{}", Environment.getMerchId());
		logger.info("selectByPrimaryKey end...");
		return userInfoMapper.selectByPrimaryKey(account);
	}

	@Override
	public boolean addUser(User user) {
		return userInfoMapper.insert(user) > 0;
	}

}
