package models;

public class Task {
	
	private String status;
	private String name;
	private String subtask;
	
	private Task() {}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubtask() {
		return subtask;
	}


	public void setSubtask(String subtask) {
		this.subtask = subtask;
	}


}
