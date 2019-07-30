package com.lexie.HomeworkSecond;

public class Employee {
	//��Ա���ԣ�Ա�����������š����䡢�Ա�
	private String Name;
	private String No;
	private int Age;
	private String Gender;
	
	private Department d;
	private Occupation o;
	
	//���ι��죬ʵ�ֶԲ������Եĸ�ֵ
	public Employee(String name, String no, String gender,int age) {
		this.setName(name);
		this.setNo(no);
		this.setGender(gender);
		this.setAge(age);
	}
	//���ι��죬ʵ�ֶ�ȫ�����Եĸ�ֵ
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
	
	//�޶�����ֻ����18--65֮��,��֮������Ĭ��Ϊ18��
	public void setAge(int age) {
		if(age<18 || age>65)
			this.Age = 18;
		else
			this.Age = age;
	}
	public String getGender() {
		return Gender;
	}
	
	//�޶��Ա�ֻ���ǡ��С����ߡ�Ů��,��֮������Ĭ��Ϊ"��"
	public void setGender(String gender) {
		if(!gender.equals("��")&&(!gender.equals("Ů")))
			this.Gender = "��";
		else
			this.Gender = gender;
	}
	
	/**
	 * Ա����Ϣ���ܷ���
	 * @return ���������ţ��Ա�����
	 */
	
	public String emInfo() {
		String emInfo = "������"+this.getName()+"\n���ţ�"+this.getNo()+"\n�Ա�"+this.getGender()
		+"\n���䣺"+this.getAge()+"\nְ��"+this.getD()+this.getO()+"\n===========================";
		return emInfo;
		
	}
	
}
