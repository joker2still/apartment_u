package com.bedroom.dao;

import com.bedroom.common.pojo.ReportRepair;
import org.springframework.stereotype.Repository; // 添加这个导入

@Repository // 添加这个注解
public interface ReportRepairDao {
	/**
	 * 增加报修申请
	 */
	public void addReportRepair(ReportRepair reportRepair);
}
