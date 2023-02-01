package step_definitions;

import org.bouncycastle.util.test.TestRandomData;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterLoginEL;
import utiles.DataReader;
import utiles.Driver;

public class CraterUiComponentsSteps {
	
	CraterLoginEL login = new CraterLoginEL();
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    Driver.getDriver().get(DataReader.getData("craterURL"));
	}
	@Then("I should see page title text")
	public void i_should_see_page_title_text() {
	   String PageTitle = Driver.getDriver().getTitle();
	    
	    Assert.assertEquals(PageTitle, DataReader.getData("pageTitle"));
	    
	}
	@Then("I should see email field box")
	public void i_should_see_email_field_box() {
	    Assert.assertTrue(login.Email.isDisplayed());
	}
	@Then("I should see password field box")
	public void i_should_see_password_field_box() {
	    Assert.assertTrue(login.passowrd.isDisplayed());
	}
	@Then("I should see forget password link")
	public void i_should_see_forget_password_link() {
	    Assert.assertTrue(login.forgotPassword.isDisplayed());
	}
	@Then("I should see login button")
	public void i_should_see_login_button() {
	    Assert.assertTrue(login.loginButton.isDisplayed());
	}
	@Then("I should see a Text area on bottom left text")
	public void i_should_see_a_text_area_on_bottom_left_text() throws InterruptedException {
		Thread.sleep(2000);
	    String copyRightText = login.leftTextArea.getText();
	    Assert.assertEquals(copyRightText, DataReader.getData("CopyRightText22"));
	}

	@Then("I should see a heading Text A")
	public void i_should_see_a_heading_text_a(){
	   String headingtextA = login.headingTextA.getText();
	   Assert.assertEquals(headingtextA, DataReader.getData("HeaderA"));
	}
	@Then("I should see a heading Text B underneath A")
	public void i_should_see_a_heading_text_b_underneath_a() {
	    String headingtextb = login.headingTextB.getText();
	    Assert.assertEquals(headingtextb, DataReader.getData("HeaderB"));
	    		
	}


	

}
