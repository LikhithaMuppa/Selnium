package apr25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
      driver.findElement(By.id("login")).click();
      //for get location method
      System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		//for get size()
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		//for get rect()
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		
		
		
		
		driver.quit();
	}

}
