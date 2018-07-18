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
		while (true) {// ���� ����
			do {
				System.out.println("���� : 0, ���� : 1, ã��: 2, ��ü����: 3, ���� : 4, ���� : 5.");
				System.out.print("�Է� >>> ");
				number = scanner.nextInt();
			} while ((number < 0) || (number > 5));// number<0 or number>5�϶� �ٽ�
													// �Է¹���
			if (number == 5) {// 5�� �Է½� ���α׷� ����
				System.out.println("���α׷��� ����˴ϴ�.");
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
		System.out.print("����� ȸ�� �̸�:");
		name = scanner.next();
		mvo.setName(name);
		System.out.print("����� ȸ�� �ּ�:");
		address = scanner.next();
		mvo.setAddress(address);
		System.out.print("����� ȸ�� ��ȭ��ȣ:");
		phone = scanner.next();
		mvo.setPhone(phone);
		memberList.add(mvo);
		System.out.println(mvo.getName()+ " �����Ͽ����ϴ�.");	
		
	}
	void removeMember(){
		System.out.print("������ ȸ�� �̸�:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				memberList.remove(i);
				System.out.println(mvo.getName() +" �����Ͽ����ϴ�.");
			}else{
				System.out.println("������ ȸ���� �����ϴ�.");
			}
		}
		
	}
	
	void updateMember(){
		System.out.print("������ ȸ�� �̸�:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				System.out.print("������ �ּ� : ");
				address = scanner.next();
				memberList.get(i).setAddress(address);
				System.out.print("������ ��ȣ : ");
				phone = scanner.next();
				memberList.get(i).setPhone(phone);
				System.out.println("�����Ͽ����ϴ�.");
			}else{
				System.out.println("������ ȸ���� �����ϴ�.");
			}
		}
	}
	
	void searchMember(){
		System.out.print("�˻��� ȸ�� �̸�:");
		name = scanner.next();
		for(int i=0; i<memberList.size(); i++){
			if(memberList.get(i).getName().equals(name)) {
				System.out.println("=================ȸ������ =================");
				System.out.println("ȸ�� ��ȣ : " + i + "��");
				System.out.println("ȸ�� �̸� : " + memberList.get(i).getName());
				System.out.println("ȸ�� �ּ� : " + memberList.get(i).getAddress());
				System.out.println("ȸ�� ��ȣ : " + memberList.get(i).getPhone());
				System.out.println("========================================");
			}else{
				System.out.println("ã�� ȸ���� �����ϴ�.");
			}
		}
	}
	void listMember(){
		System.out.println("=================��ü ��� =================");
		for(int i=0; i<memberList.size(); i++){
			System.out.println("ȸ�� �̸� : " + memberList.get(i).getName());
			System.out.println("ȸ�� �ּ� : " + memberList.get(i).getAddress());
			System.out.println("ȸ�� ��ȣ : " + memberList.get(i).getPhone());
			System.out.println("========================================");
		}
	}
}
