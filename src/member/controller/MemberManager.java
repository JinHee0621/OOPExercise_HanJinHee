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
	
	public void searchId() {
		sc.nextLine();
		System.out.print("검색할 아이디를 입력하세요: ");
		String searchId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchName.equals(m[i].getUserName())) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void searchEmail() {
		sc.nextLine();
		System.out.print("검색할 이메일을 입력하세요: ");
		String searchEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(searchEmail.equals(m[i].getUserEmail())) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void updatePwd() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디를 입력하세요: ");
		String FixId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixId.equals(m[i].getUserId())) {
				sc.nextLine();
				System.out.print("변경할 비밀번호를 입력하세요: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원의 이름을 입력하세요: ");
		String FixName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixName.equals(m[i].getUserName())) {
				sc.nextLine();
				System.out.print("변경할 비밀번호를 입력하세요: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void updateEmail() {
		sc.nextLine();
		System.out.print("수정할 회원의 이메일을 입력하세요: ");
		String FixEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(FixEmail.equals(m[i].getUserName())) {
				sc.nextLine();
				System.out.print("변경할 비밀번호를 입력하세요: ");
				m[i].setUserPwd(sc.nextLine());
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void deleteOne() {
		sc.nextLine();
		System.out.print("탈퇴할 회원의 아이디를 입력하세요: ");
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
				System.out.println("삭제할 회원이 존재하지 않습니다.");
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
