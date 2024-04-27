package com.google.ai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.ai.dto.StudentDto;

public interface StudentRepository extends JpaRepository<StudentDto, Integer>{

	

}
