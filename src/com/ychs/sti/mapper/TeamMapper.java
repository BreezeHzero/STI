/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Team;

/**
 * @author hanyang
 * @version 1.0
 */
public interface TeamMapper {
	
	/**
	 * 各年级各专业获奖人数-可查询
	 * @return
	 */
	public List<Team> winnerMajorGradeNumber(@Param("competitionid")String competitionid,@Param("grade")String grade);
	/**
	 * 各专业参赛人数
	 * @return
	 */
	public List<Team> teammajorNumber(@Param("competitionid")String competitionid,@Param("grade")String grade,@Param("studentid")String studentid,@Param("majorname")String majorname,@Param("classname")String classname);
	/**
	 * 各班级参赛人数
	 * @return
	 */
	public List<Team> teamclassNumber(@Param("competitionid")String competitionid,@Param("grade")String grade,@Param("studentid")String studentid,@Param("classname")String classname);
	/**
	 * 各年级参赛人数
	 * @return
	 */
	public List<Team> teamgradeNumber(@Param("competitionid")String competitionid,@Param("grade")String grade,@Param("studentid")String studentid,@Param("classname")String classname);
	/**
	 * 年级参赛人数最多
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
	 * 本系参赛人数
	 * @return
	 */
	public int statAllTeamnumber();
	/**
	 * 获奖人数
	 * @return
	 */
	public int winnerNumber();
	/**
	 * 录入队伍信息
	 * @param team
	 * @return
	 */
	public int insertTeamInfo(Team team);
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
	public List<Team> selectTeamByPage(@Param("start")int start, @Param("rows")int rows,@Param("competitionname")String competitionname
			,@Param("teamname")String teamname,@Param("studentname")String studentname,@Param("teachername")String teachername
			,@Param("roleflag")String roleflag,@Param("majorname")String majorname,@Param("classname")String classname,@Param("grade")String grade);
	/**
	 * 查出总记录数
	 * @return
	 */
	public int selectTotalCount(@Param("competitionname")String competitionname,@Param("teamname")String teamname,@Param("studentname")String studentname,@Param("teachername")String teachername
			,@Param("roleflag")String roleflag,@Param("majorname")String majorname,@Param("classname")String classname,@Param("grade")String grade);
	/**
	 * 删除
	 * @param teamkey
	 * @return
	 */
	public int deleteTeam(@Param("teamkey")String teamkey);
	/**
	 * 修改
	 * @param team
	 * @return
	 */
	public int updateTeam(Team team);
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamByIdANDname(@Param("competitionid")String competitionid,@Param("teamid")String teamid,@Param("teamname")String teamname);
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamById(@Param("competitionid")String competitionid);
	/**
	 * 录入记录表时验证
	 * @param teamid
	 * @param teamname
	 * @return
	 */
	public List<Team> selectTeamnameById(@Param("teamid")String teamid);
}
