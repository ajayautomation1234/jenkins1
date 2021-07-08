package A_A_A_A_A_A_A_A_A_A_jenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jenkins_integration {
	
	WebDriver driver;
	@BeforeClass
	public void initi() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("first script exicuted successfully");
	}
	
	@AfterClass
	public void close()
	{
driver.close();
}
}