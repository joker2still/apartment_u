package com.bedroom.dao;

import java.util.List;

import com.bedroom.common.pojo.AffairStayOrLeave;
import org.springframework.stereotype.Repository; // 添加这个导入

/**
 * 辅导员审批dao成接口
 * @author Administrator
 *
 */
@Repository // 添加这个注解
public interface CounselorApprovalDao {
	/**
	 * ===========离校===============
	 */
	/**#审查自己学院学生的离校申请信息*/
	List<AffairStayOrLeave> showALlSelfCollegeStudentApplyLeaveSchoolInfo(String userCollegeName);
	/**#辅导员审批离校申请,操作为同意 */
	void counselorAgreeLeaveSchool(Integer affairId);
	/**#辅导员审批离校申请,操作为拒绝 */
	void counselorRefuseLeaveSchool(Integer affairId);
	/**#展示所有离校审批结果*/
	List<AffairStayOrLeave> showApprovalResultLeaveSchool(String userCollegeName);
	
	
	/**
	 * ============留校==============
	 */
	/**#审查自己学院学生的留校申请信息*/
	List<AffairStayOrLeave> showALlSelfCollegeStudentApplyStaySchoolInfo(String userCollegeName);
	/**#辅导员审批留校申请,操作为同意 */
	void counselorAgreeStaySchool(Integer affairId);
	/**#辅导员审批留校申请,操作为拒绝 */
	void counselorRefuseStaySchool(Integer affairId);
	/**#展示所有留校审批结果*/
	List<AffairStayOrLeave> showApprovalResultStaySchool(String userCollegeName);
	
	
}
