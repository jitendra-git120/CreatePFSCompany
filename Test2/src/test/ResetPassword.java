package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResetPassword {

	static WebDriver driver;
	static String FI = "RBC";

	public static void main(String are[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://royalbank.aptdev.ca/login.xhtml");
		int users = 33011675;
		String tempPass[] = {"PxH6bvQ6","DTntW8jt","Jq3f6VtR","DjSUXvuM","qx26KpCj","3CP82j9A","snkdxbvq","JpqRj4HP","QaXkrjFG","AzWYj722"};
		for (int i = 9; i < 10; i++) {
			enter_Scotiabank_Payment((users+i)+"");
			enter_Password_(tempPass[i]);
			enter_Enter_current(tempPass[i]);
			enter_Enter_new_password_("test@1234");
			enter_Re_enter_new("test@1234");
			click_On_Button_Save();
			click_On_Button_Done();
			click_On_Link_Sign_off();			
		}
	}

	static String  inp_Scotiabank_Payment = "(//label[contains(text(),' ID:') or contains(text(),' ID')]/../following-sibling :: *//input)[1]";
	static String  inp_Password_ = "(//label[contains(text(),'Password')]/../following-sibling :: *//input)[1]";
	static String  inp_Enter_current = "(//label[contains(text(),'Enter current password:')]/../../following-sibling :: *//input)[1]";
	static String  inp_Enter_new_password_ = "(//label[contains(text(),'Enter new password:')]/../../following-sibling :: *//input)[1]";
	static String  inp_Re_enter_new = "(//label[contains(text(),'Re-enter new password:')]/../../following-sibling :: *//input)[1]";
	static String  btn_Save = "//span[text()='Save']/..";
	static String  btn_Done = "//span[text()='Done']/..";
	static String  link_Sign_off = "//*[text()='Sign Off' or text()='Sign off' or text()='Logout']";

	public static void enter_Scotiabank_Payment(String Scotiabank_Payment) {
		System.out.println("[INFO] Entering Scotiabank_Payment: "+Scotiabank_Payment);
		driver.findElement(By.xpath(inp_Scotiabank_Payment)).sendKeys(Scotiabank_Payment);
	}

	public static void enter_Password_(String Password_) {
		System.out.println("[INFO] Entering Password_: "+Password_);
		driver.findElement(By.xpath(inp_Password_)).sendKeys(Password_);
		driver.findElement(By.xpath("//span[text()='Login' or text()='Sign On' or text()='Sign In']/..")).click();
	}

	public static void enter_Enter_current(String Enter_current) {
		System.out.println("[INFO] Entering Enter_current.");
		driver.findElement(By.xpath(inp_Enter_current)).sendKeys(Enter_current);
	}

	public static void enter_Enter_new_password_(String Enter_new_password_) {
		System.out.println("[INFO] Entering Enter_new_password_.");
		driver.findElement(By.xpath(inp_Enter_new_password_)).sendKeys(Enter_new_password_);
	}

	public static void enter_Re_enter_new(String Re_enter_new) {
		System.out.println("[INFO] Entering Re_enter_new.");
		driver.findElement(By.xpath(inp_Re_enter_new)).sendKeys(Re_enter_new);
	}

	public static void click_On_Button_Save() {
		System.out.println("[INFO] Clicking on Button Save.");
		driver.findElement(By.xpath(btn_Save)).click();
	}

	public static void click_On_Button_Done() {
		System.out.println("[INFO] Clicking on Button Done.");
		wait(2);
		driver.findElement(By.xpath(btn_Done)).click();
	}

	public static void click_On_Link_Sign_off() {
		System.out.println("[INFO] Clicking on Link Sign_off.");
		driver.findElement(By.xpath(link_Sign_off)).click();
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
