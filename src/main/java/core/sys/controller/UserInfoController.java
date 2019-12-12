package core.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import core.sys.service.UserInfoImpl;
import core.util.Msg;

@RestController
@RequestMapping("/account")
public class UserInfoController {

	@Autowired
	private UserInfoImpl userInfoImpl;

	@RequestMapping(value = "/selectUserByAccount", method = RequestMethod.GET)
	public Msg getAccount(String account) {
		return Msg.success(userInfoImpl.selectByPrimaryKey(account));
	}

}
