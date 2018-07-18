package com.phonenumber;

import java.util.ArrayList;

public class IdVO {
	private String userId;
	private ArrayList<MemberVO> memberlist;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<MemberVO> getMemberlist() {
		return memberlist;
	}
	public void setMemberlist(ArrayList<MemberVO> memberlist) {
		this.memberlist = memberlist;
	}
}
