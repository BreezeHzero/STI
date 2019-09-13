/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ychs.sti.model.Usersti;

/**
 * usersti表的映射接口
 * @author hanyang
 * @version 1.0
 */
public interface UserstiMapper {
	/**
	 * 添加用户信息
	 * @param user
	 * @return
	 */
	public int insertUser(Usersti user);
	/**
	 * 查询
	 * @param username
	 * @param realname
	 * @param userrole
	 * @return
	 */
	public List<Usersti> selectUserByLike(@Param("username2")String username,@Param("realname")String realname,@Param("userrole")String userrole);
	/**
	 * 更改用户角色
	 * @param userid
	 * @return
	 */
	public int updateUserRole(@Param("userid")String userid,@Param("userrole")String userrole);
	/**
	 * 修改密码
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public int updateUserpsw(@Param("userid")String userid);
	/**
	 * 删除用户
	 * @param userid
	 * @return
	 */
	public int deleteUser(@Param("userid")String userid);
	/**
	 * 个人信息维护
	 * @param user
	 * @return
	 */
	public int updateUserinfo(Usersti user);
	/**
	 * 登录验证
	 * @param userid
	 * @param userpsw
	 * @return
	 */
	public Usersti checkedLogin(@Param("username")String username,@Param("userpsw")String userpsw);
}
