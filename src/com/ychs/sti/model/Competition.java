/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

/**
 * 赛事表表名
 * @author hanyang
 * @version 1.0
 */
public class Competition {
   	 private String competitionid;
	 private String competitionname;
	 private String competitiondate;
	 private String levels;
	 private String competitiontype;
	 private String competitiondesc;
	 
	 private String number;
	 private String majorname;
	 
	 private int nguo;
	 private int sheng;
	 private int shi;
	 private int xiao;
	 private int yuan;
	 
	/**
	 * 
	 */
	public Competition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competition(String competitionid, String competitionname, String competitiondate, String levels,
			String competitiontype, String competitiondesc) {
		super();
		this.competitionid = competitionid;
		this.competitionname = competitionname;
		this.competitiondate = competitiondate;
		this.levels = levels;
		this.competitiontype = competitiontype;
		this.competitiondesc = competitiondesc;
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
	 * @return the nguo
	 */
	public int getNguo() {
		return nguo;
	}
	/**
	 * @param nguo the nguo to set
	 */
	public void setNguo(int nguo) {
		this.nguo = nguo;
	}
	/**
	 * @return the sheng
	 */
	public int getSheng() {
		return sheng;
	}
	/**
	 * @param sheng the sheng to set
	 */
	public void setSheng(int sheng) {
		this.sheng = sheng;
	}
	/**
	 * @return the shi
	 */
	public int getShi() {
		return shi;
	}
	/**
	 * @param shi the shi to set
	 */
	public void setShi(int shi) {
		this.shi = shi;
	}
	/**
	 * @return the xiao
	 */
	public int getXiao() {
		return xiao;
	}
	/**
	 * @param xiao the xiao to set
	 */
	public void setXiao(int xiao) {
		this.xiao = xiao;
	}
	/**
	 * @return the yuan
	 */
	public int getYuan() {
		return yuan;
	}
	/**
	 * @param yuan the yuan to set
	 */
	public void setYuan(int yuan) {
		this.yuan = yuan;
	}
	@Override
	public String toString() {
		return "Competition [majorname=" + majorname + ", nguo=" + nguo + ", sheng=" + sheng + ", shi=" + shi + ", xiao="
				+ xiao + ", yuan=" + yuan + "]";
	}
	
	 
}
