/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * 用户表
 * @author hanyang
 * @version 1.0
 */
public class Usersti {
	private String userid;
	private String username;
	private String realname;
	private String userpsw;
	private String userrole;
	/**
	 * 
	 */
	public Usersti() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param userid
	 * @param username
	 * @param realname
	 * @param userpsw
	 */
	public Usersti(String userid, String username, String realname, String userpsw) {
		super();
		this.userid = userid;
		this.username = username;
		this.realname = realname;
		this.userpsw = userpsw;
	}

	public Usersti(String userid, String username, String realname, String userpsw, String userrole) {
		super();
		this.userid = userid;
		this.username = username;
		this.realname = realname;
		this.userpsw = userpsw;
		this.userrole = userrole;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}
	/**
	 * @param realname the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * @return the userpsw
	 */
	public String getUserpsw() {
		return userpsw;
	}
	/**
	 * @param userpsw the userpsw to set
	 */
	public void setUserpsw(String userpsw) {
		this.userpsw = userpsw;
	}
	/**
	 * @return the userrole
	 */
	public String getUserrole() {
		return userrole;
	}
	/**
	 * @param userrole the userrole to set
	 */
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "Usersti [userid=" + userid + ", username=" + username + ", realname=" + realname + ", userpsw="
				+ userpsw + ", userrole=" + userrole + "]";
	}
	
}
