package com.google.ai.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.google.ai.dto.ResponseStructure;
import com.google.ai.dto.StudentDto;
import com.google.ai.repository.StudentRepository;

@Component
public class StudentDao {

	@Autowired
	StudentRepository repository;

	public ResponseStructure insert(List<StudentDto> dto) {
		ResponseStructure structure = new ResponseStructure();

		structure.setMessage("data inserted");
		structure.setStatus(HttpStatus.ACCEPTED.value());
		structure.setData(repository.saveAll(dto));
		return structure;
	}

	public ResponseStructure fetchById(int id) {
		Optional<StudentDto> od = repository.findById(id);

		if (od.isEmpty()) {
			ResponseStructure structure = new ResponseStructure();

			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(null);
			return structure;
		} else {
			ResponseStructure structure = new ResponseStructure();

			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(od.get());
			return structure;

		}

	}

	public ResponseStructure fetchAll() {
		
		ResponseStructure structure = new ResponseStructure();

		structure.setMessage("data found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(repository.findAll());
		return structure;
		
	}

	public ResponseEntity<String> deleteById(int id) {
		Optional<StudentDto> od = repository.findById(id);

		

		if (od.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		} else {

			repository.deleteById(id);

			return new ResponseEntity<String>("Data Deleted Success",HttpStatus.OK);

		}
	}

	public ResponseEntity<ResponseStructure<List<StudentDto>>> deleteAll() {
		
		List<StudentDto> list=repository.findAll();
		
		if(list.isEmpty()) {
			ResponseStructure<List<StudentDto>> structure=new ResponseStructure<List<StudentDto>>();
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(null);
			return new ResponseEntity<ResponseStructure<List<StudentDto>>>(structure,HttpStatus.NOT_FOUND);
			
		}
		else {
			repository.deleteAll();
			ResponseStructure<List<StudentDto>> structure=new ResponseStructure<List<StudentDto>>();
			structure.setMessage("All Data Deleted");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<StudentDto>>>(structure,HttpStatus.OK);
		}

	}

	public void update() {

	}

}
