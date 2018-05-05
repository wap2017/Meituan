package com.meituan.pojo;

import java.util.List;

public class EUDataGridResult {
	// 当前页
	private long curPage;
	// 页大小
	private long pageSize;
	// 结果
	private List<?> rows;

	public long getCurPage() {
		return curPage;
	}

	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}