package apr25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		//to Launch the application we will use get()
		driver.get("https://adactinhotelapp.com");
		//to maximize the window
		driver.manage().window().maximize();
		//to focus on particular one like user name in hotel app
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		//to focus on particular one like password in hotel app
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		//to focus on particular one like login in hotel app
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(20000);
	    //to clear the present date value
		driver.findElement(By.id("datepick_in")).clear();
        
		// to focus on the date value &update that
		driver.findElement(By.id("datepick_in")).sendKeys("27/04/2024");
		//to wait application for 3ms before close the application
		Thread.sleep(10000);
		
		//to close the browser
		driver.quit();

	}

}
