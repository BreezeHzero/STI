/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ychs.sti.mapper.UserstiMapper;
import com.ychs.sti.model.Usersti;
import com.ychs.sti.util.DButil;

/**
 * UserstiDAO类
 * @author hanyang
 * @version 1.0
 */
public class UserstiDao {
	/**
	 * 添加用户信息
	 * @param user
	 * @return
	 */
	public int insertUser(Usersti user) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			flag = uMapper.insertUser(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 模糊查询+多条件检索
	 * @return
	 */
	public List<Usersti> selectUserByLike(String username,String realname,String userrole){
		List<Usersti> list = new ArrayList<Usersti>();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			list = uMapper.selectUserByLike(username, realname, userrole);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
	/**
	 * 更改用户角色
	 * @param userid
	 * @return
	 */
	public int updateUserRole(String userid,String userrole) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			flag = uMapper.updateUserRole(userid,userrole);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 修改密码
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public int updateUserpsw(String userid) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			flag = uMapper.updateUserpsw(userid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 删除用户
	 * @param userid
	 * @return
	 */
	public int deleteUser(String userid) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			flag = uMapper.deleteUser(userid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 个人信息维护
	 * @param user
	 * @return
	 */
	public int updateUserinfo(Usersti user) {
		int flag = 0;
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			flag = uMapper.updateUserinfo(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return flag;
	}
	/**
	 * 登录验证
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public Usersti checkedLogin(String username,String userpsw){
		Usersti list = new Usersti();
		SqlSession session = null;
		try {
			session = DButil.getSession();
			UserstiMapper uMapper = session.getMapper(UserstiMapper.class);
			list = uMapper.checkedLogin(username, userpsw);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeSession(session);
		}
		return list;
	}
}	
