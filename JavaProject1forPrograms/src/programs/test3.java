package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

class test3{

public static void main(String []args){


	System.setProperty("webdriver.gecko.driver", "C:\\Users\\MY PC\\Desktop\\Testing prep\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	//Headless Testing
	//FirefoxOptions option = new FirefoxOptions();
	
	//option.setHeadless(true);
	//option.addArguments("--headless");
	
//	WebDriver driver = new FirefoxDriver(option);

	WebDriver driver = new FirefoxDriver();
	
	
	driver.get("https://www.google.com");
	
	
	driver.findElement(By.cssSelector("input[class = 'gLFyf gsfi']")).sendKeys("www.amazon.com", Keys.ENTER);
	
//driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
//get commands
System.out.println(driver.getTitle());

System.out.println(driver.getPageSource());


System.out.println(driver.getCurrentUrl());
//browsers commands
//driver.close();-> closes only current window
//driver.quit();->closes multiple windows

}


}
