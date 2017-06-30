package com.dywz.common.entity;
/**
 * 
 * @author 我要睡觉了
 * @Title Column.java
 * @Description 二级栏目	
 * @time 2017年5月16日 下午7:34:11
 */
public class Column {
	
	private String id;
	
	private String columnTitle;
	
	private String columnInfo;
	
	private String columnIsDelete;

	public String getColumnIsDelete() {
		return columnIsDelete;
	}

	public void setColumnIsDelete(String columnIsDelete) {
		this.columnIsDelete = columnIsDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColumnTitle() {
		return columnTitle;
	}

	public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}

	public String getColumnInfo() {
		return columnInfo;
	}

	public void setColumnInfo(String columnInfo) {
		this.columnInfo = columnInfo;
	}
	
	
	
	
	
}
