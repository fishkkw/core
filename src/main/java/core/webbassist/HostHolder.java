package core.webbassist;

import core.sys.entity.UserInfo;

public class HostHolder {
	private static ThreadLocal<UserInfo> userInfos = new ThreadLocal<>();

	public static UserInfo getUserInfo() {
		return userInfos.get();
	}

	public static String getMerchId() {
		return userInfos.get().getMerchId();
	}

	public static String getAccount() {
		return userInfos.get().getAccount();
	}

	public static void setAccount(UserInfo userInfo) {
		userInfos.set(userInfo);
	}

	public static void clear() {
		userInfos.remove();
	}

}
