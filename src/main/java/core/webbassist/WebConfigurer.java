package core.webbassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import core.webbassist.interceptor.LoginInterceptor;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
	@Autowired
	private LoginInterceptor loginInterceptor;

	// 拦截器注册
	@Override
	public void addInterceptors(InterceptorRegistry interceptorregistry) {
		interceptorregistry.addInterceptor(loginInterceptor).addPathPatterns("/**");
		WebMvcConfigurer.super.addInterceptors(interceptorregistry);
	}

}
