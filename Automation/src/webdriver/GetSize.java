package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.agoda.com/en-in/");
		
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		     int height = size.getHeight();
		     int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
	}

}