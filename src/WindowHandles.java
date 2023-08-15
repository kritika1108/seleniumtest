import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String>it=   windows.iterator();
		String PartentId= it.next();
		String ChildId= it.next();

		driver.switchTo().window(ChildId);
		System.out.print(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		 driver.switchTo().window(PartentId);
		 driver.findElement(By.id("username")).sendKeys(email); 

	}

}
