package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	String userName;
	String passWord;
	
	//�ղι���
	public Login() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    //�û���
	public void SetUserName(WebDriver driver, String userName) {
		// TODO Auto-generated method stub
		WebElement username = driver.findElement(By.id(userName));//��λ�û��������
		username.sendKeys("15349873898");//�����û���
	}
	
	/*public void SetUserName() {
		//class:select2-chosen
		driver.findElement(By.class("select2-chosen")).click();
		WebElement user = driver.findElement(By.class("select2-chosen"));
	}
    */
	//����
	public void SetPassWord(WebDriver driver, String passWord) {
		// TODO Auto-generated method stub
		WebElement password = driver.findElement(By.id(passWord));
		password.sendKeys("woaizly202266");
		
	}

	//����
	public void clickLogin(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/form/input[3]"));
		button.click();
		
	}

	/*public void clickLoginl(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement button = driver.findElement(By.xpath("���ð�ť��xpath"));
		button.click();
		
	}*/

}
