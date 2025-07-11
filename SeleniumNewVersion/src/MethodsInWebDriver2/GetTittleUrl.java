package MethodsInWebDriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com");
        //to get after opening the app current page url
        System.out.println(driver.getCurrentUrl());
        //to get all internal code in console
        System.out.println(driver.getPageSource());
        driver.findElement(By.linkText("Forgot Password?")).click();
        Thread.sleep(3000);
        //to get title as a ouptput
        System.out.println(driver.getTitle());
        //to get in app name output
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        
	}

}
