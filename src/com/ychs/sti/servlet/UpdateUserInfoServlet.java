package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.Usersti;
import com.ychs.sti.service.UserstiService;
import com.ychs.sti.service.UserstiServiceImpl;
import com.ychs.sti.util.MD5Util;

/**
 * Servlet implementation class UpdateUserInfoServlet
 */
@WebServlet("/UpdateUserInfoServlet")
public class UpdateUserInfoServlet extends HttpServlet {
	UserstiService us = new UserstiServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		String realname = request.getParameter("realname");
		String userpsw = request.getParameter("userpsw");
		

		userpsw = MD5Util.encode2hex(userpsw);
		Usersti user = new Usersti(userid,username,realname,userpsw);
		
		int flag = us.modifyUserinfo(user);
		out.print(JSON.toJSONString(flag));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
