/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Loginlog;

/**
 * @author hanyang
 * @version 1.0
 */
public interface LoginlogMapper {
	/**
	 * 插入登录信息
	 * @param loginlog
	 * @return
	 */
	public int insertLoginlog(Loginlog loginlog);
	/**
	 * loginlog的全部信息
	 * @return
	 */
	public List<Loginlog> selectLoginlog(@Param("realname")String realname);
}
