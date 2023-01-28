package genericpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IAutoContant {

	
	static WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
		Flib flib = new Flib();
 
     String url = flib.readPropertyData(,"Url");
     
     if(browserValue.equals("chrome"))
     {
  	   System.setProperty("webdrivre.chrome.driver", "./drivers/chromedriver.exe");
  	  driver=new ChromeDriver();
  	  driver.manage().window().maximize();
  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  	  driver.get("http://127.0.0.1/login.do;jsessionid=2n2akemr5id8m");
  	  
  			  
     }
     
     
		

	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
	}
	@BeforeTest
	public void chromepropierty()
	{
	Flib flib = new Flib();
	
		
	}
	
	
	
}
