package Login;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch1 {
	public static void main(String[] args) {
    //1st method System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();//2nd method
		new ChromeDriver();
	
}
}
