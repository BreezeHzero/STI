/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.MajorMapper;
import com.ychs.sti.model.Major;
import com.ychs.sti.util.DButil;

/**
 * Major的DAO类
 * @author hanyang
 * @version 1.0 2019-8-11
 */
public class MajorDao {
	/**
	 * 查询出全部专业信息
	 * @return 返回的结果集
	 */
	public List<Major> selectMajors(){
		List<Major> list = new ArrayList<Major>();
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			MajorMapper majorMapper = session.getMapper(MajorMapper.class);
			list = majorMapper.selectAllMajor();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	public int insertMajor(int majorid,String departmentid,String majorname) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			MajorMapper major = session.getMapper(MajorMapper.class);
			flag = major.insertMajor(majorid, departmentid, majorname);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 *	按编号查找到专业
	 * @param majorid
	 * @return
	 */
	public List<Major> selectMajorById(String majorid){
		List<Major> list = new ArrayList<Major>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			MajorMapper major = session.getMapper(MajorMapper.class);
			list = major.selectMajorById(majorid);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 通过id修改专业名称
	 * @param majorid
	 * @param majorname
	 * @return
	 */
	public int updateMajor(String majorid,String majorname) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			MajorMapper major = session.getMapper(MajorMapper.class);
			flag = major.updateMajor(majorid, majorname);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 模糊查询专业
	 * @param name
	 * @return
	 */
	public List<Major> selectMajorByLike(String name){
		List<Major> list = new ArrayList<Major>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			MajorMapper major = session.getMapper(MajorMapper.class);
			list = major.selectMajorByLike(name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}
