package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	
	
	int number;  // ������ ��ȣ�� �Է¹���

	String name;
	String address;
	String phonenumber;
	String temp;

	Scanner input = new Scanner(System.in); // �Է� ��

	ArrayList<HashMap<String, String>> addArraylist = new ArrayList<HashMap<String, String>>(); 
	HashMap<String, String> map;
	
	public void test () {
		while (true) {// ���� ����

			do {

				System.out.println("���� : 0, ���� : 1, ã��: 2, ��ü����: 3, ���� : 4, ���� : 5.");
				System.out.print("�Է� >>> ");
				number = input.nextInt();
			} while ((number < 0) || (number > 5));// number<0 or number>5�϶� �ٽ�
													// �Է¹���
			if (number == 5) {// 5�� �Է½� ���α׷� ����
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}

			// ����ġ �� ����
			switch (number) {
			case 0: 
				map = new HashMap<String, String>();
				System.out.print("�̸� �Է� >>> ");
				name = input.next();
				
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).containsKey(name)){
						System.out.print("�ּ� �Է� >>> ");
						address = input.next();
						System.out.print("��ȭ �Է� >>> ");
						phonenumber = input.next();
						// �ּҿ� �ڵ��� ��ȣ�� ���ļ� ������
						temp = address + " " + phonenumber;
						map.put(name, temp);
						addArraylist.add(map);
					}else{
						System.out.println("�����ϴ� �̸��Դϴ�.");
					}
				}
				
//				// ����
//				System.out.print("�̸� �Է� >>> ");
//				name = input.next();
//				System.out.print("�ּ� �Է� >>> ");
//				address = input.next();
//				System.out.print("��ȭ �Է� >>> ");
//				phonenumber = input.next();
//				// �ּҿ� �ڵ��� ��ȣ�� ���ļ� ������
//				temp = address + " " + phonenumber;
//				map.put(name, temp);
//				addArraylist.add(map);
				break;

			case 1:
				// ����
				System.out.print("�̸� �Է� >>> ");
				name = input.next();
				for(int i=0; i<addArraylist.size(); i++) {
					if (addArraylist.get(i).containsKey(name)) {// �̸��� �����ϸ�
						addArraylist.get(i).remove(name);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					}
					else {// �̸��� �������� �ʴ´ٸ�
						System.out.println("�������� �ʴ� �̸��Դϴ�.");
						break;
					}
				}
				break;
				
			case 2:
				// ã��
				System.out.print("�̸� �Է� >>> ");
				name = input.next();
				// ���
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).get(name) != null){
						System.out.println(name + " : " + addArraylist.get(i).get(name));
					}else{
						System.out.println("�������� �ʴ� �̸��Դϴ�.");
					}
				}
				break;
				
			case 3:
				
				for(int i=0; i<addArraylist.size(); i++) {
					Iterator iterator = addArraylist.get(i).entrySet().iterator();
					while(iterator.hasNext()) {
						Entry entry = (Entry)iterator.next();
						System.out.println("�̸� : " + entry.getKey() + ", �ּ� ��ȭ��ȣ: " + entry.getValue());
					}
				}
				break;
				
			case 4:
				map = new HashMap<String, String>();
				int addNumber;
				System.out.print("�̸� �Է� >>> ");
				name = input.next();
				// ���
				for(int i=0; i<addArraylist.size(); i++) {
					if(addArraylist.get(i).get(name) != null)
					System.out.println(i + "��" + " : " + name + " : " + addArraylist.get(i).get(name));
				}
				System.out.println("�ش��ϴ� ��ȣ�� �Է����ּ���");
				addNumber = input.nextInt();
				System.out.print("�ּ� �Է� >>> ");
				address = input.next();
				System.out.print("��ȭ �Է� >>> ");
				phonenumber = input.next();
				// �ּҿ� �ڵ��� ��ȣ�� ���ļ� ������
				temp = address + " " + phonenumber;
				map.put(name, temp);
				addArraylist.set(addNumber, map);
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		System.out.println("��ȭ��ȣ ���� ���α׷��� �����մϴ�.");

		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		Test test = new Test();
		
		test.test();

	}

}