package com.lexie.HomeworkSecond;

public class Employee {
	//成员属性：员工姓名、工号、年龄、性别
	private String Name;
	private String No;
	private int Age;
	private String Gender;
	
	private Department d;
	private Occupation o;
	
	//带参构造，实现对部分属性的赋值
	public Employee(String name, String no, String gender,int age) {
		this.setName(name);
		this.setNo(no);
		this.setGender(gender);
		this.setAge(age);
	}
	//带参构造，实现对全部属性的赋值
	public Employee(String name, String no, String gender,int age, Department d, Occupation o) {
		super();
		Name = name;
		No = no;
		Age = age;
		Gender = gender;
		this.d = d;
		this.o = o;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		this.No = no;
	}
	public int getAge() {
		return Age;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public Occupation getO() {
		return o;
	}
	public void setO(Occupation o) {
		this.o = o;
	}
	
	//限定年龄只能是18--65之间,反之则设置默认为18岁
	public void setAge(int age) {
		if(age<18 || age>65)
			this.Age = 18;
		else
			this.Age = age;
	}
	public String getGender() {
		return Gender;
	}
	
	//限定性别只能是“男”或者“女”,反之则设置默认为"男"
	public void setGender(String gender) {
		if(!gender.equals("男")&&(!gender.equals("女")))
			this.Gender = "男";
		else
			this.Gender = gender;
	}
	
	/**
	 * 员工信息介绍方法
	 * @return 姓名，工号，性别，年龄
	 */
	
	public String emInfo() {
		String emInfo = "姓名："+this.getName()+"\n工号："+this.getNo()+"\n性别："+this.getGender()
		+"\n年龄："+this.getAge()+"\n职务："+this.getD()+this.getO()+"\n===========================";
		return emInfo;
		
	}
	
}
