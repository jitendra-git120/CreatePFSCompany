package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateSingleUserCompany {

	static WebDriver driver;

	public static void main(String are[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin.aptdev.ca/");
		click_On_Button_Logon();
		click_On_Link_Profile_Management();
		click_On_Link_PFS_Company();
		
		for (int i = 8; i <= 16; i++) {
			click___FI("CIBC");
			enter___Web("TestUser-CIBC-Single-"+i);
			enter___Address_("Add1");
			enter___City_("City1");
			click___Province_();
			enter___Postal("E1E1E1");
			enter___Contact_("hI123");
			enter___Telephone_("2243123123");
			enter___Email_("jsaxena@xavient.com");
			enter___Telephone_("2243123123");
			enter_Mailing_transit("83836");
			enter___Enrollment("83836");
			enter_Branch_("34343");
			enter_Account_("213312312");
			enter_Branch_("34343");//duplicate entry due to sync issue
			click_On_Button_Add_Account();
			click_On_Button_Add_1();
		}

	}

	static String btn_Logon = "//input[@value='Logon']";
	static String link_Profile_Management = "//span[text()='Profile Management']/..";
	static String link_PFS_Company = "//span[text()='PFS Company Add']/..";
	static String inp___FI = "(//label[contains(text(),'FI #:')]/../following-sibling :: *//input)[1]/../..";
	static String inp___Web = "(//label[contains(text(),'Web name:')]/../following-sibling :: *//input)[1]";
	static String inp___Address_ = "(//label[contains(text(),'Address:')]/../following-sibling :: *//input)[1]";
	static String inp___City_ = "(//label[contains(text(),'City:')]/../following-sibling :: *//input)[1]";
	static String inp___Province_ = "(//label[contains(text(),'Province:')]/../following-sibling :: *//input)[1]/../..";
	static String inp___Postal = "(//label[contains(text(),'Postal code:')]/../following-sibling :: *//input)[1]";
	static String inp___Contact_ = "(//label[contains(text(),'Contact:')]/../following-sibling :: *//input)[1]";
	static String inp___Telephone_ = "(//label[contains(text(),'Telephone:')]/../following-sibling :: *//input)[1]";
	static String inp___Email_ = "(//label[contains(text(),'Email:')]/../following-sibling :: *//input)[1]";
	static String inp_Mailing_transit = "(//label[contains(text(),'Mailing transit #:')]/../following-sibling :: *//input)[1]";
	static String inp___Enrollment = "(//label[contains(text(),'Enrollment (servicing) transit #:')]/../following-sibling :: *//input)[1]";
	static String inp_Branch_ = "//input[@id='addCompanyFormId:accordion:branchInputId']";
	static String inp_Account_ = "//input[@id='addCompanyFormId:accordion:accInputId']";
	static String btn_Add_Account = "//span[text()='Add Account']/..";
	static String inp_FI___ = "(//[contains(text(),'FI #:')]/following-sibling :: *//input)[1]";
	static String btn_Add_1 = "//span[text()='Add ']/..";

	public static void click_On_Button_Logon() {
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("224100001");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("1234");
		System.out.println("[INFO] Clicking on Button Logon.");
		driver.findElement(By.xpath(btn_Logon)).click();
	}

	public static void click_On_Link_Profile_Management() {
		System.out.println("[INFO] Clicking on Link Profile_Management.");
		driver.findElement(By.xpath(link_Profile_Management)).click();
	}

	public static void click_On_Link_PFS_Company() {
		System.out.println("[INFO] Clicking on Link PFS_Company.");
		driver.findElement(By.xpath("//li[@id='layoutFormID:profileManagementId']")).click();
		driver.findElement(By.xpath(link_PFS_Company)).click();
	}

	public static void click___FI(String fi) {
		System.out.println("[INFO] Clicking __FI.");
		driver.findElement(By.xpath(inp___FI)).click();
		wait(1);
		driver.findElement(By.xpath("//li[text()='"+fi+"']")).click();
	}

	public static void enter___Web(String __Web) {
		System.out.println("[INFO] Entering __Web.");
		wait(1);
		driver.findElement(By.xpath(inp___Web)).sendKeys(__Web);
	}

	public static void enter___Address_(String __Address_) {
		System.out.println("[INFO] Entering __Address_.");
		driver.findElement(By.xpath(inp___Address_)).sendKeys(__Address_);
	}

	public static void enter___City_(String __City_) {
		System.out.println("[INFO] Entering __City_.");
		driver.findElement(By.xpath(inp___City_)).sendKeys(__City_);
	}

	public static void click___Province_() {
		wait(1);
		System.out.println("[INFO] Click __Province_.");
		driver.findElement(By.xpath(inp___Province_)).click();
		wait(1);
		driver.findElement(By.xpath("//li[text()='Ontario']")).click();
	}

	public static void enter___Postal(String __Postal) {
		System.out.println("[INFO] Entering __Postal.");
		driver.findElement(By.xpath(inp___Postal)).sendKeys(__Postal);
	}

	public static void enter___Contact_(String __Contact_) {
		System.out.println("[INFO] Entering __Contact_.");
		driver.findElement(By.xpath(inp___Contact_)).sendKeys(__Contact_);
	}

	public static void enter___Telephone_(String __Telephone_) {
		wait(1);
		System.out.println("[INFO] Entering __Telephone_.");
		driver.findElement(By.xpath(inp___Telephone_)).clear();
		driver.findElement(By.xpath(inp___Telephone_)).sendKeys(__Telephone_);
	}

	public static void enter___Email_(String __Email_) {
		System.out.println("[INFO] Entering __Email_.");
		driver.findElement(By.xpath(inp___Email_)).sendKeys(__Email_);
	}

	public static void enter_Mailing_transit(String Mailing_transit) {
		System.out.println("[INFO] Entering Mailing_transit.");
		driver.findElement(By.xpath(inp_Mailing_transit)).clear();
		driver.findElement(By.xpath(inp_Mailing_transit)).sendKeys(Mailing_transit);
	}

	public static void enter___Enrollment(String __Enrollment) {
		System.out.println("[INFO] Entering __Enrollment.");
		driver.findElement(By.xpath(inp___Enrollment)).clear();
		driver.findElement(By.xpath(inp___Enrollment)).sendKeys(__Enrollment);
	}

	public static void enter_Branch_(String Branch_) {
		wait(2);
		System.out.println("[INFO] Entering Branch_.");
		driver.findElement(By.xpath(inp_Branch_)).clear();
		wait(2);
		driver.findElement(By.xpath(inp_Branch_)).sendKeys(Branch_);
	}

	public static void enter_Account_(String Account_) {
		wait(1);
		System.out.println("[INFO] Entering Account_.");
		driver.findElement(By.xpath(inp_Account_)).sendKeys(Account_);
	}

	public static void click_On_Button_Add_Account() {
		wait(1);
		System.out.println("[INFO] Clicking on Button Add_Account.");
		driver.findElement(By.xpath(btn_Add_Account)).click();
	}

	public static void click_On_Button_Add_1() {
		System.out.println("[INFO] Clicking on Button Add_1.");
		driver.findElement(By.xpath(btn_Add_1)).click();
		wait(3);
		driver.findElement(By.xpath("//span[text()='Add Another PFS Company']/..")).click();
	}

	static void wait(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
