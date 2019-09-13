/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;


import java.util.List;

import com.ychs.sti.dao.TeamDao;
import com.ychs.sti.model.PageBean;
import com.ychs.sti.model.Team;


/**
 * @author hanyang
 * @version 1.0
 */
public class TeamServiceImpl implements TeamService {
	TeamDao td = new TeamDao();
	
	@Override
	public List<Team> winnerMajorGradeNumber(String competitionid,String grade) {
		return td.winnerMajorGradeNumber(competitionid,grade);
	}
	@Override
	public List<Team> teammajorNumber(String competitionid,String grade,String studentid,String majorname,String classname) {
		return td.teammajorNumber(competitionid,grade,studentid,majorname,classname);
	}
	@Override
	public List<Team> teamclassNumber(String competitionid,String grade,String studentid,String classname) {
		return td.teamclassNumber(competitionid,grade,studentid,classname);
	}
	@Override
	public List<Team> teamgradeNumber(String competitionid,String grade,String studentid,String classname) {
		return td.teamgradeNumber(competitionid,grade,studentid,classname);
	}
	@Override
	public List<String> teamMaxgradeRate() {
		return td.teamMaxgradeRate();
	}
	@Override
	public List<String> teamMaxgrade() {
		return td.teamMaxgrade();
	}
	@Override
	public List<String> teamMaxnumberRate() {
		return td.teamMaxnumberRate();
	}
	@Override
	public List<String> teamMaxnumber() {
		return td.teamMaxnumber();
	}
	@Override
	public List<String> winnerRate() {
		return td.winnerRate();
	}
	@Override
	public int winnerNumber() {
		return td.winnerNumber();
	}
	@Override
	public int statAllTeamnumber() {
		return td.statAllTeamnumber();
	}
	@Override
	public int addTeamInfo(Team team) {
		return td.insertTeamInfo(team);
	}
	@Override
	public int findTotalCount(String competitionname,String teamname, String studentname, String teachername, String roleflag,
			String majorname, String classname, String grade) {
		return td.selectTotalCount(competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
	}
	@Override
	public PageBean<Team> findTeamByPage(String currentPage2, String rows2, String competitionname,String teamname, String studentname,
			String teachername, String roleflag, String majorname, String classname, String grade) {
		int currentPage = Integer.parseInt(currentPage2);
		int rows = Integer.parseInt(rows2);
		
		PageBean<Team> pb = new PageBean<Team>();
		pb.setCurrentPage(currentPage);
		pb.setRows(rows);
		
		int totalCount = td.selectTotalCount(competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
		pb.setTotalCount(totalCount);
		
		//计算开始索引
		int start = (currentPage - 1) * rows;
		List<Team> list = td.selectTeamByPage(start, rows, competitionname,teamname, studentname, teachername, roleflag, majorname, classname, grade);
		pb.setList(list);
		
		// 计算总页码
		int totalPage = totalCount % rows == 0 ? totalCount/rows : (totalCount/rows)+1;
		pb.setTotalPage(totalPage);
		
		
		return pb;
	}
	@Override
	public int removeTeam(String teamkey) {
		return td.deleteTeam(teamkey);
	}
	@Override
	public int modifyTeam(Team team) {
		return td.updateTeam(team);
	}
	@Override
	public List<Team> findTeamByIdANDname(String competitionid,String teamid, String teamname) {
		return td.selectTeamByIdANDname(competitionid,teamid, teamname);
	}
	@Override
	public List<Team> findTeamById(String competitionid) {
		return td.selectTeamById(competitionid);
	}
	@Override
	public List<Team> findTeamnameById(String teamid) {
		return td.selectTeamnameById(teamid);
	}

}
