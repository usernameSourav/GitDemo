package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tooltipStrategy2 {
	
	@Test
	public void tooltipData() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Selenium jars\\driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		
		WebElement target=driver.findElement(By.id("tooltipDemo"));
		
		actions.moveToElement(target).perform();
		
		WebElement tooltip=driver.findElement(By.cssSelector(".tooltiptext"));
		String msg=tooltip.getText();
		System.out.println(msg);
		
		/*String tooltipText=target.getAttribute("title");
		System.out.println("Retrieved tooltip test as: " +tooltipText);
		Assert.assertEquals("We ask for your age only for statistical purposes", tooltipText);
		*/driver.quit();
	}

}
