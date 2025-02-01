package com.oops.concept.encapsulation;

public class EncapsulationProgram {

	private int id;
	private String name;
	private int mobNo;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public EncapsulationProgram(int id, String name, int mobNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Hii, My name is "+name+" and id is "+id+" and my contact number is "+mobNo+". I am from "+address+".");
	}
}
