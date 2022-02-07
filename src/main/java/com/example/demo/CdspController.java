package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.object.RepoDetails;
import com.example.demo.service.RepoService;

@RestController
public class CdspController {
	
	@Autowired
	RepoService repoService;

	@PostMapping(path = "/callMethod", consumes = "application/json")
	public MethodOutput addMember(@RequestBody RepoDetails repoDt) {
		MethodOutput op = repoService.executeMethod(repoDt.getMethodName());
	    return op;
	}
}
