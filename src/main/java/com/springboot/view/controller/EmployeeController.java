package com.springboot.view.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.view.model.Employee;

@Controller
public class EmployeeController {

	
	@RequestMapping("/")
	public String index(Model model) {
		String msg = "Welcome to Spring Boot Application!";
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@RequestMapping(value = "/emp-list")
	public String getEmployeeList(Model model) {
		List<Employee> emplist =getEmployeeList();
		model.addAttribute("emplist", emplist);

		return "emplist";
	}

	private List<Employee> getEmployeeList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Sai", "Srihari", "blore", 10000));
		list.add(new Employee(2, "suresh", "Srihari", "blore", 20000));
		list.add(new Employee(3, "sravan", "Srihari", "blore", 30000));
		list.add(new Employee(4, "reddappa", "Srihari", "blore", 40000));
		list.add(new Employee(5, "venkat", "Srihari", "blore", 50000));
		list.add(new Employee(6, "vaneen", "Srihari", "blore", 60000));
		
		return list;
	}
}
