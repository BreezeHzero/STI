/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * @author hanyang
 * @version 1.0
 */
public class Record {
	private String recordid;
	private String competitionid;
	private String ranks;
	private String teamid;
	private String teamname;
	
	private String competitionname;
	private String competitiondate;
	private String levels;
	private String competitiontype;
	private String competitiondesc;
	
    private String teamkey;
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
    
    private String number;
	
	/**
	 * 
	 */
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Record(String recordid, String competitionid, String ranks, String teamid, String teamname) {
		super();
		this.recordid = recordid;
		this.competitionid = competitionid;
		this.ranks = ranks;
		this.teamid = teamid;
		this.teamname = teamname;
	}

	/**
	 * @return the recordid
	 */
	public String getRecordid() {
		return recordid;
	}
	/**
	 * @param recordid the recordid to set
	 */
	public void setRecordid(String recordid) {
		this.recordid = recordid;
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
	 * @return the ranks
	 */
	public String getRanks() {
		return ranks;
	}
	/**
	 * @param ranks the ranks to set
	 */
	public void setRanks(String ranks) {
		this.ranks = ranks;
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

	@Override
	public String toString() {
		return "Record [ranks=" + ranks + ", number=" + number + "]";
	}


	
}
