package com.shiva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtProgram 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Shiva@123\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
	}

}
