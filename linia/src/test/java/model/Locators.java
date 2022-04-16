package model;

import org.openqa.selenium.By;

public class Locators {
	public static String homePageUrl = "http://automationpractice.com/index.php";
	
	//Create account 1
	public static By loginClick = By.xpath("//a[contains(text(),'Sign in')]");
	public static By CreatAccountClick = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	public static By enterEmailAddress = By.xpath("//input[@id='email_create']");
	
	//registration
	public static By gender= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/label[1]");
	public static By firstName = By.xpath("//input[@id='customer_firstname']");
	public static By lastName = By.xpath("//input[@id='customer_lastname']");
	public static By passWord = By.xpath("//input[@id='passwd']");
		
		//date of berth in registration form drop-down
		//days
		public static By daysSection = By.xpath("//select[@id='days']");
		public static By date = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/select[1]/option[6]");
		//month
		public static By monthSection = By.xpath("//select[@id='months']");
		public static By month = By.xpath("//option[contains(text(),'March')]");
		//years
		public static By yearsSection = By.xpath("//select[@id='years']");
		public static By year = By.xpath("//option[contains(text(),'1997')]");
	
	//invitation by
	public static By invitation = By.xpath("//input[@id='newsletter']");
	
	//address
	public static By address1 = By.xpath("//input[@id='address1']");
	public static By city = By.xpath("//input[@id='city']");
	public static By stateDrop_down = By.xpath("//select[@id='id_state']");
	public static By stateSelect = By.xpath("//option[contains(text(),'Alabama')]");
	public static By zipeCode = By.xpath("//input[@id='postcode']");
	public static By mobileNumber = By.xpath("//input[@id='phone_mobile']");
	
	//click resister
	public static By clickResister = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
	
	//sign-out
	public static By signOut = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]");
	
	
	//sign in
	public static By signEmail = By.xpath("//input[@id='email']");
	public static By signPasswd = By.xpath("//input[@id='passwd']");
	public static By signBtn = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");
	
	//hover click and product select
	public static By CasualDress = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
	public static By wemanDress = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
	public static By Color = By.xpath("//input[@id='layered_id_attribute_group_14']");
	public static By Product = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	public static By addtoCard = By.xpath("//span[contains(text(),'Add to cart')]");

	


}
