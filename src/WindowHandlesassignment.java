import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
	
		
	//String[] car= new String[2]{"a", "b"};
	
		
		

	}

}
