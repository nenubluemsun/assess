package com.dywz.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.dywz.common.entity.Column;
import com.dywz.common.vo.ColumnVo;
import com.dywz.common.vo.NewsVo;

public class ColumnServiceTest {

	ColumnService columnService = new ColumnService();
	
	@Test
	public void testAddColumn() {
		
		Column column = new Column();
		column.setColumnTitle("测试junit的");
		column.setColumnInfo("测试成功了吗");
		
		columnService.addColumn(column);
		System.out.println("success");
	
	}

	@Test
	public void testDeleteColumn() {
		String id ="646f613f-a4c2-4f4a-beee-8d1ac9e6c6fa";
		String value = "1";
		columnService.deleteColumn(id, value);
	}
	@Ignore
	@Test
	public void testUpdateColumn() {
		Column column = new Column();
		column.setColumnTitle("测试修改junit的标题");
		column.setColumnInfo("修改测试成功了吗");
		String id="88d429d6-5c86-4891-90dd-f62aba4010b6";
		
		columnService.updateColumn(column, id);
	}

	@Test
	public void testSelectColumn() {
		
		List<ColumnVo> list=columnService.selectColumn();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getColumnTitle());
		}
	}

	@Test
	public void testSelectAllColumn() {
		List<ColumnVo> list= columnService.selectAllColumn();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getColumnInfo());
		}
	}

	@Test
	public void testSelectOneColumnVo() {
		String id = "29a741b5-73f6-47ad-ab31-5fb5a0f222b3";
		ColumnVo columnVo=columnService.selectOneColumnVo(id);
		System.out.println(columnVo.getColumnTitle());
	}

	@Test
	public void testSelectNews() {
		String columnId="29a741b5-73f6-47ad-ab31-5fb5a0f222b3";
		columnService.selectNews(columnId);
	
	}


	@Test
	public void testSelectAllNewsWithoutC() {
		List<NewsVo> list=columnService.selectAllNewsWithoutC();	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getUserName());
		}
	}

	

}
