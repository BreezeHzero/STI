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
import com.ychs.sti.model.Record;
import com.ychs.sti.service.RecordService;
import com.ychs.sti.service.RecordServiceImpl;

/**
 * Servlet implementation class RanksNumberServlet
 */
@WebServlet("/RanksNumberServlet")
public class RanksNumberServlet extends HttpServlet {
	RecordService rs =  new RecordServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RanksNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String studentid = request.getParameter("studentid");
		String classname = request.getParameter("classname");
		String competitionid = request.getParameter("competitionid");
		String grade = request.getParameter("grade");
		String majorname = request.getParameter("majorname");
		List<Record> list = rs.ranksNumber(competitionid,grade,studentid,majorname,classname);
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
