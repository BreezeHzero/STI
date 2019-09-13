/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;

import com.ychs.sti.dao.UserstiDao;
import com.ychs.sti.model.Usersti;

/**
 * @author hanyang
 * @version 1.0
 */
public class UserstiServiceImpl implements UserstiService {
	UserstiDao udao = new UserstiDao();
	@Override
	public int addUser(Usersti user) {
		return udao.insertUser(user);
	}
	@Override
	public List<Usersti> findUser(String username, String realname, String userrole) {
		return udao.selectUserByLike(username, realname, userrole);
	}
	@Override
	public int modifyUserRole(String userid, String userrole) {
		return udao.updateUserRole(userid, userrole);
	}
	@Override
	public int modifyUserpsw(String userid) {
		return udao.updateUserpsw(userid);
	}
	@Override
	public int removeUser(String userid) {
		return udao.deleteUser(userid);
	}
	@Override
	public int modifyUserinfo(Usersti user) {
		return udao.updateUserinfo(user);
	}
	@Override
	public Usersti checkedLogin(String username, String userpsw) {
		return udao.checkedLogin(username, userpsw);
	}

}
