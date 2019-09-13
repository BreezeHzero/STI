package com.ychs.sti.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse rep = (HttpServletResponse)response;
		HttpSession session = req.getSession();
		/* String uri= req.getRequestURI(); */
		/*
		 * if(session.getAttribute("uname")==null) { rep.sendRedirect("login.html");
		 * }else { chain.doFilter(request, response); }
		 */
		/*
		 * if(uri.contains("/login.html")||uri.contains("/CheckLoginServlet")||uri.
		 * contains("css/login.css")||uri.contains("plugins/layui/css/layui.css")) {
		 * chain.doFilter(request, response); }else {
		 * if(session.getAttribute("uname")!=null) { chain.doFilter(request, response);
		 * }else { rep.sendRedirect("login.html"); } }
		 */
		if(session.getAttribute("uname")==null) {
			rep.sendRedirect("login.html");
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
