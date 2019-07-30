package com.lexie.HomeworkSecond;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试员工信息Employee
		Occupation o1 = new Occupation("001","经理");
		Occupation o2 = new Occupation("002","助理");
		Occupation o3 = new Occupation("003","职员");
		
		Department d1 = new Department("01","人事部");
		Department d2 = new Department("02","市场部");
		
		Employee e1 = new Employee("张铭","S001","男",29,d1,o1);
		Employee e2 = new Employee("李艾爱","S002","女",21,d1,o2);
		Employee e3 = new Employee("孙超","S004","男",29,d1,o3);
		Employee e4 = new Employee("张美美","S005","女",26,d2,o3);
		Employee e5 = new Employee("蓝迪","S006","男",37,d2,o2);
		Employee e6 = new Employee("米莉","S007","女",24,d2,o3);
		
		System.out.println(e1.emInfo());
		System.out.println(e2.emInfo());
		System.out.println(e3.emInfo());
		System.out.println(e4.emInfo());
		System.out.println(e5.emInfo());
		System.out.println(e6.emInfo());
		
		//测试部门中员工信息Department
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d1.addEmployee(e3);
		d2.addEmployee(e4);
		d2.addEmployee(e5);
		d2.addEmployee(e6);
		System.out.println(d1.getDepartName()+"总共有"+d1.getNum()+"名员工");
		System.out.println(d2.getDepartName()+"总共有"+d2.getNum()+"名员工");
	}

}
