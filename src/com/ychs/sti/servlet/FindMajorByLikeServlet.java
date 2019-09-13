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
import com.alibaba.fastjson.JSONObject;
import com.ychs.sti.model.Major;
import com.ychs.sti.service.MajorService;
import com.ychs.sti.service.MajorServiceImpl;

/**
 * Servlet implementation class FindMajorByLikeServlet
 */
@WebServlet("/FindMajorByLikeServlet")
public class FindMajorByLikeServlet extends HttpServlet {
	MajorService mService = new MajorServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMajorByLikeServlet() {
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
		
		String name = request.getParameter("name");
		List<Major> list = mService.findMajorByLike(name);
		JSONObject obj = new JSONObject();
		obj.put("code",0);
		obj.put("msg","");
		obj.put("count",1000);
		obj.put("data",list);
		String jsonStr = JSON.toJSONString(obj);
	    out.print(jsonStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
