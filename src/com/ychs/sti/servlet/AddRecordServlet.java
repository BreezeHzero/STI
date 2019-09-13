package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AddRecordServlet
 */
@WebServlet("/AddRecordServlet")
public class AddRecordServlet extends HttpServlet {
	RecordService rs = new RecordServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRecordServlet() {
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
		String ranks = request.getParameter("ranks");
		String teamid = request.getParameter("teamid");
		String teamname = request.getParameter("teamname");
		
		Record record = new Record("",competitionid,ranks,teamid,teamname);
		int flag = rs.addRecord(record);
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
