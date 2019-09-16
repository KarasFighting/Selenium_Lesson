package Imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//3-6登录脚本重构by封装
public class Loginnew {
	public WebDriver driver;
	//public Select select;
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedowlond\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/");
		driver.manage().window().maximize();
		
	}
	
	public void loginScript() throws Exception {
		this.InitDriver();
		//下拉选中参数
//		select =  new Select((WebElement) select);
//		((Select) driver.findElement(By.className("input-block-level"))).selectByVisibleText("货主");
		driver.findElement(By.id("js-signin-btn")).click();
		String userType = "name";
		String username = "15349873898";
		String emailElement = "email";
		//定位方式
		String passType = "name";
		//String selectType = "className";
		
		//定位值
		//String seleceKey = "货主";
		String userpass = "woaizly202266";		
		String passworeElement = "password";		
		String buttonElement = "moco-btn";
		String buttonType = "className";
		String headerElement = "header-avator";
		String nameElement = "name";
		Thread.sleep(2000);
		WebElement user = driver.findElement(this.byStr(userType,emailElement));
		//driver.findElement(this.byStr(userBy,emailElement));
		user.isDisplayed();
		
		WebElement password = driver.findElement(this.byStr(passType,passworeElement));
		password.isDisplayed();
		
		WebElement loginButton = driver.findElement(this.byStr(buttonType,buttonElement));
		loginButton.isDisplayed();
		user.sendKeys(username);
		password.sendKeys(userpass);
		
//		WebElement name = driver.findElement(this.byStr(selectType,seleceKey));
//		name.sendKeys(seleceKey);
		
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		WebElement header = driver.findElement(By.id(headerElement));
		header.isDisplayed();	
		
		/*selemium鼠标悬停
		 * Actions actions = new Actions(driver);
		   actions.moveToElement(webElement).clickAndHold().perform();
		   or
		   actions.clickAndHold(webElement).perform();
		*/
		
		Actions actions = new Actions(driver);
		actions.moveToElement(header).perform();	
		
		String userInfo = driver.findElement(By.className(nameElement)).getText();
		if(userInfo.equals("秋水Karsa")) {
			System.out.println("登录成功");
			
		}else {
			System.out.println("登录失败");
		}
		
	}
	
	/*
	 * 封装By by
	 */
	public By byStr(String by,String type) {
		if(by.equals("id")) {
			return By.id(type);
		}else if(by.equals("name")){
			return By.name(type);
		}else if(by.equals("className")){
			return By.className(type);
		}else {
			return By.xpath(type);
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		Loginnew login = new Loginnew();
		//login.InitDriver();
		login.loginScript();
	}
	
	
	
	
}




