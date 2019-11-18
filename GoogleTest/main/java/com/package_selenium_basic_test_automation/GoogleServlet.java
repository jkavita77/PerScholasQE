package com.package_selenium_basic_test_automation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleServlet {
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		/*
		 * The System.setProperty() method accepts two strings as arguments. Be sure
		 * these strings align with the particular WebDriver that you intend to use and
		 * the location of the WebDriver file on your computer. In this example, we are
		 * using the Chrome WebDriver and then providing the path to the location of the
		 * WebDriver file on the device used to create this project. Also note that the
		 * filename must include .exe on Windows computers
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssheb\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("http://localhost:8080/selenium_basic_test");
		driver.get("http://Google.com");
	}

	@AfterClass
	public static void shutDown() {
		driver.close();
	}

	public static void main(String[] args) {
		setUp();
	}
}
