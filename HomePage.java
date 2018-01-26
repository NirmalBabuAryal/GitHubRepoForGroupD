package framework;

import org.openqa.selenium.By;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;
import stepdefinition.SharedSD;

public class HomePage extends BasePage{

//Used for Storing locator and used public method to access them into another class

	private By thirdElement=By.xpath("//span[@class='title ng-binding' and text()='Applesauce, unsweetened']");
	private By fifthElement=By.xpath("//span[@class='title ng-binding' and text()='Juice, Cranberry-apple drink']");
	private By wholeClass=By.xpath("//div[@class='itemContent']");


	public void verifyThirdElement(){
		String actualThirdElement= SharedSD.getDriver().findElement(thirdElement).getText();
		String expectedThirdElement="Applesauce, unsweetened";
		Assert.assertEquals(actualThirdElement,expectedThirdElement,"Invalid Data");
	}

	public void verifyFifthElement(){
		String actualFifthElement= SharedSD.getDriver().findElement(fifthElement).getText();
		String expectedFifthElement="Juice, Cranberry-apple drink";
		Assert.assertEquals(actualFifthElement,expectedFifthElement,"Invalid Data");
	}


	public void displayAllElements(){
		displayAllElement(wholeClass);
	}





}
