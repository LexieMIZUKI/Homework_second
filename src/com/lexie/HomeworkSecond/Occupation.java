package com.lexie.HomeworkSecond;

public class Occupation {
	//��Ա���ԣ�ְ���ţ�ְ������
	private String JobNo;
	private String JobName;
	
	//���ι��죬ʵ�ֶ�ȫ�����Եĸ�ֵ
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
	 * ְ����Ϣ���ܷ��� 
	 * 
	 */	
	public String toString() {
		return JobName;
	}
	
	
	
}
