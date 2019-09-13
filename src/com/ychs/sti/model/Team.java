/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * Team表的JavaBean
 * @author hanyang
 * @version 1.0
 */
public class Team {
	   private String teamkey;
	   private String competitionid; 
	   private String teamid; 
	   private String teamname; 
	   private String studentid; 
	   private String studentname; 
	   private String sex; 
	   private String mobile;
	   private String email; 
	   private String roleflag;
	   private String teachername;
	   private String departmentname;
	   private String majorname;
	   private String grade;
	   private String classname; 
	   private String userrealname; 
	   private String inputtime;
	   
	   private String competitionname;
	   private String competitiondate;
	   private String levels;
	   private String competitiontype;
	   private String competitiondesc;
	   
	   private String number;
	   
	   /**一等奖*/
	   private String U;
	   /**二等奖*/
	   private String V;
	   /**三等奖*/
	   private String W;
	   /**特等奖*/
	   private String X;
	   /**优等奖*/
	   private String Y;
	/**
	 * 
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String teamkey, String competitionid, String teamid, String teamname, String studentid,
			String studentname, String sex, String mobile, String email, String roleflag, String teachername,
			String departmentname, String majorname, String grade, String classname, String userrealname) {
		super();
		this.teamkey = teamkey;
		this.competitionid = competitionid;
		this.teamid = teamid;
		this.teamname = teamname;
		this.studentid = studentid;
		this.studentname = studentname;
		this.sex = sex;
		this.mobile = mobile;
		this.email = email;
		this.roleflag = roleflag;
		this.teachername = teachername;
		this.departmentname = departmentname;
		this.majorname = majorname;
		this.grade = grade;
		this.classname = classname;
		this.userrealname = userrealname;
	}

	public Team(String teamkey, String competitionid, String teamid, String teamname, String studentid,
			String studentname, String sex, String mobile, String email, String roleflag, String teachername,
			String departmentname, String majorname, String grade, String classname, String userrealname,
			String inputtime) {
		super();
		this.teamkey = teamkey;
		this.competitionid = competitionid;
		this.teamid = teamid;
		this.teamname = teamname;
		this.studentid = studentid;
		this.studentname = studentname;
		this.sex = sex;
		this.mobile = mobile;
		this.email = email;
		this.roleflag = roleflag;
		this.teachername = teachername;
		this.departmentname = departmentname;
		this.majorname = majorname;
		this.grade = grade;
		this.classname = classname;
		this.userrealname = userrealname;
		this.inputtime = inputtime;
	}
	/**
	 * @return the teamkey
	 */
	public String getTeamkey() {
		return teamkey;
	}
	/**
	 * @param teamkey the teamkey to set
	 */
	public void setTeamkey(String teamkey) {
		this.teamkey = teamkey;
	}
	/**
	 * @return the competitionid
	 */
	public String getCompetitionid() {
		return competitionid;
	}
	/**
	 * @param competitionid the competitionid to set
	 */
	public void setCompetitionid(String competitionid) {
		this.competitionid = competitionid;
	}
	/**
	 * @return the teamid
	 */
	public String getTeamid() {
		return teamid;
	}
	/**
	 * @param teamid the teamid to set
	 */
	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}
	/**
	 * @return the teamname
	 */
	public String getTeamname() {
		return teamname;
	}
	/**
	 * @param teamname the teamname to set
	 */
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	/**
	 * @return the studentid
	 */
	public String getStudentid() {
		return studentid;
	}
	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	/**
	 * @return the studentname
	 */
	public String getStudentname() {
		return studentname;
	}
	/**
	 * @param studentname the studentname to set
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the roleflag
	 */
	public String getRoleflag() {
		return roleflag;
	}
	/**
	 * @param roleflag the roleflag to set
	 */
	public void setRoleflag(String roleflag) {
		this.roleflag = roleflag;
	}
	/**
	 * @return the teachername
	 */
	public String getTeachername() {
		return teachername;
	}
	/**
	 * @param teachername the teachername to set
	 */
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
	 * @return the userrealname
	 */
	public String getUserrealname() {
		return userrealname;
	}
	/**
	 * @param userrealname the userrealname to set
	 */
	public void setUserrealname(String userrealname) {
		this.userrealname = userrealname;
	}
	/**
	 * @return the inputtime
	 */
	public String getInputtime() {
		return inputtime;
	}
	/**
	 * @param inputtime the inputtime to set
	 */
	public void setInputtime(String inputtime) {
		this.inputtime = inputtime;
	}
	
	/**
	 * @return the competitionname
	 */
	public String getCompetitionname() {
		return competitionname;
	}
	/**
	 * @param competitionname the competitionname to set
	 */
	public void setCompetitionname(String competitionname) {
		this.competitionname = competitionname;
	}
	/**
	 * @return the competitiondate
	 */
	public String getCompetitiondate() {
		return competitiondate;
	}
	/**
	 * @param competitiondate the competitiondate to set
	 */
	public void setCompetitiondate(String competitiondate) {
		this.competitiondate = competitiondate;
	}
	/**
	 * @return the levels
	 */
	public String getLevels() {
		return levels;
	}
	/**
	 * @param levels the levels to set
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}
	/**
	 * @return the competitiontype
	 */
	public String getCompetitiontype() {
		return competitiontype;
	}
	/**
	 * @param competitiontype the competitiontype to set
	 */
	public void setCompetitiontype(String competitiontype) {
		this.competitiontype = competitiontype;
	}
	/**
	 * @return the competitiondesc
	 */
	public String getCompetitiondesc() {
		return competitiondesc;
	}
	/**
	 * @param competitiondesc the competitiondesc to set
	 */
	public void setCompetitiondesc(String competitiondesc) {
		this.competitiondesc = competitiondesc;
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the u
	 */
	public String getU() {
		return U;
	}

	/**
	 * @param u the u to set
	 */
	public void setU(String u) {
		U = u;
	}

	/**
	 * @return the v
	 */
	public String getV() {
		return V;
	}

	/**
	 * @param v the v to set
	 */
	public void setV(String v) {
		V = v;
	}

	/**
	 * @return the w
	 */
	public String getW() {
		return W;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(String w) {
		W = w;
	}

	/**
	 * @return the x
	 */
	public String getX() {
		return X;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(String x) {
		X = x;
	}

	/**
	 * @return the y
	 */
	public String getY() {
		return Y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(String y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "Team [majorname=" + majorname + ", U=" + U + ", V=" + V + ", W=" + W + ", X=" + X + ", Y=" + Y + "]";
	}

}
