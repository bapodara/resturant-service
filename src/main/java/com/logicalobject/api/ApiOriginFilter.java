package com.logicalobject.api;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

@Component
public class ApiOriginFilter implements javax.servlet.Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		res.addHeader("Access-Control-Allow-Headers", "Content-Type");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
}