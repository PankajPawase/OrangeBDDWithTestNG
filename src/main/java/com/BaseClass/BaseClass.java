package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\Eclips Neon 3 workspace\\OrangeBDDWithTestNG\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("ImplicitWait"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("explicitWait"))));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
	}

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh\\Eclips Neon 3 workspace\\OrangeBDDWithTestNG\\src\\main\\java\\com\\Config\\Browserdata.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
