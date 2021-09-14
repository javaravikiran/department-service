package com.example.department.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@GetMapping("/department-service/getDetails")
	public List<String>  getDepartmentDetails(){
		List<String> li_dept=new ArrayList<>();
		li_dept.add("CIVIL");
		li_dept.add("SOFTWARE");
		li_dept.add("MECHANICAL");
		return li_dept;
	}
	
	@RequestMapping("/index")
	public String getSampleOutput() {
		return "Welcome Ravi!!";
	}

}
