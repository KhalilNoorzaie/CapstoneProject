package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void UserClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user clicked on Sign in Option");
		
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("user entered email and password");
	}
	@And("User click on login button")
	public void UserClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("User click on login button");
		
		
	}
	@Then("User should be logged in into Account")
	public void UserShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User should be logged in into Account");
		
	}
	@And("User click on Logout option")
	public void UserClickOnLogoutOption() {
		click(factory.homePage().logoutButton);
		logger.info("User click on Logout option");
	}
	
	@When("User click on Creat New Account button")
	public void userClickOnCreatNewAccountButton() {
	    click(factory.signInPage().createNewAccountButton);
	    logger.info("user clicked on Create New Account button");
	    
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	    sendText(factory.signInPage().createNewAccountNameField,data.get(0).get("name"));
	    sendText(factory.signInPage().createNewAccountEmailField,data.get(0).get("email"));
	    sendText(factory.signInPage().createNewAccountPasswordField,data.get(0).get("password"));
	    sendText(factory.signInPage().createNewAccountConfPassField,data.get(0).get("confirmPassword"));
	    logger.info("User filled the signUp information form");
	    
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    // Write code here that turns the phrase above into concrete actions
	    click(factory.signInPage().signUpButton);
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
}
