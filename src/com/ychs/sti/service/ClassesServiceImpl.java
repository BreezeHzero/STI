/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.ClassesDao;
import com.ychs.sti.model.Classes;
import com.ychs.sti.model.PageBean;

/**
 * @author hanyang
 * @version 1.0
 */
public class ClassesServiceImpl implements ClassesService {
	ClassesDao cd = new ClassesDao();
	@Override
	public int addClass(String majorname, String classname, String grade) {
		return cd.insertClass(majorname, classname, grade);
	}
	@Override
	public int findTotalCount(String mname,String cname,String gradeword) {
		return cd.selectTotalCount(mname,cname,gradeword);
	}
	@Override
	public PageBean<Classes> findClassByPage(String currentPage2, String rows2,String mname,String cname,String gradeword) {
		int currentPage = Integer.parseInt(currentPage2);
		int rows = Integer.parseInt(rows2);
		
		PageBean<Classes> pb = new PageBean<Classes>();
		pb.setCurrentPage(currentPage);
		pb.setRows(rows);
		
		int totalCount = cd.selectTotalCount(mname,cname,gradeword);
		pb.setTotalCount(totalCount);
		
		//计算开始索引
		int start = (currentPage - 1) * rows;
		List<Classes> list = cd.selectClassByPage(start, rows,mname,cname,gradeword); 
		pb.setList(list);
		
		// 计算总页码
		int totalPage = totalCount % rows == 0 ? totalCount/rows : (totalCount/rows)+1;
		pb.setTotalPage(totalPage);
		
		
		return pb;
	}
	@Override
	public int modifyClass(String majorname,String classid, String classname, String grade) {
		return cd.updateClass(majorname,classid, classname, grade);
	}
	@Override
	public int removeClass(String classid) {
		return cd.deleteClass(classid);
	}
	@Override
	public List<Classes> findAllClasses() {
		return cd.selectAllClasses();
	}
	@Override
	public List<Classes> findClssesinfoByMajorid(String majorname,String grade) {
		return cd.selectClassinfoByMajorid(majorname,grade);
	}
	
}
