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
		while (true) {// 무한 루프
			do {
				System.out.println("회원가입 : 0, 회원삭제 : 1, 로그인 : 2, 종료 : 3.");
				System.out.print("입력 >>> ");
				idNumber = scanner.nextInt();
			} while ((idNumber < 0) || (idNumber > 3));// number<0 or number>5일때 다시
													// 입력받음
			if (idNumber == 3) {// 5번 입력시 프로그램 종료
				System.out.println("프로그램이 종료됩니다.");
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
		System.out.print("등록할 회원 ID:");
		userId = scanner.next();
		ivo.setUserId(userId);
		idList.add(ivo);
		System.out.println("가입에 성공했습니다.");
	}
	
	public void login(){
		System.out.print("ID를 입력해주세요:");
		userId = scanner.next();
		for(int i=0; i<idList.size(); i++){
			if(idList.get(i).getUserId().equals(userId)) {
				PhoneNumber phoneNumberRun = new PhoneNumber();
				phoneNumberRun.phoneNumberRun();
			}else{
				System.out.println("등록된 ID가 없습니다.");
			}
		}
	}
	
	public void removeId(){
		System.out.print("ID를 입력해주세요:");
		userId = scanner.next();
		for(int i=0; i<idList.size(); i++){
			if(idList.get(i).getUserId().equals(userId)) {
				idList.remove(i);
				System.out.println("ID가 삭제되었습니다.");
			}else{
				System.out.println("등록된 ID가 없습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		Run run = new Run();
		run.idRun();
	}
}
