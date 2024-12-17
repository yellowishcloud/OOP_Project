package models;
import java.io.Serializable;

public abstract class User implements Serializable {
	private static final long serialVersionUID =1L;
	protected String username;
	protected String password;
	
	public User() {
		
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String toString() {
		return this.username;
	}
}
