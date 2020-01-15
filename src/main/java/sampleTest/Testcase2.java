package sampleTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase2 extends setup {
	@Test
	public void buttonbtn() {

		dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a")).click();
		System.out.println("Testcase2 passed");

	}

}
