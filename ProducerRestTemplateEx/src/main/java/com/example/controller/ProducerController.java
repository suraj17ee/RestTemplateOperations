package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	
	@GetMapping("/getMessage")
	public ResponseEntity<String> sendMessage(){
		return new ResponseEntity<String>("Hello!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> sendEmployee(){
		Employee e1=new Employee();
		e1.setEid(10);
		e1.setEname("raju");
		return new ResponseEntity<Employee>(e1,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> sendAllEmployees(){
		Employee e1=new Employee();
		e1.setEid(10);
		e1.setEname("raju");
		
		Employee e2=new Employee();
		e2.setEid(20);
		e2.setEname("shyam");
		
		List<Employee> el = new ArrayList();
		el.add(e1);
		el.add(e2);
		return new ResponseEntity<List<Employee>>(el,HttpStatus.CREATED);
	}

}
