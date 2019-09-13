/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Competition;

/**
 * competition表的接口映射
 * @author hanyang
 * @version 1.0
 */
public interface CompetitionMapper {
	/**
	 * 统计各专业参与各级别奖项的队伍
	 * @return
	 */
	public List<Competition> countWinerMajorname(@Param("competitionid")String competitionid,@Param("grade")String grade);
	/**
	 * 比赛分级统计人数
	 * @return
	 */
	public List<Competition> countWinnerBylevels();
	/**
	 * 比赛分级统计
	 * @return
	 */
	public List<Competition> countCompetition();
	/**
	 * 录入赛事
	 * @param competition
	 * @return
	 */
	public int insertCompetition(Competition competition);
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
	public List<Competition> selectCompetitionByPage(@Param("start")int start, @Param("rows")int rows,
			@Param("comname")String comname,@Param("startdate")String startdate,@Param("enddate")String enddate,
			@Param("levels")String levels,@Param("comtype")String comtype);
	/**
	 * 查询出页面记录条数
	 * @param comname
	 * @param startdate
	 * @param enddate
	 * @param levels
	 * @param comtype
	 * @return
	 */
	public int selectTotalCount(@Param("comname")String comname,@Param("startdate")String startdate,@Param("enddate")String enddate,
			@Param("levels")String levels,@Param("comtype")String comtype);
	/**
	 * 修改
	 * @param competition
	 * @return
	 */
	public int updateCompetition(Competition competition);
	/**
	 * 删除
	 * @param competitionid
	 * @return
	 */
	public int deleteCompetition(String competitionid);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Competition> selectCompetition();
}
