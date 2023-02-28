package tek.sdet.framework.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	
	public RetailAccountPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
		@FindBy(id = "signinLink")
		public WebElement signInOption;
		 
		@FindBy(xpath = "//a[@id='newAccountBtn']")
		public WebElement newAccountButton;
		
		@FindBy(xpath = "//input[@id='nameInput']")
		public WebElement nameField;
		
		@FindBy(css = "#emailInput")
		public WebElement emailField;
		
		@FindBy(xpath = "//input[@id='passwordInput']")
		public WebElement passwordInputField;
		
		@FindBy(id = "confirmPasswordInput")
		public WebElement confirmPasswordField;
		
		@FindBy(css = "#signupBtn")
		public WebElement signupButton;
}

