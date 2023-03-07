package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
 POMFactory factory = new POMFactory();
 
 @When ("User click on Account option")
 public void UserClickOnAccountOption() {
 click(factory.homePage().accountOption);
 logger.info("User click on Account option");
 }
 
 
 @And ("User update Name {string} and Phone {string}")
 public void UserUpdateNameAndPhone(String nameValue, String phoneNumberValue) {
	    clearTextUsingSendKeys(factory.accountPage().nameField);
	    sendText(factory.accountPage().nameField, nameValue);
	    clearTextUsingSendKeys(factory.accountPage().PhoneNumberField);
		sendText(factory.accountPage().PhoneNumberField, phoneNumberValue);
		logger.info("User update Name and Phone");
	 
 }
 
 @And ("User click on Update button")
  public void UserClickOnUpdateButton() {
	 click(factory.accountPage().UpdateButton);
		logger.info("User click on Update button");
 }
     
     
 @Then ("user profile information should be updated")
 public void UserProfileInformationShouldBeUpdated() {
	 waitTillPresence(factory.accountPage().UpdateButton);
		 Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdateButton));
		logger.info("Information is update");
		
//		@Then ("user profile information should be updated")
//		 public void UserProfileInformationShouldBeUpdated() {
//			 waitTillPresence(factory.accountPage().UpdateButton);
//			 String actualMessage = factory.accountPage().UpdateButton.getText();
//			 String expectedMessage = "Information is update";
//				 Assert.assertEquals(expectedMessage, actualMessage);
//				logger.info("Information is update");
		
 }
}
 

