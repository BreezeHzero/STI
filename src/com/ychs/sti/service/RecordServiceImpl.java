/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.RecordDao;
import com.ychs.sti.model.PageBean;
import com.ychs.sti.model.Record;

/**
 * @author hanyang
 * @version 1.0
 */
public class RecordServiceImpl implements RecordService {
	RecordDao rd = new RecordDao();
	
	@Override
	public List<Record> ranksNumber(String competitionid,String grade,String studentid,String majorname,String classname) {
		return rd.ranksNumber(competitionid,grade,studentid,majorname,classname);
	}
	@Override
	public int addRecord(Record record) {
		return rd.insertRecord(record);
	}
	
	@Override
	public List<Record> selectAllRecord(String competitionid, String levels, String grade, String majorname,
			String classname, String studentid, String studentname, String competitiontype, String ranks) {
		return rd.selectAllRecord(competitionid, levels, grade, majorname, classname, studentid, studentname, competitiontype, ranks);
	}
	@Override
	public int findTotalCount(String competitionid,String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks,String teachername) {
		return rd.selectTotalCount(competitionid,levels, grade, majorname, classname, studentid, studentname,competitiontype, ranks,teachername);
	}
	@Override
	public PageBean<Record> findRecordByPage(String currentPage2, String rows2,String competitionid, String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks,String teachername) {
		int currentPage = Integer.parseInt(currentPage2);
		int rows = Integer.parseInt(rows2);
		
		PageBean<Record> pb = new PageBean<Record>();
		pb.setCurrentPage(currentPage);
		pb.setRows(rows);
		
		int totalCount = rd.selectTotalCount(competitionid,levels, grade, majorname, classname, studentid,studentname, competitiontype, ranks, teachername);
		pb.setTotalCount(totalCount);
		
		//计算开始索引
		int start = (currentPage - 1) * rows;
		List<Record> list = rd.selectRecordByPage(start, rows,competitionid, levels, grade, majorname, classname, studentid,studentname, competitiontype, ranks, teachername);
		pb.setList(list);
		
		// 计算总页码
		int totalPage = totalCount % rows == 0 ? totalCount/rows : (totalCount/rows)+1;
		pb.setTotalPage(totalPage);
		
		
		return pb;
	}
	@Override
	public int modifyRecord(String recordid) {
		return rd.updateRecord(recordid);
	}
	@Override
	public int removeRecord(String recordid) {
		return rd.deleteRecord(recordid);
	}
	
}
