package com.dywz.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dywz.common.core.AbstractDao;
import com.dywz.common.core.ExpandBeanHandler;
import com.dywz.common.core.ExpandBeanListHandler;
import com.dywz.common.entity.Column;
import com.dywz.common.vo.ColumnVo;

/**
 * 
 * @author 我要睡觉了
 * @Title ColumnDao.java
 * @Description 栏目Dao
 * @time 2017年5月23日 下午6:45:41
 */
public class ColumnDao extends AbstractDao {

	
	/**
	 * 
	 * @Title: addColumn
	 * @Description: 添加二级栏目
	 * @return: void
	 */
	public void addColumn(Column column) {
		String columnTitle = column.getColumnTitle();
		String columnInfo = column.getColumnInfo();
		String sql = "INSERT INTO `column` (column_title, column_info) VALUES (?, ?)";
		Object[] params = {columnTitle, columnInfo};
		try {
			insert(sql, params);
		} catch (SQLException e) {
			System.out.println("插入二级栏目失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: deleteColumn
	 * @Description: 更改二级栏目显示状态
	 * @return: void
	 */
	public void deleteColumn(String id, String value) {
		String sql = "UPDATE `column` SET column_is_delete = ? WHERE id = ?";
		Object[] params = {value, id};
		try {
			update(sql, params);
		} catch (SQLException e) {
			System.out.println("更改二级栏目显示状态失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: updateColumn
	 * @Description: 更改二级栏目
	 * @return: void
	 */
	public void updateColumn(Column column, String id) {
		String columnTitle = column.getColumnTitle();
		String columnInfo = column.getColumnInfo();
		String sql = "UPDATE `column` SET column_title = ? column_info = ? WHERE id = ?";
		Object[] params = {columnTitle, columnInfo, id};
		try {
			update(sql, params);
		} catch (SQLException e) {
			System.out.println("更改二级栏目失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: selectColumn
	 * @Description: 查询一条二级栏目
	 * @return: ColumnVo
	 */
	public ColumnVo selectOneColumn(String id) {
		ColumnVo columnVo = new ColumnVo();
		String sql = "SELECT column.id, column.column_title, column.column_info, column.column_is_delete FROM `column` WHERE column.id = ?";
		try {
			columnVo = query(sql, new ExpandBeanHandler<ColumnVo>(ColumnVo.class), id);
		} catch (SQLException e) {
			System.out.println("查询一条二级栏目失败");
			e.printStackTrace();
		}
		return columnVo;
	}
	
	
	/**
	 * 
	 * @Title: selectAllColumn
	 * @Description: 查询所有的二级栏目
	 * @return: List<ColumnVo>
	 */
	public List<ColumnVo> selectAllColumn() {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		String sql = "SELECT column.id, column.column_title, column.column_info, column.column_is_delete FROM `column` ORDER BY column.id";
		try {
			list = query(sql, new ExpandBeanListHandler<ColumnVo>(ColumnVo.class));
		} catch (SQLException e) {
			System.out.println("查询所有的二级栏目失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * 
	 * @Title: selectAllColumn
	 * @Description: 查询所有可见的二级栏目
	 * @return: List<ColumnVo>
	 */
	public List<ColumnVo> selectColumn() {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		String sql = "SELECT column.id, column.column_title, column.column_info, column.column_is_delete FROM `column` WHERE column.column_is_delete = '0' ORDER BY column.id";
		try {
			list = query(sql, new ExpandBeanListHandler<ColumnVo>(ColumnVo.class));
		} catch (SQLException e) {
			System.out.println("查询所有的二级栏目失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
}
