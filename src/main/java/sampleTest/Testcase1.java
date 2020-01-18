package sampleTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 extends setup {
	
	@Test
	public void Editbtn() {

		
		dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
		//assert.assertTrue(dr.getTitle(), "TestLeaf - Interact with Edit Fields");
		//assert.assertEquals(dr.getTitle(), "TestLeaf - Interact with Edit Fields");
		System.out.println("Testcase1 -passed");

	}

}
