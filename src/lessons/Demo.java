package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//selenium+Java实现自动登录

public class Demo {
	public WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

		driver.get("http://www.baidu.com");
						
		WebElement key = driver.findElement(By.className("s_ipt"));
		key.isDisplayed();
		key.sendKeys("华仔");
		
		Thread.sleep(2000);
		driver.findElement(By.id("su")).click();
		
		System.out.println("打开的窗口标题是："+driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();

	}
	
	

}
