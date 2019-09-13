/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;


import java.util.List;

import com.ychs.sti.model.Classes;
import com.ychs.sti.model.PageBean;

/**
 * @author hanyang
 * @version 1.0
 */
public interface ClassesService {
	/**
	 * 添加班级
	 * @param majorname
	 * @param classname
	 * @param grade
	 * @return
	 */
	public int addClass(String majorname,String classname,String grade);
	/**
	 * 查询记录总数
	 * @return
	 */
	public int findTotalCount(String mname,String cname,String gradeword);
	/**
	 * 查出从start开始，rows行记录
	 * @param currentPage2
	 * @param rows2
	 * @return
	 */
	public PageBean<Classes> findClassByPage(String currentPage2, String rows2,String mname,String cname,String gradeword);
	/**
	 * 修改数据
	 * @param classid
	 * @param classname
	 * @param grade
	 * @return
	 */
	public int modifyClass(String majorname,String classid,String classname,String grade);
	/**
	 * 删除班级
	 * @param classid
	 * @return
	 */
	public int removeClass(String classid);
	/**
	 * 查出全部
	 * @return
	 */
	public List<Classes> findAllClasses();
	/**
	 * 根据majorid差出classesinfo
	 * @param majorid
	 * @return
	 */
	public List<Classes> findClssesinfoByMajorid(String majorname,String grade);
}
