package myFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import handsOn.Start;
import handsOn.WebElements;

public class Mail implements WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Automation\\Assets\\Chrome driver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		Mail objStart = new Mail();
//		driver.get("https://" + objStart.strURL);
//		driver.findElement(By.xpath(strGmail)).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(strSign)).click();
		String strArrVal[] = objStart.strArrCheck;
		for (String elt : strArrVal) {
			System.out.println(elt);
		}
		for (int i = 1; i < strArrVal.length; i=i+2) {
			System.out.println(strArrVal[i]);
		}
		}
	}

