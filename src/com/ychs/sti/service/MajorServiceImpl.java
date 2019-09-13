/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.MajorDao;
import com.ychs.sti.model.Major;


/**
 * @author hanyang
 * @version 1.0
 */
public class MajorServiceImpl implements MajorService{
	MajorDao md = new MajorDao();
	@Override
	public List<Major> findAllMajors() {
		return md.selectMajors();
	}
	@Override
	public List<Major> findMajorById(String majorid) {
		return md.selectMajorById(majorid);
	}
	@Override
	public int modifyMajor(String majorid, String majorname) {
		return md.updateMajor(majorid, majorname);
	}
	@Override
	public List<Major> findMajorByLike(String name) {
		return md.selectMajorByLike(name);
	}
	@Override
	public int addMajor(int majorid, String departmentid, String majorname) {
		return md.insertMajor(majorid, departmentid, majorname);
	}
	
}
