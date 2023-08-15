import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	

		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	


		//Types ofDropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

		for(int i = 1;i<4;i++) 
		{
			WebElement dropdown=  driver.findElement(By.id("hrefIncAdt"));
			dropdown.click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();	
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult" );
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
 

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='AMD']")).click();	
		//driver.findElement(By.xpath("//a[@value='AMD']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BHO']")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.cssSelector("td[class='.ui-state-default.ui-state-highlight.ui-state-active'] a")).click();
		
		Thread.sleep(1000);


		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);

		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option: options) {

			if(option.getText().equalsIgnoreCase("India"))

			{
				Thread.sleep(1000);
				option.click();
				break;
			}
		}

	}

}
