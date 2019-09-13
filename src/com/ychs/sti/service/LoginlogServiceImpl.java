/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.LoginlogDao;
import com.ychs.sti.model.Loginlog;

/**
 * @author hanyang
 * @version 1.0
 */
public class LoginlogServiceImpl implements LoginlogService {
	LoginlogDao ld = new LoginlogDao();
	@Override
	public int addLoginlog(Loginlog loginlog) {
		return ld.insertLoginlog(loginlog);
	}
	@Override
	public List<Loginlog> findLoginlog(String realname) {
		return ld.selectLoginlog(realname);
	}
}
