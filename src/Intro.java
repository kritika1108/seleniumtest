import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	MethodDemo d= new MethodDemo();
	//	d.getdata();
 		
		//System.setProperty("webdriver.chrome.driver", "/Users/kritikagoyal/ChromeDriver/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","/Users/kritikagoyal/ChromeDriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		// driver.getTitle(a);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	 	driver.findElement(By.name("email")).sendKeys("kritika@gmail.com");
	 	getPassword(driver);
	 	//	driver.findElement(By.name("password")).sendKeys("kritika");
	 	driver.findElement(By.name("submit")).click();		

	}
	
	
	public static void getPassword(WebDriver driver) {
		driver.findElement(By.name("password")).sendKeys("kritika");
	 
	}
	
	
}
