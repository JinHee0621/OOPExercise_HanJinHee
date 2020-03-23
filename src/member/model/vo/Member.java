package member.model.vo;

public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	
	public Member() {}
	
	public Member(String userId, String userPwd, String userName, int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
}
