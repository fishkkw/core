package core.sys.service;

import core.sys.entity.User;

public interface UserInfoService {
	public User selectByPrimaryKey(String account);
}
