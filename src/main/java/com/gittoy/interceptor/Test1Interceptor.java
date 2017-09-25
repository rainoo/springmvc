package com.gittoy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Test1Interceptor implements HandlerInterceptor {

	// 在请求被处理之前进行调用
	// 返回值：表示我们是否将当前的返回值拦截下来
	// 返回false：请求将被终止。
	// 返回true：请求会被继续运行。
	// Object handler表示的是被拦截的请求的目标对象。
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("执行到了preHandle");
		return true;
	}

	// 在请求被处理之后进行调用
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("执行到了postHandle");
		// 可以通过ModelAndView参数来改变显示的视图，或修改发往视图的方法。
		modelAndView.addObject("msg", "这里传回的是被拦截器修改之后的消息！");
		modelAndView.setViewName("hello2");
	}

	// 在请求结束之后进行调用
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("执行到了afterCompletion");
	}

}
