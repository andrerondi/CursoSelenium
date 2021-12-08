import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().setPosition(new Point(100, 100)); //Posição do Navegador
//		driver.manage().window().setSize(new Dimension(1200, 765)); // Dimensionamento Navegador
//		driver.manage().window().maximize(); // Maximizado
		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}

}
