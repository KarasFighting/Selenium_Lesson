package Imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//��¼�ű��ع�element��װ
public class LoginBy {
	public WebDriver driver;
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/");
		driver.manage().window().maximize();
		
	}
	
	public void loginScript() throws Exception{
		this.InitDriver();
		driver.findElement(By.id("js-signin-btn")).click();
		String userType = "name";
		String username = "15349873898";
		String emailElement = "email";
		//��λ��ʽ
		String passType = "name";
		
		//��λֵ
		String userpass = "woaizly202266";		
		String passworeElement = "password";		
		String buttonElement = "moco-btn";
		String buttonType = "className";
		String headerElement = "header-avator";
		String nameElement = "name";
		String headerBy = "id";
		String nameInFo = "className";
		
	
		Thread.sleep(2000);
		
		WebElement user = this.element(this.byStr("username"));
		//driver.findElement(this.byStr(userBy,emailElement));
		user.isDisplayed();
		WebElement password = this.element(this.byStr("userpass"));
		password.isDisplayed(); 
		WebElement loginButton = this.element(this.byStr("headerBy"));
		loginButton.isDisplayed();
		user.sendKeys(username);
		password.sendKeys(userpass);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		WebElement header = this.element(this.byStr(headerBy));
		header.isDisplayed();	
		
		/*selemium�����ͣ
		 * Actions actions = new Actions(driver);
		   actions.moveToElement(webElement).clickAndHold().perform();
		   or
		   actions.clickAndHold(webElement).perform();
		*/
		
		Actions actions = new Actions(driver);
		actions.moveToElement(header).perform();	
		
		String userInfo = this.element(this.byStr(nameInFo)).getText();
		if(userInfo.equals("��ˮKarsa")) {
			System.out.println("��¼�ɹ�");
			
		}else {
			System.out.println("��¼ʧ��");
		}
		
	}
	
	/*
	 * ��װBy by
	 */
	public By byStr(String by) {
		/*
		 * ��ȡ��װ�õ������ļ�
		 * */
		ProUnitBy properties = new ProUnitBy("element.properties");
		properties.getPro("username");
		String locator = properties.getPro("username");
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[0];
		
		
		
		if(locatorType.equals("id")) {
			return By.id(locatorValue);
		}else if(locatorType.equals("name")){
			return By.name(locatorValue);
		}else if(locatorType.equals("className")){
			return By.className(locatorValue);
		}else {
			return By.xpath(locatorValue);
		}
		
	}
	
	/**
	 *��¼�ű��ع�element��װ
	 * @param args
	 * @return 
	 * @return 
	 * @throws Exception
	 */
	public WebElement element(By by) {
		WebElement ele = driver.findElement(by);
		return ele;
	}
	
	
	public static void main(String[] args) throws Exception {
		LoginBy login = new LoginBy();
		//login.InitDriver();
		login.loginScript();
	}
	
	
	

}
