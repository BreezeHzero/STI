/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.CompetitionDao;
import com.ychs.sti.model.Competition;
import com.ychs.sti.model.PageBean;


/**
 * @author hanyang
 * @version 1.0
 */
public class CompetitionServiceImpl implements CompetitionService {
	CompetitionDao cd = new CompetitionDao();
	
	@Override
	public List<Competition> countWinerMajorname(String competitionid,String grade) {
		return cd.countWinerMajorname(competitionid,grade);
	}
	@Override
	public List<Competition> countWinnerBylevels() {
		return cd.countWinnerBylevels();
	}
	@Override
	public List<Competition> countCompetition() {
		return cd.countCompetition();
	}
	@Override
	public int addCompetition(Competition competition) {
		return cd.insertCompetition(competition);
	}
	@Override
	public PageBean<Competition> findCompetitionByPage(String currentPage2, String rows2, String comname,
			String startdate, String enddate, String levels, String comtype) {
		int currentPage = Integer.parseInt(currentPage2);
		int rows = Integer.parseInt(rows2);
		
		PageBean<Competition> pb = new PageBean<Competition>();
		pb.setCurrentPage(currentPage);
		pb.setRows(rows);
		
		int totalCount = cd.selectTotalCount(comname, startdate, enddate, levels, comtype);
		pb.setTotalCount(totalCount);
		
		//计算开始索引
		int start = (currentPage - 1) * rows;
		List<Competition> list = cd.selectCompetitionByPage(start, rows,comname, startdate, enddate, levels, comtype); 
		pb.setList(list);
		
		// 计算总页码
		int totalPage = totalCount % rows == 0 ? totalCount/rows : (totalCount/rows)+1;
		pb.setTotalPage(totalPage);
		
		return pb;
	}
	@Override
	public int findTotalCount(String comname, String startdate, String enddate, String levels, String comtype) {
		return cd.selectTotalCount(comname, startdate, enddate, levels, comtype);
	}
	@Override
	public int modifyCompetition(Competition competition) {
		return cd.updateCompetition(competition);
	}
	@Override
	public int removeCompetition(String competitionid) {
		return cd.deleteCompetition(competitionid);
	}
	@Override
	public List<Competition> findCompetition() {
		return cd.selectCompetition();
	}
	
	
}
