package com.generic.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DriverManager {



	public WebDriver getBrower() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cnn.com/business");
		System.out.println("CNN home page Title :" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("CNN Business"), "Found CNN Business home page");

		//return driver ==> method will be java return type method
		
		return driver;
	}

}
