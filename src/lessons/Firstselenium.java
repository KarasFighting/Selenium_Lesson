package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstselenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");  
        
		//初始化浏览器
	     WebDriver driver = new ChromeDriver();  
	     
	     //最大化窗口
	     driver.manage().window().maximize(); 
	     
	     //设置隐性等待时间
	     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);     
	    
	     driver.get("https://www.baidu.com");  
	     
	   //判断title是不是 百度一下，你就知道
	     try{
	    	 String baidu_title = "百度一下，你就知道";
	    	 assert baidu_title == driver.getTitle();//boolean类型
	    	 System.out.println("是百度首页，测试通过！！！");
	    	 
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	          
	     //睡眠时间
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
