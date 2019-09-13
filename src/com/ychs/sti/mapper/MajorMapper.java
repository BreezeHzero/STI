/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Major;

/**
 * Major表的映射接口
 * @author hanyang
 * @version 1.0 2019-8-11
 */
public interface MajorMapper {
	/**
	 * 查询出全部专业，无条件
	 * @return 返回查询的结果集
	 */
	public List<Major> selectAllMajor();

	public int insertMajor(@Param("majorid")int majorid,@Param("departmentid")String departmentid,@Param("majorname")String majorname);
	/**
	 *	按编号查找到专业
	 * @param majorid
	 * @return
	 */
	public List<Major> selectMajorById(String majorid);
	/**
	 * 通过id修改专业名
	 * @param majorid
	 * @param majorname
	 * @return
	 */
	public int updateMajor(@Param("majorid")String majorid,@Param("majorname")String majorname);
	/**
	 * 模糊查询专业
	 * @param name
	 * @return
	 */
	public List<Major> selectMajorByLike(@Param("name")String name);
}
