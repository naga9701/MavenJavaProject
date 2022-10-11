package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MY PC\\Desktop\\Testing prep\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		/*driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
*/
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\Desktop\\Testing prep\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com");
		//System.out.println(driver1.getTitle());
		
		driver1.findElement(By.name("email")).sendKeys("9701390753");
		driver1.findElement(By.id("pass")).sendKeys("Naga@0547");
		driver1.findElement(By.name("login")).click();
		System.out.println(driver1.getTitle());
	
		
		
		
	}
	
	
}
