package Demo_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/saravananl/eclipse-workspace/Workspace/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa06.exphosted.com/");
		driver.manage().window().maximize();
	}

}
