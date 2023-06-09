package com.bedroom.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository; // 添加这个导入

@Repository // 添加这个注解
public interface BedroomDao {

	Integer getBedroomId(@Param("buildingCodeTarget")String buildingCodeTarget, @Param("unitTarget")String unitTarget,@Param("bedroomCodeTarget") String bedroomCodeTarget);
	
	/**
	 * 根据用户stuAccount获取寝室信息
	 * @param stuAccount 学生账号
	 * @return 寝室信息（栋-单元-号）
	 */
	Map<String, String> getCurBedroom(String stuAccount);
	
	/**
	 * 根据公寓楼栋号获取楼栋号下面的单元列表
	 * @param buildingCode 公寓楼栋号 如“东四”
	 * @return 单元列表
	 */
	String getUnitList(String buildingCode);
	
	/**
	 * 根据公寓号和单元获取下面的寝室号列表
	 * @param buildingCode  公寓号
	 * @param unit 单元
	 * @return 寝室号列表
	 */
	List<String> getBedroomCodeList(@Param("buildingCode")String buildingCode, @Param("unit")String unit);
	
	/**
	 * 获取所有的楼栋代码
	 * @return 楼栋代码列表
	 */
	List<String> getBuildingCodeList();
	
	/**
	 * 通过寝室号查询它的全名
	 * @return 全名的一个列表
	 */
	List<Map<String,Object>> getBedroomName();
}
