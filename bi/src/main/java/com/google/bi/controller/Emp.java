package com.google.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.bi.dao.EmployerDao;
import com.google.bi.dto.EmployerDto;

@RestController
@RequestMapping("/jspiders")
public class Emp {
	
	@Autowired
	EmployerDao dao;
	
	
	@PostMapping("/insert")
	public List<EmployerDto> insert(@RequestBody List<EmployerDto> dto)
	{
		return dao.insertion(dto);
	}
	
	
	@GetMapping("/view")
	public List<EmployerDto> fetchall(@RequestBody List<EmployerDto> dto)
	{
		return dao.fetching();
	}
	
	

}
