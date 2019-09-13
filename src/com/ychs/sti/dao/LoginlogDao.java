/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.LoginlogMapper;
import com.ychs.sti.model.Loginlog;
import com.ychs.sti.util.DButil;

/**
 * @author hanyang
 * @version 1.0
 */
public class LoginlogDao {
	/**
	 * 插入登录信息
	 * @param loginlog
	 * @return
	 */
	public int insertLoginlog(Loginlog loginlog) {
		int flag = 0;
		SqlSession session = null;
		
		try {
			session = DButil.getSession();
			LoginlogMapper loginlogMapper = session.getMapper(LoginlogMapper.class);
			flag = loginlogMapper.insertLoginlog(loginlog);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * loginlog的全部信息
	 * @return
	 */
	public List<Loginlog> selectLoginlog(String realname){
		List<Loginlog> list = new ArrayList<Loginlog>();
		SqlSession session = null;
		try {
			session = null;
			session = DButil.getSession();
			LoginlogMapper lm = session.getMapper(LoginlogMapper.class);
			list = lm.selectLoginlog(realname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}
