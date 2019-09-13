package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.PageBean;
import com.ychs.sti.model.Team;
import com.ychs.sti.service.TeamService;
import com.ychs.sti.service.TeamServiceImpl;

/**
 * Servlet implementation class FindTeamByPageServlet
 */
@WebServlet("/FindTeamByPageServlet")
public class FindTeamByPageServlet extends HttpServlet {
	TeamService ts = new TeamServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindTeamByPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String currentPage = request.getParameter("currentPage");
		String rows = request.getParameter("rows");
		
		String competitionname = request.getParameter("competitionname");
		String teamname = request.getParameter("teamname");
		String studentname = request.getParameter("studentname");
		String teachername = request.getParameter("teachername");
		String roleflag = request.getParameter("roleflag");
		String majorname = request.getParameter("majorname");
		String classname = request.getParameter("classname");
		String grade = request.getParameter("grade");
		PageBean<Team> pBean = ts.findTeamByPage(currentPage, rows, competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
		String jsonString = JSON.toJSONString(pBean);
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
