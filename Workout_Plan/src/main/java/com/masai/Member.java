package com.masai;

public class Member {

	private int memberId;
	private String memberName;
	private int age;
	private String membershipType;
	
	public Member(int memberId, String memberName, int age, String membershipType) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.age = age;
		this.membershipType = membershipType;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", age=" + age + ", membershipType="
				+ membershipType + "]";
	}
	
	
}
