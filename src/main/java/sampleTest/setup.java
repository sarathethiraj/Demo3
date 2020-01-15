package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class setup {
	WebDriver dr ;
  
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://www.leafground.com/");
		
	}


}
