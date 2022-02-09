package models;
import java.util.HashSet;
import java.util.Set;

public class User {
	
	private String username;
	private String password;
	private Set<Role> roles;
	
	
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;

	}


       // @return
        		
    public String getUsername() {
        	return username;
        }    		
    
        //@param username
        //@return
    
    public void setUsername(String username) {
    	this.username = username;
    
    }
    
      //@return
    
    public String getPassword() {
    	return password;
    }
    
      //@param password
      //@return
    
    public void setPassword(String password) {
    	this.password = password;
    }
      
      //@return
    
    public void setRoles(Set<Role> roles) {
    	if(roles != null){
    		this.roles = roles;
    		} else {
    			this.roles.clear();
    		}
    	}
    
    //@return sashtestvuvashti roli (pozicii) ili prazen set
    public Set<Role> getRoles(){
    	if(roles == null) {
    		roles = new HashSet<>();
    	}
    	return roles;
    }
    
    //@return
    
    
    
  
}
