package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

public class setup {
	WebDriver dr ;
  
	@BeforeMethod
	public void setup() {
		String s=System.getProperty("user.dir");
		System.out.println("--------------------------");
		System.out.println("Browser going to launched");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		System.setProperty("webdriver.chrome.driver", s+"\\driver\\chromedriver.exe");
		dr = new ChromeDriver(caps);
		System.out.println("---------------------------");
		System.out.println("Browser is launched");
		dr.get("http://www.leafground.com/");
		
	}


}
