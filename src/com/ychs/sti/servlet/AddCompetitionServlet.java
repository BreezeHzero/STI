package com.ychs.sti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AddCompetitionServlet
 */
@WebServlet("/AddCompetitionServlet")
public class AddCompetitionServlet extends HttpServlet {
	CompetitionService cs = new CompetitionServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCompetitionServlet() {
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
		String competitionid = request.getParameter("competitionid");
		String competitionname = request.getParameter("competitionname");
		String competitiondate = request.getParameter("competitiondate");
		String levels = request.getParameter("levels");
		String competitiontype = request.getParameter("competitiontype");
		String competitiondesc = request.getParameter("competitiondesc");
		
		Competition competition = new Competition(competitionid,competitionname,competitiondate,levels,competitiontype,competitiondesc);
		int flag = cs.addCompetition(competition);
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
