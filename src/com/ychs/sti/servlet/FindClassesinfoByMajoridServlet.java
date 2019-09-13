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
import com.ychs.sti.model.Classes;
import com.ychs.sti.service.ClassesService;
import com.ychs.sti.service.ClassesServiceImpl;

/**
 * Servlet implementation class FindClassesinfoByMajoridServlet
 */
@WebServlet("/FindClassesinfoByMajoridServlet")
public class FindClassesinfoByMajoridServlet extends HttpServlet {
	ClassesService cs = new ClassesServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindClassesinfoByMajoridServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String majorname = request.getParameter("majorname");
		String grade = request.getParameter("grade");
		
		List<Classes> list = cs.findClssesinfoByMajorid(majorname,grade);
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
