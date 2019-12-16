package core.webbassist;

import core.sys.entity.User;

public class HostHolder {
	private static ThreadLocal<User> userInfos = new ThreadLocal<>();

	public static User getUserInfo() {
		return userInfos.get();
	}

	public static String getMerchId() {
		try {
			if (userInfos.get() == null) {
				return null;
			}
			return userInfos.get().getMchId();
		} catch (NullPointerException e) {
			/// 不推荐
			e.printStackTrace();
			return null;
		}
	}

	public static String getAccount() {
		try {
			if (userInfos.get() == null) {
				return null;
			}
			return userInfos.get().getAccount();
		} catch (NullPointerException e) {
			/// 不推荐
			e.printStackTrace();
			return null;
		}
	}

	public static void setAccount(User userInfo) {
		userInfos.set(userInfo);
	}

	public static void clear() {
		userInfos.remove();
	}

}
