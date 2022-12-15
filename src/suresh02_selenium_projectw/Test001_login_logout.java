package suresh02_selenium_projectw;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test001_login_logout {
public static void main(String[] args) throws Exception {

//test cases
	
System.setProperty("webdriver.gecko.driver ","C:\\Users\\USER\\Downloads\\Naresh IT\\"
		+ "Suresh sir automation download\\selenium web driver\\geckodriver.exe");
		
WebDriver driver =new FirefoxDriver();

driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");

Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();

Thread.sleep(4000);
driver.close();


	}}
