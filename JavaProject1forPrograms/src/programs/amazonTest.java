package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\MY PC\\\\Desktop\\\\Testing prep\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("9701390753");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("Naga@0547");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("signInSubmit")).click();
		
		String  actualtitle = "Amazon.com. Spend less. Smile more.";
		
		String ExpectedTitle= driver.getTitle();
		
		if(ExpectedTitle.equals(actualtitle)) {
			System.out.println("page title is confirmed");
		}else {
			System.out.println("page tile mismatched!");
		}
		
		
		
		
	}

}
