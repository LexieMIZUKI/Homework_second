package com.lexie.HomeworkSecond;

public class Department {
	//成员属性：部门编号，部门名称，员工信息,员工个数
	private String DepartNo;
	private String DepartName;
	private Employee[] employee;
	private int num;
	
	//带参构造，实现对部分属性的赋值
	public Department(String departNo, String departName) {
		this.setDepartNo(departNo);
		this.setDepartName(departName);
	}
	//带参构造，实现对全部属性的赋值
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
	 * 获取员工信息的方法
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
		//将员工保存到数组中,并统计个数
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
	 * 部门信息方法  两个
	 * 
	 */
	public String toString() {
		return DepartName;
	}
}
