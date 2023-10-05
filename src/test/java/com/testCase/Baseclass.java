package com.testCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass{
	public String url="https://facegenie-ams-school.web.app/";
	public String userName="testbams@gmail.com";
	public String password="facegenie";
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
	

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@AfterClass
	public void quitpage() {
		driver.quit();
	}
	

}
