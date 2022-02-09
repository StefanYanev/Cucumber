package login;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homescreen.HomeScreenModel;

public class LoginSteps {

	private HomeScreenModel loginScreen;
	
	public LoginSteps(final HomeScreenModel loginScreen) {
		this.loginScreen = loginScreen;
	}
	
	@Given("^Потребителят отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginScreen = new HomeScreenModel();
	}
	
	@When ("^Въведе \"([^\"]*)\" потребителско име$")
	public void addUsername(final String username) throws Throwable {
		loginScreen.setUsername(username);
	}
	
	@When("^Въведе \"([^\\\"]*)\" парола$")
	public void addPassword(final String pass) throws Throwable {
		loginScreen.setPassword(pass);
	}
	
	@When("^Натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginScreen.clickLoginButton();
	}
	
	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginScreen.getMessage());
	}
	

}
