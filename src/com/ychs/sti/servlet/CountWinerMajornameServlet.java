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
import com.ychs.sti.model.Competition;
import com.ychs.sti.service.CompetitionService;
import com.ychs.sti.service.CompetitionServiceImpl;

/**
 * Servlet implementation class CountWinerMajornameServlet
 */
@WebServlet("/CountWinerMajornameServlet")
public class CountWinerMajornameServlet extends HttpServlet {
	CompetitionService cs = new CompetitionServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountWinerMajornameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String grade = request.getParameter("grade");
		String competitionid = request.getParameter("competitionid");
		List<Competition> list = cs.countWinerMajorname(competitionid,grade);
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
