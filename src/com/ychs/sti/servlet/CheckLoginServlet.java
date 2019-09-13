package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.Usersti;
import com.ychs.sti.service.UserstiService;
import com.ychs.sti.service.UserstiServiceImpl;
import com.ychs.sti.util.MD5Util;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	UserstiService us = new UserstiServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String userpsw2 = request.getParameter("userpsw");
		String rememberMe = request.getParameter("rememberMe");
		System.out.println(rememberMe);
	    String userpsw = MD5Util.encode2hex(userpsw2);
		Usersti list = us.checkedLogin(username, userpsw);
		
		/*
		 * InetAddress addr = InetAddress.getLocalHost(); String loginip =
		 * addr.getHostAddress().toString();//获取本机IP
		 */		
//		String loginip = IpUtil.getIpAddr(request);
		
		HttpSession session = request.getSession();
		//如果查到了信息
		if(list != null) {
			if(rememberMe != "") {
				Cookie cusername = new Cookie("cookieusername", username);
				Cookie cuserpsw = new Cookie("cookieuserpsw", userpsw2);
				
				cusername.setMaxAge(60*60*24*30);//设置一个月有效
				cuserpsw.setMaxAge(60*60*24*30);//设置一个月有效
				
				response.addCookie(cusername);//服务器返回给浏览器cookie以便下次判断
				response.addCookie(cuserpsw);//服务器返回给浏览器cookie以便下次判断
			}else {
				Cookie cusername = new Cookie("cookieusername", username);
				Cookie cuserpsw = new Cookie("cookieuserpsw", userpsw2);
				
				cusername.setMaxAge(0);//设置0
				cuserpsw.setMaxAge(0);//设置0
				
				response.addCookie(cusername);//服务器返回给浏览器cookie以便下次判断
				response.addCookie(cuserpsw);//服务器返回给浏览器cookie以便下次判断
			}
			
			session.setAttribute("uname", list);
			/*
			 * session.setAttribute("loginip", loginip);//session存入登录ip
			 */		}
		out.print(JSON.toJSONString(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
