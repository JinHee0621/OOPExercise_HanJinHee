package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("아이디를 입력하세요: ");
		String insertId = sc.nextLine();
		System.out.print("패스워드를 입력하세요: ");
		String insertPwd = sc.nextLine();
		System.out.print("이름을 입력하세요: ");
		String insertName = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int insertAge = sc.nextInt();
		System.out.print("성별을 입력하세요: ");
		char insertGender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("이메일을 입력하세요: ");
		String insertEmail = sc.nextLine();
		
		m[ctn] = new Member(insertId, insertPwd, insertName, insertAge, insertGender, insertEmail);
		ctn += 1;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
	}
}
