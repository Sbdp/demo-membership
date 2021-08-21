package com.example.demo.object;

public class Member {

	private long memberId;
	private String name;
	private int yearOfPassing;
	private boolean isLifeMember;
	private String documentProof;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public boolean isLifeMember() {
		return isLifeMember;
	}
	public void setLifeMember(boolean isLifeMember) {
		this.isLifeMember = isLifeMember;
	}
	public String getDocumentProof() {
		return documentProof;
	}
	public void setDocumentProof(String documentProof) {
		this.documentProof = documentProof;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	
}
