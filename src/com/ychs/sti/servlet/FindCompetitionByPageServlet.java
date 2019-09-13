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
import com.ychs.sti.model.PageBean;
import com.ychs.sti.service.CompetitionService;
import com.ychs.sti.service.CompetitionServiceImpl;

/**
 * Servlet implementation class FindCompetitionByPageServlet
 */
@WebServlet("/FindCompetitionByPageServlet")
public class FindCompetitionByPageServlet extends HttpServlet {
	CompetitionService cs = new CompetitionServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCompetitionByPageServlet() {
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
		//从页面获取参数 
		String currentPage = request.getParameter("currentPage");//当前页码
		String rows = request.getParameter("rows");//每页显示的条数
		
		String comname = request.getParameter("comname");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		String levels = request.getParameter("levels");
		String comtype = request.getParameter("comtype");
		
		//调用service查询
		PageBean<Competition> pBean = cs.findCompetitionByPage(currentPage, rows,comname,startdate,enddate,levels,comtype);
		
		System.out.println(pBean.getList());
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
