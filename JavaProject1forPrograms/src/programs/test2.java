package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MY PC\\Desktop\\Testing prep\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.cssSelector("input[class = 'gLFyf gsfi']")).sendKeys("www.facebook.com", Keys.ENTER);
		
		driver.findElement(By.xpath("//a[Text() = 'Facebook - log in or sign up']")).click();
	}
	
}
