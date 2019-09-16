package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LuanchFirefox  {
	
public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		
		//初始化一个谷歌浏览器实例
		WebDriver driver = new ChromeDriver();
		
		//最大化窗口
		driver.manage().window().maximize();
		
		//设置隐性等待时间
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		// get()打开一个站点
		driver.get("https://www.baidu.com");
		
		//getTitle()获取当前页面title的值
		System.out.println("当前打开页面的标题是： "+ driver.getTitle());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//关闭并退出浏览器
		driver.quit();
		
	}



}
