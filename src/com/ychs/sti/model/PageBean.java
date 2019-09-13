/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.model;

import java.util.List;

/**
 * 存放分页数据
 * @author hanyang
 * @version 1.0
 */
public class PageBean<T> {
	private int totalCount;//总记录数
	private int totalPage;//总页码
	private List<T> list;//每页的数据
	private int currentPage;//当前页码
	private int rows;//每页显示的行数
	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/**
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "PageBean [totalCount=" + totalCount + ", totalPage=" + totalPage + ", list=" + list + ", currentPage="
				+ currentPage + ", rows=" + rows + "]";
	}
	
}
