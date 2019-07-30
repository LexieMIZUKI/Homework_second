package com.lexie.HomeworkSecond;

public class Department {
	//��Ա���ԣ����ű�ţ��������ƣ�Ա����Ϣ,Ա������
	private String DepartNo;
	private String DepartName;
	private Employee[] employee;
	private int num;
	
	//���ι��죬ʵ�ֶԲ������Եĸ�ֵ
	public Department(String departNo, String departName) {
		this.setDepartNo(departNo);
		this.setDepartName(departName);
	}
	//���ι��죬ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Department(String departNo, String departName,Employee[] employee) {
		this.setDepartNo(departNo);
		this.setDepartName(departName);
		this.setEmployee(employee);
	}
	
	public String getDepartNo() {
		return DepartNo;
	}
	public void setDepartNo(String departNo) {
		DepartNo = departNo;
	}
	public String getDepartName() {
		return DepartName;
	}
	public void setDepartName(String departName) {
		DepartName = departName;
	}
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * ��ȡԱ����Ϣ�ķ���
	 * 
	 */
	public Employee[] getEmployee() {
		if(this.employee == null)
			this.employee = new Employee[100];
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	public void addEmployee(Employee e) {
		//��Ա�����浽������,��ͳ�Ƹ���
		for(int i = 0;i <this.getEmployee().length;i++) {
			if(employee[i] == null)
				this.employee[i] = e;
			if(e.getD().getDepartNo() == this.getDepartNo()) {
				num++;
				return;
			}
		}
	}
	
	/**
	 * ������Ϣ����  ����
	 * 
	 */
	public String toString() {
		return DepartName;
	}
}
