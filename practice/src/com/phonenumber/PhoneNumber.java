package com.phonenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumber {
	
	int number;
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
	MemberVO mvo;
	String name;
	String address;
	String phone;
	
	public void phoneNumberRun(){
		while (true) {// 무한 루프
			do {
				System.out.println("삽입 : 0, 삭제 : 1, 찾기: 2, 전체보기: 3, 수정 : 4, 종료 : 5.");
				System.out.print("입력 >>> ");
				number = scanner.nextInt();
			} while ((number < 0) || (number > 5));// number<0 or number>5일때 다시
													// 입력받음
			if (number == 5) {// 5번 입력시 프로그램 종료
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			switch (number) {
				case 0: addMember(); break;
				case 1: removeMember(); break;
				case 2: searchMember(); break;
				case 3: listMember(); break;
				case 4: updateMember(); break;
			}
		}
	}
	
	void addMember(){
		mvo = new MemberVO();
		System.out.print("등록할 회원 이름:");
		name = scanner.next();
		mvo.setName(name);
		System.out.print("등록할 회원 주소:");
		address = scanner.next();
		mvo.setAddress(address);
		System.out.print("등록할 회원 전화번호:");
		phone = scanner.next();
		mvo.setPhone(phone);
		memberList.add(mvo);
		System.out.println(mvo.getName()+ " 생성하였습니다.");	
		
	}
	void removeMember(){
		System.out.print("삭제할 회원 이름:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				memberList.remove(i);
				System.out.println(mvo.getName() +" 삭제하였습니다.");
			}else{
				System.out.println("삭제할 회원이 없습니다.");
			}
		}
		
	}
	
	void updateMember(){
		System.out.print("수정할 회원 이름:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				System.out.print("수정할 주소 : ");
				address = scanner.next();
				memberList.get(i).setAddress(address);
				System.out.print("수정할 번호 : ");
				phone = scanner.next();
				memberList.get(i).setPhone(phone);
				System.out.println("수정하였습니다.");
			}else{
				System.out.println("수정할 회원이 없습니다.");
			}
		}
	}
	
	void searchMember(){
		System.out.print("검색할 회원 이름:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				System.out.println("=================회원정보 =================");
				System.out.println("회원 번호 : " + i + "번");
				System.out.println("회원 이름 : " + memberList.get(i).getName());
				System.out.println("회원 주소 : " + memberList.get(i).getAddress());
				System.out.println("회원 번호 : " + memberList.get(i).getPhone());
				System.out.println("========================================");
			}else{
				System.out.println("찾는 회원이 없습니다.");
			}
		}
	}
	void listMember(){
		System.out.println("=================전체 목록 =================");
		for(int i=0; i<memberList.size(); i++){
			System.out.println("회원 이름 : " + memberList.get(i).getName());
			System.out.println("회원 주소 : " + memberList.get(i).getAddress());
			System.out.println("회원 번호 : " + memberList.get(i).getPhone());
			System.out.println("========================================");
		}
	}
}
