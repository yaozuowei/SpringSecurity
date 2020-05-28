package com.sans.common.entity;

public class Page extends AbstractDomain {
	public static long MAXREC=10;
	public static String DESC=" DESC";
	public static String ASC=" ASC";

	/**
	 * 当前页开始行号
	 */
	private int pageNum = 0;

	/**
	 * 页显示行数
	 */
	private int pageSize = 10;
	
	/**
	 * 排序列数据库字段名
	 */
	private String sortname;
	
	/**
	 * 升序或降序
	 */
	private String sortorder;
	
	/**
	 * 升序或降序
	 */
	private String defaultOrder;
	
	/**
	 * 构造函数
	 * 设置当前页开始行号与页显示行数
	 */
	public Page(){
	}
	
	/**
	 * 构造函数
	 * 设置当前页与页显示行数
	 * @param pageNum
	 * @param pageSize
	 */
	public Page(int pageNum, int pageSize){
		setPageNum(pageNum);
		setPageSize(pageSize);
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	public String getSortorder() {
		return sortorder;
	}

	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}
	
	public String getDefaultOrder() {
		return defaultOrder;
	}

	public void setDefaultOrder(String defaultOrder) {
		this.defaultOrder = defaultOrder;
	}
}
