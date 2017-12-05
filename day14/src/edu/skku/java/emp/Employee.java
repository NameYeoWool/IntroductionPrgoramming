package edu.skku.java.emp;

public class Employee {
	
	private int num;
	private String name;
	private int salary;
	
	public Employee() {
		super();
		// 상속받은게 없으면 extends Object 자동으로 한다.
		// 그래서 super 안넣어도 자동으로 넣어진다.
	}

	public Employee(int num, String name, int salary) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary/12;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [num=");
		builder.append(num);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	

}
