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
		
		//��ʼ�������
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://passport.csdn.net/account/login");
		
		driver.manage().window().maximize();
		
		//�������Եȴ�ʱ�� 
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		/*
		 * ��¼����
		 */
		//Login login = new Login();
		
		//���������
		/*login.SetUserName(driver,"root");
		login.SetPassWord(driver,"root");
		login.clickCancel(driver);*/
		

		driver.findElement(By.className("login-code__open")).click();
		Thread.sleep(2000);
		
		//��ȡ�û���
		WebElement user = driver.findElement(By.name("username"));
		user.isDisplayed();
		
		//��ȡ��¼����
		WebElement password = driver.findElement(By.name("password"));
		password.isDisplayed();
		
		//��ȡ��¼��ť��className
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
			Thread.sleep(5000);//���ù̶��ĵȴ�ʱ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("��¼�ɹ�");
		}
		Thread.sleep(8000);
		driver.quit();
		
		

	}

}
