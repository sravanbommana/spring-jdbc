package com.spring.jdbc.model;

public class Student {
	private String name;
	private String city;

	public Student() {
	}

	public Student(String name, String city) {
		super();
		this.setName(name);
		this.setCity(city);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
