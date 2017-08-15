package selenium.bornali;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/samarth/Desktop/Selenium/chromedriver");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open facebook
		driver.get("http://www.facebook.com");
		
		// Maximize browser
		driver.manage().window().maximize();

	}

}
