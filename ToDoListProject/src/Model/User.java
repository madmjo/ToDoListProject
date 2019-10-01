package Model;

public class User {
	
	private String userId;
	private String name;
	private String userName;
	private String password;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String userId, String name, String userName, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
