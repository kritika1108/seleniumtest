import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/Downloads/chromedriver_mac64/chromedriver");

		WebDriver driver= new ChromeDriver();

		String[] itemsNeeded= {"Cucumber", "Grapes"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		additems(driver,itemsNeeded);
	}


	public static void additems(WebDriver driver, String[] itemsNeeded) {

		int j=0;
		{List<WebElement> products=  driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++) {

			String[] name = products.get(i).getText().split("-");
			String newName= name[0].trim();

			List items= Arrays.asList(itemsNeeded);


			if(items.contains(newName)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==itemsNeeded.length) 

				{
					break;

				}

			}


		}

		}
	}
}

