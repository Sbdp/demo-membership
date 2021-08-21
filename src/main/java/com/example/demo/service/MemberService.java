package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.object.Member;

@Service
public interface MemberService {
	
	public long isAlreadyMember(String memberName, int yearOfPassing);

	public Member getMember(long memberId);
	
	public void addNewMember(Member member);
	
	public List<Member> getAllMembers();

}
