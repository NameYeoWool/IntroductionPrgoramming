package kr.jaen.cms;

import java.io.Serializable;

public class Customer implements Serializable{
	private int num;
	private String name;
	private String address;
	public Customer() {
		super();
	}
	public Customer(int num, String name, String address) {
		setNum(num);
		setName(name);
		setAddress(address);
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		builder.append("   ");
		builder.append(name);
		builder.append("   ");
		builder.append(address);
		return builder.toString();
	}	
}
