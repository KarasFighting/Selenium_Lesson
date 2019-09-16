package Login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverTest {
	
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		
		//初始化浏览器
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://passport.csdn.net/account/login");
		
		driver.manage().window().maximize();
		
		//设置隐性等待时间 
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		/*
		 * 登录功能
		 */
		//Login login = new Login();
		
		//重置输入框
		/*login.SetUserName(driver,"root");
		login.SetPassWord(driver,"root");
		login.clickCancel(driver);*/
		

		driver.findElement(By.className("login-code__open")).click();
		Thread.sleep(2000);
		
		//获取用户名
		WebElement user = driver.findElement(By.name("username"));
		user.isDisplayed();
		
		//获取登录密码
		WebElement password = driver.findElement(By.name("password"));
		password.isDisplayed();
		
		//获取登录按钮的className
		WebElement button = driver.findElement(By.className("logging"));
		button.isDisplayed();
		
		user.sendKeys("15349873898");
		password.sendKeys("woaizly202266");
		Thread.sleep(2000);
		button.click();
		
		/*login.SetUserName(driver,"");
		login.SetPassWord(driver,"");
		login.clickLogin(driver);*/
		
		try {
			Thread.sleep(5000);//设置固定的等待时间
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("登录成功");
		}
		Thread.sleep(8000);
		driver.quit();
		
		

	}

}
