package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MethodOutput;
import com.example.demo.repository.MethodRepo;

@Service
public class RepoServiceImpl implements RepoService{

	@Autowired
	MethodRepo methodRepo;
	public MethodOutput executeMethod(String methodName)
	{
		if(methodName.toLowerCase().contains("intro"))
		return methodRepo.introduction(methodName);
		
		return methodRepo.getDefault();
	}
}
