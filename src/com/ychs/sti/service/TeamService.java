/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;


import java.util.List;

import com.ychs.sti.model.PageBean;
import com.ychs.sti.model.Team;

/**
 * @author hanyang
 * @version 1.0
 */
public interface TeamService {
	/**
	 * 各年级各专业获奖人数-可查询
	 * @return
	 */
	public List<Team> winnerMajorGradeNumber(String competitionid,String grade);
	/**
	 * 各专业参赛人数
	 * @return
	 */
	public List<Team> teammajorNumber(String competitionid,String grade,String studentid,String majorname,String classname);
	/**
	 * 各班级参赛人数
	 * @return
	 */
	public List<Team> teamclassNumber(String competitionid,String grade,String studentid,String classname);
	/**
	 * 各年级参赛人数
	 * @return
	 */
	public List<Team> teamgradeNumber(String competitionid,String grade,String studentid,String classname);
	/**
	 * 获奖率
	 * @return
	 */
	public List<String> teamMaxgradeRate();
	/**
	 * 年级参赛人数最多
	 * @return
	 */
	public List<String> teamMaxgrade();
	/**
	 * 参赛人数最多
	 * @return
	 */
	public List<String> teamMaxnumberRate();
	/**
	 * 参赛人数最多
	 * @return
	 */
	public List<String> teamMaxnumber();
	/**
	 * 获奖率
	 * @return
	 */
	public List<String> winnerRate();
	/**
	 * 获奖人数
	 * @return
	 */
	public int winnerNumber();
	/**
	 * 本系参赛人数
	 * @return
	 */
	public int statAllTeamnumber();
	/**
	 * 录入团队信息
	 * @param team
	 * @return
	 */
	public int addTeamInfo(Team team);

	/**
	 * 查询记录总数
	 * @return
	 */
	public int findTotalCount(String competitionname,String teamname,String studentname,String teachername
			,String roleflag,String majorname,String classname,String grade);
	/**
	 * 接受当前页，行数，将分页数据存放到pagebean中
	 * @param currentPage2
	 * @param rows2
	 * @param teamname
	 * @param studentname
	 * @param teachername
	 * @param roleflag
	 * @param majorname
	 * @param classname
	 * @param grade
	 * @return
	 */
	public PageBean<Team> findTeamByPage(String currentPage2, String rows2,String competitionname,String teamname,String studentname,String teachername
			,String roleflag,String majorname,String classname,String grade);
	/**
	 * 删除
	 * @param teamkey
	 * @return
	 */
	public int removeTeam(String teamkey);
	/**
	 * 修改
	 * @param team
	 * @return
	 */
	public int modifyTeam(Team team);
	/**
	 * 检查
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> findTeamByIdANDname(String competitionid,String teamid,String teamname);
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> findTeamById(String competitionid);
	/**
	 * 
	 * @param teamid
	 * @return
	 */
	public List<Team> findTeamnameById(String teamid);
	
}
