package pages;

import org.openqa.selenium.support.PageFactory;

import utiles.Driver;

public class DashBoardEle {
	
	public DashBoardEle() {
		PageFactory.initElements(Driver.getDriver(), this);
		
		
	}

}
