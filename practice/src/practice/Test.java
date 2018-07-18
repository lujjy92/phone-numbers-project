package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	
	
	int number;  // 실행할 번호를 입력받음

	String name;
	String address;
	String phonenumber;
	String temp;

	Scanner input = new Scanner(System.in); // 입력 값

	ArrayList<HashMap<String, String>> addArraylist = new ArrayList<HashMap<String, String>>(); 
	HashMap<String, String> map;
	
	public void test () {
		while (true) {// 무한 루프

			do {

				System.out.println("삽입 : 0, 삭제 : 1, 찾기: 2, 전체보기: 3, 수정 : 4, 종료 : 5.");
				System.out.print("입력 >>> ");
				number = input.nextInt();
			} while ((number < 0) || (number > 5));// number<0 or number>5일때 다시
													// 입력받음
			if (number == 5) {// 5번 입력시 프로그램 종료
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			// 스위치 문 시작
			switch (number) {
			case 0: 
				map = new HashMap<String, String>();
				System.out.print("이름 입력 >>> ");
				name = input.next();
				
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).containsKey(name)){
						System.out.print("주소 입력 >>> ");
						address = input.next();
						System.out.print("전화 입력 >>> ");
						phonenumber = input.next();
						// 주소와 핸드폰 번호를 합쳐서 저장함
						temp = address + " " + phonenumber;
						map.put(name, temp);
						addArraylist.add(map);
					}else{
						System.out.println("존재하는 이름입니다.");
					}
				}
				
//				// 삽입
//				System.out.print("이름 입력 >>> ");
//				name = input.next();
//				System.out.print("주소 입력 >>> ");
//				address = input.next();
//				System.out.print("전화 입력 >>> ");
//				phonenumber = input.next();
//				// 주소와 핸드폰 번호를 합쳐서 저장함
//				temp = address + " " + phonenumber;
//				map.put(name, temp);
//				addArraylist.add(map);
				break;

			case 1:
				// 삭제
				System.out.print("이름 입력 >>> ");
				name = input.next();
				for(int i=0; i<addArraylist.size(); i++) {
					if (addArraylist.get(i).containsKey(name)) {// 이름이 존재하면
						addArraylist.get(i).remove(name);
						System.out.println("삭제가 완료되었습니다.");
					}
					else {// 이름이 존재하지 않는다면
						System.out.println("존재하지 않는 이름입니다.");
						break;
					}
				}
				break;
				
			case 2:
				// 찾기
				System.out.print("이름 입력 >>> ");
				name = input.next();
				// 출력
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).get(name) != null){
						System.out.println(name + " : " + addArraylist.get(i).get(name));
					}else{
						System.out.println("존재하지 않는 이름입니다.");
					}
				}
				break;
				
			case 3:
				
				for(int i=0; i<addArraylist.size(); i++) {
					Iterator iterator = addArraylist.get(i).entrySet().iterator();
					while(iterator.hasNext()) {
						Entry entry = (Entry)iterator.next();
						System.out.println("이름 : " + entry.getKey() + ", 주소 전화번호: " + entry.getValue());
					}
				}
				break;
				
			case 4:
				map = new HashMap<String, String>();
				int addNumber;
				System.out.print("이름 입력 >>> ");
				name = input.next();
				// 출력
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).get(name) != null)
					System.out.println(i + "번" + " : " + name + " : " + addArraylist.get(i).get(name));
				}
				System.out.println("해당하는 번호를 입력해주세요");
				addNumber = input.nextInt();
				System.out.print("주소 입력 >>> ");
				address = input.next();
				System.out.print("전화 입력 >>> ");
				phonenumber = input.next();
				// 주소와 핸드폰 번호를 합쳐서 저장함
				temp = address + " " + phonenumber;
				map.put(name, temp);
				addArraylist.set(addNumber, map);
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println("전화번호 관리 프로그램을 시작합니다.");

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Test test = new Test();
		
		test.test();

	}

}