package com.lexie.HomeworkSecond;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ա����ϢEmployee
		Occupation o1 = new Occupation("001","����");
		Occupation o2 = new Occupation("002","����");
		Occupation o3 = new Occupation("003","ְԱ");
		
		Department d1 = new Department("01","���²�");
		Department d2 = new Department("02","�г���");
		
		Employee e1 = new Employee("����","S001","��",29,d1,o1);
		Employee e2 = new Employee("���","S002","Ů",21,d1,o2);
		Employee e3 = new Employee("�ﳬ","S004","��",29,d1,o3);
		Employee e4 = new Employee("������","S005","Ů",26,d2,o3);
		Employee e5 = new Employee("����","S006","��",37,d2,o2);
		Employee e6 = new Employee("����","S007","Ů",24,d2,o3);
		
		System.out.println(e1.emInfo());
		System.out.println(e2.emInfo());
		System.out.println(e3.emInfo());
		System.out.println(e4.emInfo());
		System.out.println(e5.emInfo());
		System.out.println(e6.emInfo());
		
		//���Բ�����Ա����ϢDepartment
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d1.addEmployee(e3);
		d2.addEmployee(e4);
		d2.addEmployee(e5);
		d2.addEmployee(e6);
		System.out.println(d1.getDepartName()+"�ܹ���"+d1.getNum()+"��Ա��");
		System.out.println(d2.getDepartName()+"�ܹ���"+d2.getNum()+"��Ա��");
	}

}
