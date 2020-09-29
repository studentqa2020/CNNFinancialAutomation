package com.functional.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.library.DriverManager;
import com.generic.library.ModulesValidation;
import com.generic.library.TitleOfPages;

public class TestExecution {

	WebDriver driver;

	@BeforeTest
	public void test1() {

		driver = new DriverManager().getBrower();

	}

	@Test
	public void test2() {

		new ModulesValidation().getModules(driver);

	}
	
	
	
	
	
	
	
	

	// why this driver got null??

	/*
	 * @Test public void test4() throws InterruptedException {
	 * 
	 * // code System.out.println("Test 4 started"); TitleOfPages.getTitle(driver);
	 * }
	 * 
	 * @Test public void test05() {
	 * 
	 * // code }
	 */
}
