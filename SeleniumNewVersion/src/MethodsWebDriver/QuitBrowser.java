package MethodsWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowser {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com");
	driver.quit();
}
}
