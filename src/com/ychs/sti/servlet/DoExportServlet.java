package com.ychs.sti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.ychs.sti.model.Record;
import com.ychs.sti.util.ExportExcel;

/**
 * Servlet implementation class DoExportServlet
 */
@WebServlet("/DoExportServlet")
public class DoExportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoExportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		//HttpSession session = request.getSession();
		//String record = (String)session.getAttribute("recordlist");
		String userList = request.getParameter("userList");
		List<Record> mgUsers = JSONArray.parseArray(userList, Record.class);
		// ReturnResult returnResult = new ReturnResult();
		// 定义表的标题
		String title = "获奖人员信息表";
		// 定义表的列名
//		String[] header_data = request.getParameterValues("header_data");
		String[] rowsName = {"编号","赛事名称","队伍名称","年级","专业","班级","姓名","学号","级别","类型","获奖等级","电话","邮箱"};
		// 定义表的内容
		ExportExcel excelUtil = new ExportExcel();

		List<Object[]> dataList = new ArrayList<Object[]>();

		for (int i = 0; i < mgUsers.size(); i++) {
			Object[] objects = new Object[rowsName.length];
			//填充行数据
			
			//objects[0] = mgUsers.get(i);
			objects[1] = mgUsers.get(i).getCompetitionname();
			objects[2] = mgUsers.get(i).getTeamname();
			objects[3] = mgUsers.get(i).getGrade();
			objects[4] = mgUsers.get(i).getMajorname();
			objects[5] = mgUsers.get(i).getClassname();
			objects[6] = mgUsers.get(i).getStudentname();
			objects[7] = mgUsers.get(i).getStudentid();
			objects[8] = mgUsers.get(i).getLevels();
			objects[9] = mgUsers.get(i).getCompetitiontype();
			objects[10] = mgUsers.get(i).getRanks();
			objects[11] = mgUsers.get(i).getMobile();
			objects[12] = mgUsers.get(i).getEmail();

			
			dataList.add(objects);
		}

		try {
			String fileName = new String("获奖人员信息表.xls".getBytes("UTF-8"), "iso-8859-1"); // 生成word文件的文件名
			excelUtil.exportExcel(title, rowsName, dataList, fileName, response);
			// returnInfo.setResult(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
