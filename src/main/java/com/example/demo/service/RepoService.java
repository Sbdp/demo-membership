package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.MethodOutput;

@Service
public interface RepoService {

	public MethodOutput executeMethod(String method);
}
