package sampleTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase3 extends setup {
	@Test
	public void linkbtn() {

		dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a")).click();
		//dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a")).click();

	}

}
