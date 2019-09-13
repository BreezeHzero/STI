/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.model.PageBean;
import com.ychs.sti.model.Record;

/**
 * @author hanyang
 * @version 1.0
 */
public interface RecordService {
	/**
	 * 获奖类型人数统计
	 * @return
	 */
	public List<Record> ranksNumber(String competitionid,String grade,String studentid,String majorname,String classname);
	/**
	 * 录入
	 * @param record
	 * @return
	 */
	public int addRecord(Record record);
	/**
	 * 查询记录总数
	 * @return
	 */
	public int findTotalCount(String competitionid,String levels,String grade,String majorname,String classname,String studentid,String studentname
			,String competitiontype,String ranks,String teachername);
	/**
	 * 
	 * @param competitionid
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param studentname
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public List<Record> selectAllRecord(String competitionid,String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks);
	/**
	 * 
	 * @param currentPage2
	 * @param rows2
	 * @param competitionid
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param studentname
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public PageBean<Record> findRecordByPage(String currentPage2, String rows2,String competitionid,String levels,String grade,String majorname,String classname,String studentid
			,String studentname,String competitiontype,String ranks,String teachername);
	/**
	 * 修改
	 * @param recordid
	 * @return
	 */
	public int modifyRecord(String recordid);
	/**
	 * 删除
	 * @param recordid
	 * @return
	 */
	public int removeRecord(String recordid);
}
