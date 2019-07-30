package com.lexie.HomeworkSecond;

public class Occupation {
	//成员属性：职务编号，职务名称
	private String JobNo;
	private String JobName;
	
	//带参构造，实现对全部属性的赋值
	public Occupation(String jobNo, String jobName) {
		this.setJobNo(jobNo);
		this.setJobName(jobName);
	}
	
	public String getJobNo() {
		return JobNo;
	}
	public void setJobNo(String JobNo) {
		this.JobNo = JobNo;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String JobName) {
		this.JobName = JobName;
	}
	
	/**
	 * 职务信息介绍方法 
	 * 
	 */	
	public String toString() {
		return JobName;
	}
	
	
	
}
