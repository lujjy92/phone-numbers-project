package com.phonenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	
	int idNumber;
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<IdVO> idList = new ArrayList<IdVO>();
	IdVO ivo;
	String userId;
	
	public void idRun(){
		while (true) {// ���� ����
			do {
				System.out.println("ȸ������ : 0, ȸ������ : 1, �α��� : 2, ���� : 3.");
				System.out.print("�Է� >>> ");
				idNumber = scanner.nextInt();
			} while ((idNumber < 0) || (idNumber > 3));// number<0 or number>5�϶� �ٽ�
													// �Է¹���
			if (idNumber == 3) {// 5�� �Է½� ���α׷� ����
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			switch (idNumber) {
				case 0: addUserId(); break;
				case 1: removeId(); break;
				case 2: login(); break;
			}
		}
	}
	
	public void addUserId(){
		ivo = new IdVO();
		System.out.print("����� ȸ�� ID:");
		userId = scanner.next();
		ivo.setUserId(userId);
		idList.add(ivo);
		System.out.println("���Կ� �����߽��ϴ�.");
	}
	
	public void login(){
		System.out.print("ID�� �Է����ּ���:");
		userId = scanner.next();
		for(int i=0; i<idList.size(); i++){
			if(idList.get(i).getUserId().equals(userId)) {
				PhoneNumber phoneNumberRun = new PhoneNumber();
				phoneNumberRun.phoneNumberRun();
			}else{
				System.out.println("��ϵ� ID�� �����ϴ�.");
			}
		}
	}
	
	public void removeId(){
		System.out.print("ID�� �Է����ּ���:");
		userId = scanner.next();
		for(int i=0; i<idList.size(); i++){
			if(idList.get(i).getUserId().equals(userId)) {
				idList.remove(i);
				System.out.println("ID�� �����Ǿ����ϴ�.");
			}else{
				System.out.println("��ϵ� ID�� �����ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		Run run = new Run();
		run.idRun();
	}
}
