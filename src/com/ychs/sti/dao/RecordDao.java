/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.RecordMapper;
import com.ychs.sti.model.Record;
import com.ychs.sti.util.DButil;

/**
 * @author hanyang
 * @version 1.0
 */
public class RecordDao {
	/**
	 * 获奖类型人数统计
	 * @return
	 */
	public List<Record> ranksNumber(String competitionid,String grade,String studentid,String majorname,String classname){
		List<Record> list = new ArrayList<Record>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			list = rm.ranksNumber(competitionid,grade,studentid,majorname,classname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 录入信息
	 * @param record
	 * @return
	 */
	public int insertRecord(Record record) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			flag = rm.insertRecord(record);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 
	 * @param start
	 * @param rows
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public List<Record> selectAllRecord(String competitionid,String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks){
		List<Record> list = new ArrayList<Record>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			list = rm.selectAllRecord(competitionid,levels, grade, majorname, classname, studentid,studentname, competitiontype, ranks);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 
	 * @param start
	 * @param rows
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public List<Record> selectRecordByPage(int start,int rows,String competitionid,String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks,String teachername){
		List<Record> list = new ArrayList<Record>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			list = rm.selectRecordByPage(start, rows,competitionid,levels, grade, majorname, classname, studentid,studentname, competitiontype, ranks,teachername);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 查出总记录数
	 * @return
	 */
	public int selectTotalCount(String competitionid,String levels,String grade,String majorname,String classname,String studentid,String studentname
			,String competitiontype,String ranks,String teachername) {
		int count = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			count = rm.selectTotalCount(competitionid,levels, grade, majorname, classname, studentid, studentname,competitiontype, ranks,teachername);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return count;
	}
	/**
	 * 修改
	 * @param recordid
	 * @return
	 */
	public int updateRecord(String recordid) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			flag = rm.updateRecord(recordid);
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
	 * @param recordid
	 * @return
	 */
	public int deleteRecord(String recordid) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			RecordMapper rm = session.getMapper(RecordMapper.class);
			flag = rm.deleteRecord(recordid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
}
