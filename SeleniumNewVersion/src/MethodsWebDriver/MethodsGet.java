package MethodsWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver=new WebDriver here we cant write like new WebDriver because it is interface
		WebDriver driver=new ChromeDriver();
		//get
		driver.get("https://adactinhotelapp.com");
		driver.close();
		

	}

}
