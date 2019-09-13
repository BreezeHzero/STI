package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.ychs.sti.model.Team;
import com.ychs.sti.service.TeamService;
import com.ychs.sti.service.TeamServiceImpl;

/**
 * Servlet implementation class UpdateTeamServlet
 */
@WebServlet("/UpdateTeamServlet")
public class UpdateTeamServlet extends HttpServlet {
	TeamService ts = new TeamServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String teamkey = request.getParameter("teamkey");
		String competitionid = request.getParameter("competitionid");
		String teamid = request.getParameter("teamid");
		String teamname = request.getParameter("teamname");
		String studentid = request.getParameter("studentid");
		String studentname = request.getParameter("studentname");
		String sex = request.getParameter("sex");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String roleflag = request.getParameter("roleflag");
		String teachername = request.getParameter("teachername");
		String departmentname = request.getParameter("departmentname");
		String majorname = request.getParameter("majorname");
		String grade = request.getParameter("grade");
		String classname = request.getParameter("classname");
		String userrealname = request.getParameter("userrealname");
		
		Team team = new Team(teamkey,competitionid,teamid,teamname,studentid,studentname,sex,mobile,email,roleflag,teachername,departmentname
				,majorname,grade,classname,userrealname);
		int flag = ts.modifyTeam(team);
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
