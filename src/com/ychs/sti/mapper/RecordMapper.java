/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Record;

/**
 * @author hanyang
 * @version 1.0
 */
public interface RecordMapper {
	
	/**
	 * 获奖类型人数统计
	 * @return
	 */
	public List<Record> ranksNumber(@Param("competitionid")String competitionid,@Param("grade")String grade,@Param("studentid")String studentid,@Param("majorname")String majorname,@Param("classname")String classname);
	/**
	 * 录入信息
	 * @param record
	 * @return
	 */
	public int insertRecord(Record record);
	/**
	 * 
	 * @param start
	 * @param rows
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public List<Record> selectAllRecord(@Param("competitionid")String competitionid,@Param("levels")String levels,@Param("grade")String grade
			,@Param("majorname")String majorname,@Param("classname")String classname,@Param("studentid")String studentid,@Param("studentname")String studentname
			,@Param("competitiontype")String competitiontype,@Param("ranks")String ranks);
	/**
	 * 
	 * @param start
	 * @param rows
	 * @param levels
	 * @param grade
	 * @param majorname
	 * @param classname
	 * @param studentid
	 * @param competitiontype
	 * @param ranks
	 * @return
	 */
	public List<Record> selectRecordByPage(@Param("start")int start, @Param("rows")int rows,@Param("competitionid")String competitionid
			,@Param("levels")String levels,@Param("grade")String grade
			,@Param("majorname")String majorname,@Param("classname")String classname,@Param("studentid")String studentid,@Param("studentname")String studentname
			,@Param("competitiontype")String competitiontype,@Param("ranks")String ranks,@Param("teachername")String teachername);
	/**
	 * 查出总记录数
	 * @return
	 */
	public int selectTotalCount(@Param("competitionid")String competitionid,@Param("levels")String levels,@Param("grade")String grade
			,@Param("majorname")String majorname,@Param("classname")String classname,@Param("studentid")String studentid,@Param("studentname")String studentname
			,@Param("competitiontype")String competitiontype,@Param("ranks")String ranks,@Param("teachername")String teachername);
	/**
	 * 修改
	 * @param recordid
	 * @return
	 */
	public int updateRecord(@Param("recordid")String recordid);
	/**
	 * 删除
	 * @param recordid
	 * @return
	 */
	public int deleteRecord(@Param("recordid")String recordid);
}
