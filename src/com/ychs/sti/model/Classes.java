/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * classes表映射
 * @author hanyang
 * @version 1.0 2019-8-14
 */
public class Classes {
	private int classid;
	private int majorid; 
	private String classname;
	private String grade;
	private String majorname;
	/**
	 * 
	 */
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String majorname,String classname, String grade) {
		super();
		this.majorname = majorname;
		this.classname = classname;
		this.grade = grade;
	}

	public Classes(int classid, int majorid, String classname, String grade) {
		super();
		this.classid = classid;
		this.majorid = majorid;
		this.classname = classname;
		this.grade = grade;
	}
	/**
	 * @return the classid
	 */
	public int getClassid() {
		return classid;
	}
	/**
	 * @param classid the classid to set
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}
	/**
	 * @return the majorid
	 */
	public int getMajorid() {
		return majorid;
	}
	/**
	 * @param majorid the majorid to set
	 */
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}
	/**
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
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

	@Override
	public String toString() {
		return "Classes [classid=" + classid + ", majorid=" + majorid + ", classname=" + classname + ", grade=" + grade
				+ ", majorname=" + majorname + "]";
	}

	

	
}
