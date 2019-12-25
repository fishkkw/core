package core.sys.controller;

import com.alibaba.fastjson.JSON;
import core.sys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	public Msg addUser(@RequestBody User user){
		//User record = JSON.parseObject(user, User.class);
		if(userInfoService.addUser(user)) {
			return Msg.success();
		}
		return Msg.fail();
	}

}
