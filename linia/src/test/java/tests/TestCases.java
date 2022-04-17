package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Base;
import model.Locators;
import model.TimeOut;
import model.commonMethods;
import pages.HomePage;

public class TestCases {
 //Enter the URL
	Base base = new Base();
	WebDriver driver = base.setup();
	
	commonMethods CommonMethods = new commonMethods(driver);
	
	HomePage homePage = new HomePage(driver);
	TimeOut time = new TimeOut();
	
	@Test
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
		
		//create account
		CommonMethods.clickOnButton(Locators.loginClick);
		time.timeOut();
		
		CommonMethods.sendText(Locators.enterEmailAddress,"linia101010@gmail.com");
		time.timeOut();
		
		CommonMethods.clickOnButton(Locators.CreatAccountClick);
		time.timeOut();
		
		//create account form fill-up
		CommonMethods.clickOnButton(Locators.gender);
		time.timeOut();
		
		CommonMethods.sendText(Locators.firstName,"linia");
		time.timeOut();
		
		CommonMethods.sendText(Locators.lastName,"ritu");
		time.timeOut();
		
		CommonMethods.sendText(Locators.passWord,"linia@ritu");
		time.timeOut();
		
		//date of berth drop-down
			CommonMethods.clickOnButton(Locators.daysSection);
			time.timeOut();
			CommonMethods.clickOnButton(Locators.date);
			time.timeOut();
			//month
			CommonMethods.clickOnButton(Locators.monthSection);
			time.timeOut();
			CommonMethods.clickOnButton(Locators.month);
			time.timeOut();
			//years
			CommonMethods.clickOnButton(Locators.yearsSection);
			time.timeOut();
			CommonMethods.clickOnButton(Locators.year);
			time.timeOut();
		
		//account by
		CommonMethods.clickOnButton(Locators.invitation);
		time.timeOut();
		
		//address section
		CommonMethods.sendText(Locators.address1, "Amazon forest");
		time.timeOut();
		CommonMethods.sendText(Locators.city, "Rain forest");
		time.timeOut();
		CommonMethods.clickOnButton(Locators.stateDrop_down);
		time.timeOut();
		CommonMethods.clickOnButton(Locators.stateSelect);
		time.timeOut();
		CommonMethods.sendText(Locators.zipeCode, "35242");
		time.timeOut();
		CommonMethods.sendText(Locators.mobileNumber, "0987656789");
		time.timeOut();
	
		//clickResister
		CommonMethods.clickOnButton(Locators.clickResister);
		time.timeOut();
		
		//sign out
		CommonMethods.clickOnButton(Locators.signOut);
		time.timeOut();
		
		//sign in
		CommonMethods.sendText(Locators.signEmail, "ritu1@gmail.com");
		time.timeOut();
		CommonMethods.sendText(Locators.signPasswd, "linia@ritu");
		time.timeOut();
		CommonMethods.clickOnButton(Locators.signBtn);
		time.timeOut();
		
		
		//hover click and product select
		WebElement hover = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
		
		CommonMethods.clickOnButton(Locators.CasualDress);
		time.timeOut();
		CommonMethods.clickOnButton(Locators.wemanDress);
		time.timeOut();
		CommonMethods.clickOnButton(Locators.Color);
		time.timeOut();
		CommonMethods.clickOnButton(Locators.Product);
		time.timeOut();
		CommonMethods.clickOnButton(Locators.addtoCard);
		time.timeOut();
		
		
		
		
		
	}
	
	
}










