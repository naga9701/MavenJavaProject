package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class test3{

public static void main(String []args){


	System.setProperty("webdriver.gecko.driver", "C:\\Users\\MY PC\\Desktop\\Testing prep\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	
	
	driver.findElement(By.cssSelector("input[class = 'gLFyf gsfi']")).sendKeys("www.amazon.com", Keys.ENTER);
	
//driver.findElement(By.cssSelector("input[class='gNO89b']")).click();

System.out.println(driver.getTitle());


}


}
