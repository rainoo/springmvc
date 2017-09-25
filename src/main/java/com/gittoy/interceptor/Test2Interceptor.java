package com.gittoy.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class Test2Interceptor implements WebRequestInterceptor {

	// 不能通过返回值中断请求
	@Override
	public void preHandle(WebRequest request) throws Exception {
		
	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		
	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex) throws Exception {
		
	}

}
