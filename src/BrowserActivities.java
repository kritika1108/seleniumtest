import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://phptravels.com/");  
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		}

}
