package com.zhanglehua.springboot.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglehua.springboot.beans.Student;
import com.zhanglehua.springboot.beans.Teacher;

@RestController
public class TestControl {

	@RequestMapping("/testjson")
	public Object index() {
		
		Student std = new Student();
		std.setId(1);
		std.setName("张三");
		std.setPassword("a123456");
		std.setAge(16);
		
		Teacher tch = new Teacher();
		tch.setId(10);
		tch.setName("王老师");
		tch.setAge(24);
		
		std.setTeacher(tch);
		
		return std;
	}
}
