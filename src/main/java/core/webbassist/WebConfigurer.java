package core.webbassist;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import core.webbassist.frameConfig.LoginInterceptor;
import core.webbassist.frameConfig.TicketInterceptor;
import core.webbassist.frameConfig.WebFilter;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
	@Autowired
	private LoginInterceptor loginInterceptor;
	@Autowired
	private TicketInterceptor ticketInterceptor;
	@Autowired
	private WebFilter webFilter;

	// 过滤器注册
	@Bean
	public FilterRegistrationBean<Filter> filterRegist() {
		FilterRegistrationBean<Filter> frBean = new FilterRegistrationBean<>();
		frBean.setFilter(webFilter);
		frBean.addUrlPatterns("/*");
		frBean.setOrder(1);
		return frBean;
	}

	// 拦截器注册
	@Override
	public void addInterceptors(InterceptorRegistry interceptorregistry) {
		interceptorregistry.addInterceptor(ticketInterceptor).addPathPatterns("/**")// .excludePathPatterns("/login/**")
				.excludePathPatterns("/error").order(1);
		interceptorregistry.addInterceptor(loginInterceptor).addPathPatterns("/**").order(2);
		WebMvcConfigurer.super.addInterceptors(interceptorregistry);
	}

}
