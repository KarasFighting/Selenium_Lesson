package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstselenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");  
        
		//��ʼ�������
	     WebDriver driver = new ChromeDriver();  
	     
	     //��󻯴���
	     driver.manage().window().maximize(); 
	     
	     //�������Եȴ�ʱ��
	     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);     
	    
	     driver.get("https://www.baidu.com");  
	     
	   //�ж�title�ǲ��� �ٶ�һ�£����֪��
	     try{
	    	 String baidu_title = "�ٶ�һ�£����֪��";
	    	 assert baidu_title == driver.getTitle();//boolean����
	    	 System.out.println("�ǰٶ���ҳ������ͨ��������");
	    	 
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	          
	     //˯��ʱ��
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
