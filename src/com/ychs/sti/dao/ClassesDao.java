/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.ClassesMapper;
import com.ychs.sti.model.Classes;
import com.ychs.sti.util.DButil;

/**
 * classes的dao类
 * @author hanyang
 * @version 1.0
 */
public class ClassesDao {
	/**
	 * 添加班级
	 * @param majorname 专业名称
	 * @param classname 班级名称
	 * @param grade 年级
	 * @return
	 */
	public int insertClass(String majorname,String classname,String grade) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper classesMapper = session.getMapper(ClassesMapper.class);
			flag = classesMapper.insertClass(majorname, classname, grade);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 查出总记录数
	 * @return
	 */
	public int selectTotalCount(String mname,String cname,String gradeword) {
		int count = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			count = cMapper.selectTotalCount(mname,cname,gradeword);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return count;
	}
	/**
	 * 查出从start页开始 rows行条数据
	 * @param start
	 * @param rows
	 * @return
	 */
	public List<Classes> selectClassByPage(int start, int rows,String mname,String cname,String gradeword){
		List<Classes> list = new ArrayList<Classes>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			list = cMapper.selectClassByPage(start, rows,mname,cname,gradeword);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
 	}
	/**
	 * 修改
	 * @param classid
	 * @param classname
	 * @param grade
	 * @return
	 */
	public int updateClass(String majorname,String classid,String classname,String grade) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			flag = cMapper.updateClass(majorname,classid, classname, grade);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 删除
	 * @param classid
	 * @return
	 */
	public int deleteClass(String classid) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			flag = cMapper.deleteClass(classid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 查出全部
	 * @return
	 */
	public List<Classes> selectAllClasses(){
		List<Classes> list = new ArrayList<Classes>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			list = cMapper.selectAllClasses();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 根据专业id查出班级信息
	 * @param majorid
	 * @return
	 */
	public List<Classes> selectClassinfoByMajorid(String majorname,String grade){
		List<Classes> list = new ArrayList<Classes>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			ClassesMapper cMapper = session.getMapper(ClassesMapper.class);
			list = cMapper.selectClassinfoByMajorid(majorname,grade);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}
