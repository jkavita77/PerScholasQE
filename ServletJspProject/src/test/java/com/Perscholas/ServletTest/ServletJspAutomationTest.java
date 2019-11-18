package com.Perscholas.ServletTest;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServletJspAutomationTest {
	private static WebDriver driver;
	@BeforeClass
	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/ServletJspProject/HomeServlet");
	}
	@AfterClass
	public static void shutDown() {
		driver.close();
	}
	@Test
	public void testHello() {
		WebElement we = driver.findElement(By.cssSelector("h1"));
		String actual = we.getText();
		assertTrue(actual.equals("Hello Per Scholas"));
	}
	
	@Test
	public void testPerSchloasLink() {
		driver.findElement(By.cssSelector("a")).click();
		String actual = driver.getTitle();
		assertTrue(actual.equals("Per Scholas"));
			}
	
	@ Test
	public void SecondParagraphTest(){
		WebElement we = driver.findElement(By.cssSelector("p:nth-child(4)"));
		String actual = we.getText();
		assertTrue(actual.equals("John Doe"));
		
	}
	
	
	
}
