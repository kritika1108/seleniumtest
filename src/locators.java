import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.com/");

		System.out.println(driver.findElement(By.cssSelector(".hero-text-1")).getText());
		//Assert.asserteEquals(
		
		//Assert.assertEquals(actual, Expected);
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".hero-text-1")).getText(), "Startup Your Online Travel Agency Today!");
			driver.close();
	}
	
	
	
}