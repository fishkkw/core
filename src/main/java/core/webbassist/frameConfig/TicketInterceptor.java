package core.webbassist.frameConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import core.sys.entity.UserInfo;
import core.webbassist.HostHolder;

@Component
public class TicketInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		UserInfo userInfo = new UserInfo();
		userInfo.setAccount("测试账号");
		userInfo.setMerchId("XXXX-XXXX-XXXXX");
		HostHolder.setAccount(userInfo);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HostHolder.clear();
	}

}
