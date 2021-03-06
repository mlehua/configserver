package com.zhanglehua.springboot.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
	
	private Integer id;
	
	private String name;
	
	@JsonIgnore
	private String password;
	
	private int age;
	
//	@JsonFilter("id")
//	@JsonFilter("ID-TITLE")
	private Teacher teacher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
