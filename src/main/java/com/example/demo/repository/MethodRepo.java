package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.MethodOutput;
@Repository
public class MethodRepo {
	
	public MethodOutput introduction(String methodname)
	{
		MethodOutput op1 =new MethodOutput();
		op1.setOutput("Welcome to Codespaces");
		op1.setStatus(200);
		op1.setMethodName(methodname);
		return op1;
	}

	public MethodOutput getDefault() {
		MethodOutput op1 =new MethodOutput();
		op1.setOutput("Sorry... Not a valid method");
		op1.setStatus(404);
		op1.setMethodName(null);
		return op1;
	}

}
