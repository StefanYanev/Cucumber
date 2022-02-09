package models;
import java.util.HashSet;
import java.util.Set;


public class Role {

	private String Developer;
	private String Manager;
	private Set<User> users;


	public Role(String string) {

	}
	
	public String getDeveloper() {
		return Developer;
	}

	public void setDeveloper(String developer) {
		Developer = developer;
	}
	
	public String getManager() {
		return Manager;
	}

	public void setManager(String manager) {
		Manager = manager;
	}
	
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<User> getUsers() {
		if (null == users) {
			users = new HashSet<>();
		}
		return users;
	}







	

}