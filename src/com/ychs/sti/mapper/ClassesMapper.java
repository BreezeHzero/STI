/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Classes;

/**
 * classes表映射接口
 * @author hanyang
 * @version 1.0
 */
public interface ClassesMapper {
	/**
	 * 添加班级
	 * @param majorname 专业名称
	 * @param classname 班级名称
	 * @param grade 年级
	 * @return
	 */
	public int insertClass(@Param("majorname")String majorname,@Param("classname")String classname,@Param("grade")String grade);
	/**
	 * 查出总记录数
	 * @return
	 */
	public int selectTotalCount(@Param("mname")String mname,@Param("cname")String cname,@Param("gradeword")String gradeword);
	/**
	 * 查出从start页开始 rows行条数据
	 * @param start
	 * @param rows
	 * @return
	 */
	public List<Classes> selectClassByPage(@Param("start")int start, @Param("rows")int rows,@Param("mname")String mname,@Param("cname")String cname,@Param("gradeword")String gradeword);
	/**
	 * 通过
	 * @param classid
	 * @param classname
	 * @param grade
	 * @return
	 */
	public int updateClass(@Param("majorname")String majorname,@Param("classid")String classid,@Param("classname")String classname,@Param("grade")String grade);
	/**
	 * 删除
	 * @param classid
	 * @return
	 */
	public int deleteClass(@Param("classid")String classid);
	/**
	 * 查出全部
	 * @return
	 */
	public List<Classes> selectAllClasses();
	/**
	 * 根据专业id查出班级信息
	 * @param majorid
	 * @return
	 */
	public List<Classes> selectClassinfoByMajorid(@Param("majorname")String majorname,@Param("grade")String grade);
}
