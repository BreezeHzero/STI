package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.service.RecordService;
import com.ychs.sti.service.RecordServiceImpl;

/**
 * Servlet implementation class RemoveRecordServlet
 */
@WebServlet("/RemoveRecordServlet")
public class RemoveRecordServlet extends HttpServlet {
	RecordService rs = new RecordServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String recordid = request.getParameter("recordid");
		int flag = rs.removeRecord(recordid);
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
