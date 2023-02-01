package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiles.DataReader;
import utiles.Driver;

public class CraterLoginEL {
	
	public CraterLoginEL() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passowrd;
	
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	public WebElement forgotPassword;
	
	
	@FindBy(css = ".inline-flex")
	public WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Copyright @ Crater Invoice, Inc. 2023']")
	public WebElement leftTextArea;
	
	@FindBy(css = ".hidden.mb-3")
	public WebElement headingTextA;
	
	@FindBy(css = ".hidden.text-sm")
	public WebElement headingTextB;
	
	@FindBy(xpath = "//span[text()='Amount Due']")
	public WebElement amountdueText;
	
	@FindBy(xpath = "//p[contains(text(), 'These credentials do not match our records.')]")
	public WebElement invalidUserErrorMessage;
	
	@FindBy(xpath = "//span[text()='Field is required']")
	public WebElement FieldrequiredError;
	
	

	
	

	
	public void login() {
		Email.sendKeys(DataReader.getData("validEmail"));;
		passowrd.sendKeys(DataReader.getData("passowrd"));
		
	}


}
