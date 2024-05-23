package org.sin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	public static void windowMaximize() {
		driver.manage().window().maximize();
		
	}
	public static void launchurl(String Url) {
		driver.get(Url);
		
	}
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

}
	public static void passText(String txt , WebElement ele) {
		ele.sendKeys(txt);
}
	public static void closeEntireBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
		
	}


}
