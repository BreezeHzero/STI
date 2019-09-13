/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.model.Loginlog;

/**
 * @author hanyang
 * @version 1.0
 */
public interface LoginlogService {
	/**
	 * 插入登录信息
	 * @param loginlog
	 * @return
	 */
	public int addLoginlog(Loginlog loginlog);
	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Loginlog> findLoginlog(String realname);
}
