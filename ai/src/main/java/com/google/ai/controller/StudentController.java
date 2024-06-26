package com.google.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.ai.dao.StudentDao;
import com.google.ai.dto.ResponseStructure;
import com.google.ai.dto.StudentDto;

//@Controller
@RestController
//@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	
//	@GetMapping("/sample")
//	public String hello()
//	{
//		return "sample";
//	}
	
	@PostMapping("/students")
	public ResponseStructure insert(@RequestBody List<StudentDto> dto)
	{
		return dao.insert(dto);
	}
	
	
	@GetMapping("/students")
	public ResponseStructure fetchById(@RequestBody StudentDto dto)
	{
		int id=dto.getId();
		return dao.fetchById(id);
	}
	
	
	@GetMapping("/student")
	public ResponseStructure fetchAll(@RequestBody List<StudentDto> dto)
	{
		return dao.fetchAll();
	}
	
	// http://localhost:8081/students/deletebyid/3     // http://localhost:8081/students/deletebyid?id=1
	@DeleteMapping("/studentsid/{id}")                 // @DeleteMapping("/deletebyid")
	public ResponseEntity<String> deleteById(@PathVariable int id)       // public void deleteById(@RequestParam int id) 
	{
		return dao.deleteById(id);
		
		
	}
	
	@DeleteMapping("/students")
	public ResponseEntity<ResponseStructure<List<StudentDto>>> deleteAll()
	{
	 return dao.deleteAll();
	}
	
	@PutMapping("/nouns")
	public void update(@RequestParam int id, String name)
	{
	  dao.update();
	}
	
	

}
