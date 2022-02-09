package login;

import java.util.Collections;
import java.util.List;
import models.User;


// DOBAVI IMPORT. USER....


public class LoginService {
	
	private static List<User> userdb = Collections.singletonList(new User("Petar", "Qkaparola"));
	
	public static String login(final String username, final String password) {
		
		if (username == null || password == null) {
			return "Не сте въвели име и парола!!";
		
		}
		
		boolean isUserExists = userdb.stream().anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
		return isUserExists ? "Успешно влязохте!" : "Неуспешно влизане!";
	}

}
