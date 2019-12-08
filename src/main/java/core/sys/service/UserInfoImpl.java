package core.sys.service;

import core.sys.entity.UserInfo;

public interface UserInfoImpl {
	public UserInfo selectByPrimaryKey(String account);
}
