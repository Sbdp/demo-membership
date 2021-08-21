package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.object.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository memberRepo;
	
	@Override
	public long isAlreadyMember(String memberName, int yearOfPassing) {
		Member member = new Member();
		member.setName(memberName);
		member.setYearOfPassing(yearOfPassing);
		return memberRepo.isMember(member);
	}
	@Override
	public Member getMember(long memberId)
	{
		return memberRepo.getMember(memberId);
	}
	@Override
	public void addNewMember(Member member) {
		memberRepo.addMember(member);
		
	}
	@Override
	public List<Member> getAllMembers() {
		return memberRepo.getAllMembers();
		
	}

	
}
