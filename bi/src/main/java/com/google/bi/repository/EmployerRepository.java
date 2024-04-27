package com.google.bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.bi.dto.EmployerDto;

public interface EmployerRepository extends JpaRepository<EmployerDto, Integer>{

}
