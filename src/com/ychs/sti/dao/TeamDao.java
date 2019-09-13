/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.TeamMapper;
import com.ychs.sti.model.Team;
import com.ychs.sti.util.DButil;

/**
 * @author hanyang
 * @version 1.0
 */
public class TeamDao {
	/**
	 * 各年级各专业获奖人数-可查询
	 * @return
	 */
	public List<Team> winnerMajorGradeNumber(String competitionid,String grade){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.winnerMajorGradeNumber(competitionid,grade);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 各专业参赛人数
	 * @return
	 */
	public List<Team> teammajorNumber(String competitionid,String grade,String studentid,String majorname,String classname){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teammajorNumber(competitionid,grade,studentid,majorname,classname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 各班级参赛人数
	 * @return
	 */
	public List<Team> teamclassNumber(String competitionid,String grade,String studentid,String classname){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamclassNumber(competitionid,grade,studentid,classname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 各年级参赛人数
	 * @return
	 */
	public List<Team> teamgradeNumber(String competitionid,String grade,String studentid,String classname){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamgradeNumber(competitionid,grade,studentid,classname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 获奖率
	 * @return
	 */
	public List<String> teamMaxgradeRate(){
		List<String> list = new ArrayList<String>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamMaxgradeRate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 年级参赛人数最多
	 * @return
	 */
	public List<String> teamMaxgrade(){
		List<String> list = new ArrayList<String>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamMaxgrade();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 参赛人数最多
	 * @return
	 */
	public List<String> teamMaxnumberRate(){
		List<String> list = new ArrayList<String>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamMaxnumberRate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 参赛人数最多
	 * @return
	 */
	public List<String> teamMaxnumber(){
		List<String> list = new ArrayList<String>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.teamMaxnumber();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 获奖率
	 * @return
	 */
	public List<String> winnerRate() {
		List<String> list = new ArrayList<String>();
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.winnerRate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 获奖人数
	 * @return
	 */
	public int winnerNumber() {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			flag = tMapper.winnerNumber();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 本系参赛人数
	 * @return
	 */
	public int statAllTeamnumber() {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session =DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			flag = tMapper.statAllTeamnumber();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 录入队伍信息
	 * @param team
	 * @return
	 */
	public int insertTeamInfo(Team team) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = null;
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			flag = tMapper.insertTeamInfo(team);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 分页+模糊查询
	 * @param start
	 * @param rows
	 * @param teamname
	 * @param studentname
	 * @param teachername
	 * @param roleflag
	 * @param majorname
	 * @param classname
	 * @param grade
	 * @return
	 */
	public List<Team> selectTeamByPage(int start,int rows,String competitionname
			,String teamname,String studentname,String teachername
			,String roleflag,String majorname,String classname,String grade){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.selectTeamByPage(start, rows, competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
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
	public int selectTotalCount(String competitionname,String teamname,String studentname,String teachername
			,String roleflag,String majorname,String classname,String grade) {
		int count = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			count = tMapper.selectTotalCount(competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return count;
	}
	/**
	 * 删除
	 * @param teamkey
	 * @return
	 */
	public int deleteTeam(String teamkey) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			flag = tMapper.deleteTeam(teamkey);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 修改
	 * @param team
	 * @return
	 */
	public int updateTeam(Team team) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			flag = tMapper.updateTeam(team);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamByIdANDname(String competitionid,String teamid,String teamname){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.selectTeamByIdANDname(competitionid,teamid, teamname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamById(String competitionid){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.selectTeamById(competitionid);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamnameById(String teamid){
		List<Team> list = new ArrayList<Team>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			TeamMapper tMapper = session.getMapper(TeamMapper.class);
			list = tMapper.selectTeamnameById(teamid);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}
