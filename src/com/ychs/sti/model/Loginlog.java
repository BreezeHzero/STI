/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * @author hanyang
 * @version 1.0
 */
public class Loginlog {
	private String id;
	private String realname;
	private String logintime;
	private String loginip;
	/**
	 * 
	 */
	public Loginlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param realname
	 * @param logintime
	 * @param loginip
	 */
	public Loginlog(String id, String realname, String logintime, String loginip) {
		super();
		this.id = id;
		this.realname = realname;
		this.logintime = logintime;
		this.loginip = loginip;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the logintime
	 */
	public String getLogintime() {
		return logintime;
	}
	/**
	 * @param logintime the logintime to set
	 */
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	/**
	 * @return the loginip
	 */
	public String getLoginip() {
		return loginip;
	}
	/**
	 * @param loginip the loginip to set
	 */
	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}
	
}
