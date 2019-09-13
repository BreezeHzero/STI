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
import com.ychs.sti.model.Major;
import com.ychs.sti.service.MajorService;
import com.ychs.sti.service.MajorServiceImpl;

/**
 * Servlet implementation class FindAllMajorServlet
 */
@WebServlet("/FindAllMajorServlet")
public class FindAllMajorServlet extends HttpServlet {
	MajorService ms = new MajorServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FindAllMajorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		
		
		List<Major> list = ms.findAllMajors();
		System.out.println(list);
		
// 		JSONObject obj=new JSONObject();
         //前台通过key值获得对应的value值
// 		obj.put("code", 0);
//         obj.put("msg", "");
//        obj.put("count",1000);
//         obj.put("data",list);
//         String jsonStr = JSON.toJSONString(obj);
// 		out.print(jsonStr);
		
		
        String jsonString = JSON.toJSONString(list);
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
