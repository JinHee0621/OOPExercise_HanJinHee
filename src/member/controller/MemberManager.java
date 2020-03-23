package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		sc.nextLine();
		System.out.print("���̵� �Է��ϼ���: ");
		String insertId = sc.nextLine();
		System.out.print("�н����带 �Է��ϼ���: ");
		String insertPwd = sc.nextLine();
		System.out.print("�̸��� �Է��ϼ���: ");
		String insertName = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		int insertAge = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		char insertGender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("�̸����� �Է��ϼ���: ");
		String insertEmail = sc.nextLine();
		
		m[ctn] = new Member(insertId, insertPwd, insertName, insertAge, insertGender, insertEmail);
		ctn += 1;
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
	}
	
	public void searchId() {
		sc.nextLine();
		System.out.print("�˻��� ���̵� �Է��ϼ���: ");
		String searchId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.print("�˻��� �̸��� �Է��ϼ���: ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchName.equals(m[i].getUserName())) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void searchEmail() {
		sc.nextLine();
		System.out.print("�˻��� �̸����� �Է��ϼ���: ");
		String searchEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchEmail.equals(m[i].getUserEmail())) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void updatePwd() {
		sc.nextLine();
		System.out.print("������ ȸ���� ���̵� �Է��ϼ���: ");
		String FixId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixId.equals(m[i].getUserId())) {
				sc.nextLine();
				System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void updateName() {
		sc.nextLine();
		System.out.print("������ ȸ���� �̸��� �Է��ϼ���: ");
		String FixName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixName.equals(m[i].getUserName())) {
				sc.nextLine();
				System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void updateEmail() {
		sc.nextLine();
		System.out.print("������ ȸ���� �̸����� �Է��ϼ���: ");
		String FixEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixEmail.equals(m[i].getUserName())) {
				sc.nextLine();
				System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void deleteOne() {
		sc.nextLine();
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ���: ");
		String deleteId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(deleteId.equals(m[i].getUserId())) {
				for(int j = i+1; j < ctn ; j++) {
					Member temp = new Member();
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
					ctn-=1;
				}
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void deleteAll() {
		for(int i = 0 ;  i < ctn ; i++) {
			m[i].setUserId("");
			m[i].setUserPwd("");
			m[i].setUserName("");
			m[i].setAge(0);
			m[i].setGender(' ');
			m[i].setEmail("");
		}
		ctn = 0;
	}
	
	public void printAllMember() {
		
		for(int i = 0; i < ctn ; i++) {
			System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + "," + m[i].getUserName() + ", "
					+ m[i].getAge() + ", " + m[i].getGender() + ", " + m[i].getUserEmail());
		}
	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId() + ", " + m.getUserPwd() + "," + m.getUserName() + ", "
				+ m.getAge() + ", " + m.getGender() + ", " + m.getUserEmail());
	}
}
