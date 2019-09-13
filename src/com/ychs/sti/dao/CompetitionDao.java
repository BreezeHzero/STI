/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.CompetitionMapper;
import com.ychs.sti.model.Competition;
import com.ychs.sti.util.DButil;

/**
 * competitionDAO表
 * @author hanyang
 * @version 1.0
 */
public class CompetitionDao {
	/**
	 * 统计各专业参与各级别奖项的队伍
	 * @return
	 */
	public List<Competition> countWinerMajorname(String competitionid,String grade){
		List<Competition> list = new ArrayList<Competition>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			list = cMapper.countWinerMajorname(competitionid,grade);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 比赛分级统计人数
	 * @return
	 */
	public List<Competition> countWinnerBylevels(){
		List<Competition> list = new ArrayList<Competition>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			list = cMapper.countWinnerBylevels();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 比赛分级统计
	 * @return
	 */
	public List<Competition> countCompetition(){
		List<Competition> list = new ArrayList<Competition>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			list = cMapper.countCompetition();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 录入赛事
	 * @param competition
	 * @return
	 */
	public int insertCompetition(Competition competition) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			flag = cMapper.insertCompetition(competition);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 分页查询和模糊查询多条件检索
	 * @param start
	 * @param rows
	 * @param comname
	 * @param startdate
	 * @param enddate
	 * @param levels
	 * @param comtype
	 * @return
	 */
	public List<Competition> selectCompetitionByPage(int start,int rows,String comname,String startdate,String enddate,String levels,String comtype){
		List<Competition> list = new ArrayList<Competition>();
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			list = cMapper.selectCompetitionByPage(start, rows, comname, startdate, enddate, levels, comtype);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 查询出页面记录条数
	 * @param comname
	 * @param startdate
	 * @param enddate
	 * @param levels
	 * @param comtype
	 * @return
	 */
	public int selectTotalCount(String comname,String startdate,String enddate,String levels,String comtype) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			flag = cMapper.selectTotalCount(comname, startdate, enddate, levels, comtype);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 修改
	 * @param competition
	 * @return
	 */
	public int updateCompetition(Competition competition) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			flag = cMapper.updateCompetition(competition);
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
	 * @param competitionid
	 * @return
	 */
	public int deleteCompetition(String competitionid) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			flag = cMapper.deleteCompetition(competitionid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 查询全部
	 * @return
	 */
	public List<Competition> selectCompetition(){
		List<Competition> list = new ArrayList<Competition>();
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			CompetitionMapper cMapper = session.getMapper(CompetitionMapper.class);
			list = cMapper.selectCompetition();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}
