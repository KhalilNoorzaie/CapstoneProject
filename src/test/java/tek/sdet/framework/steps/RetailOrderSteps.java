package tek.sdet.framework.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().accountOption);
		logger.info("User click on Orders section");
		
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().);
		logger.info("User click on Orders section");		
	}
	
}
