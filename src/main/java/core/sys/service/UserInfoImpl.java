package core.sys.service;

import core.sys.entity.User;

public interface UserInfoImpl {
	public User selectByPrimaryKey(String account);
}
