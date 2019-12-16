package core.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import core.sys.service.UserInfoService;
import core.util.Msg;

@RestController
@RequestMapping("/account")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "/selectuserbyaccount", method = RequestMethod.GET)
	public Msg getAccount(String account) {
		return Msg.success(userInfoService.selectByPrimaryKey(account));
	}

}
