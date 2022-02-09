package task;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import task.TaskService;
import models.Role;
import models.User;
import models.Project;
import task.TaskService;

class IsItFriday{
static String isItFriday(String today) {
    return null;
}
}


public class TaskSteps {
	
	private User user;
	private String taskName;
	private String message;
	private String today;
	private String actualAnswer;
	


	
	@Given("^В системата влизаме с профил на обикновен дев$")
	public void enterWithDevUser() throws Throwable {
		user = new User("dev", "passDev");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("dev"));
	}
	
	@Given("^В системата влизаме с профил на мениджър$")
	public void enterWithManagerUser() throws Throwable {
		user = new User("manager", "passManager");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("manager"));
	}
	
	@When("^Избираме проект над който да работим$")
	public void chooseProject() {
		actualAnswer = IsItFriday.isItFriday(today);
	   
	}
	
	@When("^Избираме задача която е нова$")
	public void chooseNewProject() throws Throwable {
		message = TaskService.chooseProject(user, taskName);
	}
	
	@When("^Избираме задача която е в процес на разработка$")
	public void chooseWorkingOnItProject() throws Throwable {
		message = TaskService.chooseProject(user, taskName);
	}
	
	@When("^Избираме задача която е готова$")
	public void chooseDeveloppedProject() throws Throwable {
		message = TaskService.chooseProject(user, taskName);
	}
	
	@When("^Избираме задача която е отказана$")
	public void chooseCancelledProject() throws Throwable{
		message = TaskService.chooseProject(user, taskName);
	}
	
	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, message);
	}
	



			
			
	
	

}
