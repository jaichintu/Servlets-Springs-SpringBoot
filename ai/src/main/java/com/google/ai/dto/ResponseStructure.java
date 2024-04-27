package com.google.ai.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	String message;
	int status;
	T data;
}
