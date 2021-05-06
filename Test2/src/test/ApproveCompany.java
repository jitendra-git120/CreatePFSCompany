package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ApproveCompany {

	static WebDriver driver;
	static String FI = "RBC";

	public static void main(String are[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin.aptdev.ca/");
		click_On_Button_Logon();
		for (int i = 106503369; i <= 106503373; i++) {
			click_On_Button_Search(i+"");
			click_On_Button_Approve();
			click_On_Button_Back_to();
		}
	}
	static String btn_Logon = "//input[@value='Logon']";
	static String btn_Search = "//span[text()='Search']/..";
	static String btn_Approve = "//span[text()='Approve']/..";
	static String btn_Back_to = "//span[text()='Back to List']/..";

	public static void click_On_Button_Logon() {
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("224100002");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("1234");
		System.out.println("[INFO] Clicking on Button Logon.");
		driver.findElement(By.xpath(btn_Logon)).click();
	}

	public static void click_On_Button_Search(String companyID) {
		wait(3);
		driver.findElement(By.xpath("//input[@id='searchApprovalsFormId:companyId']")).clear();
		driver.findElement(By.xpath("//input[@id='searchApprovalsFormId:companyId']")).sendKeys(companyID);
		System.out.println("[INFO] Clicking on Button Search.");
		driver.findElement(By.xpath(btn_Search)).click();
	}

	public static void click_On_Button_Approve() {
		wait(2);
		driver.findElement(By.xpath("//tbody[@id='searchApprovalsFormId:companiesSearchDataTableId_data']/tr")).click();
	
		System.out.println("[INFO] Clicking on Button Approve.");
		wait(2);
		driver.findElement(By.xpath(btn_Approve)).click();
		if(FI.equals("RBC"))
			driver.findElement(By.xpath("//button[@id='companyApprovalFormId:okBtnId']")).click();
	}

	public static void click_On_Button_Back_to() {
		wait(5);
		System.out.println("[INFO] Clicking on Button Back_to.");
		try {
		driver.findElement(By.xpath(btn_Back_to)).click();
		}catch(Exception e) {
			wait(2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(btn_Back_to)));
		}
	}

	static void wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
