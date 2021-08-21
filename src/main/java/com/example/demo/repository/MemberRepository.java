package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.object.Member;

@Repository
public class MemberRepository {
	
	List<Member> members = new ArrayList<>(); 
    public void addMember(Member member)
    {
        members.add(member);	
    }
    public long isMember(Member member)
    {
    	for(Member mem: members)
    	{
    		if(member.getName().equals(mem.getName())
    				&& member.getYearOfPassing() == mem.getYearOfPassing())
    		{
    			return mem.getMemberId();
    		}
    		System.out.println(member.getName()+" --" +mem.getName());
    	}
    	return -1;
    }
    public Member getMember(long memberId)
    {
    	for(Member mem: members)
    	{
    		if(mem.getMemberId() == memberId)
    		{
    			return mem;
    		}
    	}
    	return null;
    }
    public List<Member> getAllMembers()
    {
    	return members;
    }

}
