/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.model.Major;

/**
 * @author hanyang
 * @version 1.0
 */
public interface MajorService {
	/**
	 * 全部专业
	 * @return
	 */
	public List<Major> findAllMajors();
	/**
	 * 根据id找出专业
	 * @param majorid
	 * @return
	 */
	public List<Major> findMajorById(String majorid);
	/**
	 * 修改专门名称
	 * @param majorid
	 * @param majorname
	 * @return
	 */
	public int modifyMajor(String majorid,String majorname);
	/**
	 * 关键字查询
	 * @param name
	 * @return
	 */
	public List<Major> findMajorByLike(String name);
	/**
	 * 新增专业
	 * @param majorid
	 * @param departmentname
	 * @param majorname
	 * @return
	 */
	public int addMajor(int majorid,String departmentid,String majorname);
}
