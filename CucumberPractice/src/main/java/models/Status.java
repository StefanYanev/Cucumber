package models;

import java.util.HashSet;
import java.util.Set;

public class Status {
	
	private String neww;
	private String workingOnIt;
	private String developed;
	private String cancelled;
	
	
	public Status() {
		
	}
	
	public String getNeww() {
		return neww;
	}

	public void setNeww(String neww) {
		this.neww = neww;
	}
	
	public String getWorkingOnIt() {
		return workingOnIt;
	}
	public void setWorkingOnIt(String workingOnIt) {
		this.workingOnIt = workingOnIt;
	}

	public String getDeveloped() {
		return developed;
	}

	public void setDeveloped(String developed) {
		this.developed = developed;
	}

	public String getCancelled() {
		return cancelled;
	}

	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
	}



 
}
