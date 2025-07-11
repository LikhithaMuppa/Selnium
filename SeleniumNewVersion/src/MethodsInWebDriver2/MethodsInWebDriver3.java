package MethodsInWebDriver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://adactinhotelapp.com");
        System.out.println(driver.getCurrentUrl());
        //to getWindowHandle() it will print values in console out as hexadecimals
        System.out.println(driver.getWindowHandle());
        driver.quit();
	}

}
