package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.object.Member;
import com.example.demo.service.MemberService;

@RestController
public class WelcomeController {

	@Autowired
	MemberService memberService;
	
	@GetMapping(value="/welcome")
	public String getWelcome()
	{
		return "Welcome!!";
	}
	@PostMapping(path = "/members", consumes = "application/json")
	public Member addMember(@RequestBody Member member) {
	    memberService.addNewMember(member);
	    return member;
	}
	@GetMapping("/allMembers")
	@ResponseBody
	public List<Member> getAllMembers()
	{
		return memberService.getAllMembers();	
	}
	@GetMapping("/checkMembership")
	@ResponseBody
	public Member isAlreadyMember(@RequestParam String memberName,
			@RequestParam int yearOfPassing)
	{
		long memberId = memberService.isAlreadyMember(memberName, yearOfPassing);
		System.out.print(memberId);
		if(memberId != -1)
			return memberService.getMember(memberId); 
		return null;
		
	}
}
