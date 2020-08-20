package handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start implements WebElements{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Assets\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Start objStart = new Start();
		
		driver.get("https://" + objStart.strURL);
		

	}

}
