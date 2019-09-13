package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.Loginlog;
import com.ychs.sti.service.LoginlogService;
import com.ychs.sti.service.LoginlogServiceImpl;

/**
 * Servlet implementation class FinLoginlogServlet
 */
@WebServlet("/FinLoginlogServlet")
public class FinLoginlogServlet extends HttpServlet {
	LoginlogService ls = new LoginlogServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinLoginlogServlet() {
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
		List<Loginlog> list = ls.findLoginlog(realname);
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