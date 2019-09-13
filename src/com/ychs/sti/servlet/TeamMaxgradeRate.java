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
import com.ychs.sti.service.TeamService;
import com.ychs.sti.service.TeamServiceImpl;

/**
 * Servlet implementation class TeamMaxgradeRate
 */
@WebServlet("/TeamMaxgradeRate")
public class TeamMaxgradeRate extends HttpServlet {
	TeamService ts = new TeamServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamMaxgradeRate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		List<String> list = ts.teamMaxgradeRate();
		
		String number = list.get(0);
		if(number.indexOf(".") != -1) {
			int num = 0;
			num = number.indexOf(".");
			
			 String dianAfter = number.substring(0,num+1);
   	   	  	 String afterData = number.replace(dianAfter, "");
   	   	  	 if(afterData.length() < 2){
   	   	  	    afterData = afterData + "0" ;
   	   	  	 }else{
   	   	  		 afterData = afterData;
   	   	  	 }
   	   	  	 	number =  number.substring(0,num) + "." + afterData.substring(0,2);
   	   	  	 	System.out.println(number);
   	   	  }else{
   	   	  	if(number == "1"){
   	   	  		number = "100";
   	   	  	}else{
   	   	  		out.print(JSON.toJSONString(number));
   	   	  	}
		}
		out.print(JSON.toJSONString(number));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
