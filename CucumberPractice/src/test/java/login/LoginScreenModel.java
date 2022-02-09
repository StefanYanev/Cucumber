package login;

import login.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void setUsername(String username) {
		this.username = username;

	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);

	}

	public String getMessage() {
		return message;
	}

} 

	
	
