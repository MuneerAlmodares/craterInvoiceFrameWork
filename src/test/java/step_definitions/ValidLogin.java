package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterLoginEL;
import utiles.BrowserUtils;
import utiles.DataReader;
import utiles.Driver;

public class ValidLogin {
	
	boolean userEmpty;
	boolean passwordEmpty;
	
	BrowserUtils utiles = new 	BrowserUtils();
	CraterLoginEL login = new CraterLoginEL();
	
	@Given("User navigate to the login page")
	public void user_navigate_to_the_login_page() {
	    Driver.getDriver().get(DataReader.getData("craterURL"));
	    
	}
	@When("User enter a valid Email {string}")
	public void user_enter_a_valid_email(String email) {
		
	    utiles.sendKeysWithActionsClass(login.Email, email);;
	}
	@When("User enter a valid Password {string}")
	public void user_enter_a_valid_password(String password) {
	    utiles.sendKeysWithActionsClass(login.passowrd, password);
	}
	@When("User click on the Login button")
	public void user_click_on_the_login_button() {
	    login.loginButton.click();
	}
	@Then("User should be on Dashboard Page")
	public void user_should_be_on_dashboard_page() throws InterruptedException {
		Thread.sleep(2000);
	   String currentURL = Driver.getDriver().getCurrentUrl();
	   Assert.assertEquals(currentURL, DataReader.getData("dashboardURL"));
	}
	
	
	// Invalid test 
	
	@When("User enter a invalid or blank  Email {string} and {string}")
	public void user_enter_a_invalid_or_blank_email_and(String userEmail, String Password) {
	    utiles.sendKeysWithActionsClass(login.Email, userEmail);
	    utiles.sendKeysWithActionsClass(login.passowrd, Password);
	    userEmpty = userEmail.isBlank();
	    passwordEmpty= Password.isBlank();
	    
	}
	@Then("User should see errore message")
	public void user_should_see_errore_message() {
		
		if(userEmpty || passwordEmpty ) {
			utiles.waitUntilElementVisible(login.FieldrequiredError);
			Assert.assertTrue(login.FieldrequiredError.isDisplayed());
		}else {
			utiles.waitUntilElementVisible(login.invalidUserErrorMessage);
			Assert.assertTrue(login.invalidUserErrorMessage.isDisplayed());
		}
	    
	}



}
