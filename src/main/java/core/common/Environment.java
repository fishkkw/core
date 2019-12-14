package core.common;

import core.sys.entity.User;
import core.webbassist.HostHolder;

/**
 * @author Administrator
 *
 *         获取环境中的相关信息
 */
public class Environment {

	/**
	 * 获取当前环境用户信息
	 * 
	 * @return
	 */
	public static User getUserInfo() {
		return HostHolder.getUserInfo();
	}

	/**
	 * 获取当前环境所属商户id
	 * 
	 * @return
	 */
	public static String getMerchId() {
		return HostHolder.getMerchId();
	}

	/**
	 * 获取当前环境用户账号
	 * 
	 * @return
	 */
	public static String getAccount() {
		return HostHolder.getAccount();
	}
}
