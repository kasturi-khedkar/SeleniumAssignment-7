import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
		
	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Selenium New Jar Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Dimension d1=driver.manage().window().getSize();			// getting Original Size
		System.out.println("Before Setting Size : "+d1);
		driver.manage().window().setSize(new Dimension(200,500));	// Setting different size
		Dimension d2=driver.manage().window().getSize();
		System.out.println("After Setting Size : "+d2);				// Values after getting Size
		System.out.println("Successful Result");
		
	}

}
