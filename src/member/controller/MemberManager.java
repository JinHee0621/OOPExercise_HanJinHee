package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
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
}
