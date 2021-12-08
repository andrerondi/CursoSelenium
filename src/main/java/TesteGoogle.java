import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
	}

}
