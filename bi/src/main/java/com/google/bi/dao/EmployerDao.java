package com.google.bi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.bi.dto.EmployerDto;
import com.google.bi.repository.EmployerRepository;

@Component
public class EmployerDao {
	
	@Autowired
	EmployerRepository er;

	public List<EmployerDto> insertion(List<EmployerDto> dto) {
		
		return er.saveAll(dto);
	}

	public List<EmployerDto> fetching() {
		
		return er.findAll();
	}
	
	

}
