package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.Loginlog;
import com.ychs.sti.service.LoginlogService;
import com.ychs.sti.service.LoginlogServiceImpl;
import com.ychs.sti.util.IpUtil;

/**
 * Servlet implementation class AddLogininfoServlet
 */
@WebServlet("/AddLogininfoServlet")
public class AddLogininfoServlet extends HttpServlet {
	LoginlogService ls = new LoginlogServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLogininfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String realname = request.getParameter("realname");
//		String loginip = request.getParameter("loginip");
		
		String loginip = IpUtil.getIpAddr(request);
		HttpSession session = request.getSession();
		Loginlog loginlog = new Loginlog("",realname,"",loginip);
		int flag = ls.addLoginlog(loginlog);
		out.print(JSON.toJSONString(flag));
		if(session.getAttribute("uname") != null) {
			response.sendRedirect("index.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
