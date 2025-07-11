package Login;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		new EdgeDriver();
		
	}

}
