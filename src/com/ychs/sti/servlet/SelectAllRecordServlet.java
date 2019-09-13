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
 * Servlet implementation class SelectAllRecordServlet
 */
@WebServlet("/SelectAllRecordServlet")
public class SelectAllRecordServlet extends HttpServlet {
	RecordService rs = new RecordServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String competitionid = request.getParameter("competitionid");
		String levels = request.getParameter("levels");
		String grade = request.getParameter("grade");
		String majorname = request.getParameter("majorname");
		String classname = request.getParameter("classname");
		String studentid = request.getParameter("studentid");
		String studentname = request.getParameter("studentname");
		String competitiontype = request.getParameter("competitiontype");
		String ranks = request.getParameter("ranks");
		
		List<Record> list = rs.selectAllRecord(competitionid, levels, grade, majorname, classname, studentid, studentname,competitiontype, ranks);
		
		String jsonString = JSON.toJSONString(list);
		out.print(jsonString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
