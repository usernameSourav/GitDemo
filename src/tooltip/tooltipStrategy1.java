package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tooltipStrategy1 {
	
	@Test
	public void tooltipData() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Selenium jars\\driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/tooltip/");
		System.out.println("git hub repository");
		System.out.println("may work may not");
		driver.manage().window().maximize();
		WebElement target=driver.findElement(By.id("age"));
		String tooltipText=target.getAttribute("title");
		System.out.println("checking for branch");
		System.out.println("Retrieved tooltip test as: " +tooltipText);
		Assert.assertEquals("We ask for your age only for statistical purposes", tooltipText);
		driver.quit();
	}

}
