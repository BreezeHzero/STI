/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * 专业表
 * @author hanyang
 * @version 1.0 2019-8-11
 */
public class Major {
	private String majorid;
	private String departmentid;
	private String majorname;
	private String departmentname;
	/**
	 * 
	 */
	public Major() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param majorid
	 * @param majorname
	 * @param departmentname
	 */
	public Major(String majorid, String departmentname, String majorname) {
		super();
		this.majorid = majorid;
		this.departmentname = departmentname;
		this.majorname = majorname;
	}

	/**
	 * @return the majorid
	 */
	public String getMajorid() {
		return majorid;
	}

	/**
	 * @param majorid the majorid to set
	 */
	public void setMajorid(String majorid) {
		this.majorid = majorid;
	}

	/**
	 * @return the departmentid
	 */
	public String getDepartmentid() {
		return departmentid;
	}

	/**
	 * @param departmentid the departmentid to set
	 */
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}

	/**
	 * @return the majorname
	 */
	public String getMajorname() {
		return majorname;
	}

	/**
	 * @param majorname the majorname to set
	 */
	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	
	
	/**
	 * @return the departmentname
	 */
	public String getDepartmentname() {
		return departmentname;
	}

	/**
	 * @param departmentname the departmentname to set
	 */
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Major [majorid=" + majorid + ", majorname=" + majorname + ", departmentname=" + departmentname + "]";
	}

}
