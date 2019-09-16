package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LuanchFirefox  {
	
public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		
		//��ʼ��һ���ȸ������ʵ��
		WebDriver driver = new ChromeDriver();
		
		//��󻯴���
		driver.manage().window().maximize();
		
		//�������Եȴ�ʱ��
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		// get()��һ��վ��
		driver.get("https://www.baidu.com");
		
		//getTitle()��ȡ��ǰҳ��title��ֵ
		System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�رղ��˳������
		driver.quit();
		
	}



}