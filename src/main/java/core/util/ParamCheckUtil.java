package core.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 参数校验
 * 
 * 
 */
public class ParamCheckUtil extends StringUtils {

	/**
	 * 名称校验
	 * @param name
	 * @return 通过 false 不通过 true
	 */
	public static boolean checkName(String name) {
		if (isEmpty(name)) {
			return true;
		}
		/**
		 * 只允许中英文加数字 长度不超过50
		 */
		return false;
	}

}
