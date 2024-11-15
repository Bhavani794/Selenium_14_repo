package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		Point position=driver.manage().window().getPosition();
		System.out.println("x:-" + position.getX());
		System.out.println("y:-" + position.getY());
		

	}

}
