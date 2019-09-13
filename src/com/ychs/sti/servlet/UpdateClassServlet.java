package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.service.ClassesService;
import com.ychs.sti.service.ClassesServiceImpl;

/**
 * Servlet implementation class UpdateClassServlet
 */
@WebServlet("/UpdateClassServlet")
public class UpdateClassServlet extends HttpServlet {
	ClassesService cService = new ClassesServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String majorname = request.getParameter("majorname");
		String classid = request.getParameter("classid");
		String classname = request.getParameter("classname");
		String grade = request.getParameter("grade");
		
		int flag = cService.modifyClass(majorname,classid, classname, grade);
		String jsonString = JSON.toJSONString(flag);
		out.print(jsonString);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
