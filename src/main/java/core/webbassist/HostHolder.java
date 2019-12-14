package core.webbassist;

import core.sys.entity.User;

public class HostHolder {
	private static ThreadLocal<User> userInfos = new ThreadLocal<>();

	public static User getUserInfo() {
		return userInfos.get();
	}

	public static String getMerchId() {
		return userInfos.get().getMchId();
	}

	public static String getAccount() {
		return userInfos.get().getAccount();
	}

	public static void setAccount(User userInfo) {
		userInfos.set(userInfo);
	}

	public static void clear() {
		userInfos.remove();
	}

}
