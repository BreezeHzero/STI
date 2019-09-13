/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.service;

import java.util.List;


import com.ychs.sti.model.Usersti;

/**
 * UserstiService接口
 * @author hanyang
 * @version 1.0
 */
public interface UserstiService {
	/**
	 * 添加user
	 * @param user
	 * @return
	 */
	public int addUser(Usersti user);
	/**
	 * 多条件检索
	 * @param username
	 * @param realname
	 * @param userrole
	 * @return
	 */
	public List<Usersti> findUser(String username,String realname,String userrole);
	/**
	 * 更改用户角色
	 * @param userid
	 * @param userrole
	 * @return
	 */
	public int modifyUserRole(String userid,String userrole);
	/**
	 * 修改密码
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public int modifyUserpsw(String userid);
	/**
	 * 删除用户
	 * @param userid
	 * @return
	 */
	public int removeUser(String userid);
	/**
	 * 个人信息维护
	 * @param user
	 * @return
	 */
	public int modifyUserinfo(Usersti user);
	/**
	 * 登录验证
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public Usersti checkedLogin(String username,String userpsw);
}
