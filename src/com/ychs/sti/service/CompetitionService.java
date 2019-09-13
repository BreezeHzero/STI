/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.model.Competition;
import com.ychs.sti.model.PageBean;

/**
 * Competition业务层
 * @author hanyang
 * @version 1.0
 */
public interface CompetitionService {
	/**
	 * 统计各专业参与各级别奖项的队伍
	 * @return
	 */
	public List<Competition> countWinerMajorname(String competitionid,String grade);
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
	 * 录入赛事信息
	 * @param competition
	 * @return
	 */
	public int addCompetition(Competition competition);
	/**
	 * 分页的全部信息
	 * @param currentPage2
	 * @param rows2
	 * @param comname
	 * @param startdate
	 * @param enddate
	 * @param levels
	 * @param comtype
	 * @return
	 */
	public PageBean<Competition> findCompetitionByPage(String currentPage2, String rows2,String comname,String startdate,String enddate,String levels,String comtype);
	/**
	 * 条数
	 * @param comname
	 * @param startdate
	 * @param enddate
	 * @param levels
	 * @param comtype
	 * @return
	 */
	public int findTotalCount(String comname,String startdate,String enddate,String levels,String comtype);
	/**
	 * 修改
	 * @param competition
	 * @return
	 */
	public int modifyCompetition(Competition competition);
	/**
	 * 删除
	 * @param competitionid
	 * @return
	 */
	public int removeCompetition(String competitionid);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Competition> findCompetition();
}
