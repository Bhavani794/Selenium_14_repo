package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
		driver.close();
	}

}
