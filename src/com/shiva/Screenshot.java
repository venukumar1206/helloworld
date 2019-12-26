package com.shiva;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;



public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shiva@123\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\1.png"));
		FileInputStream f=new FileInputStream("D:\\Manual Project Tracker _Functional Team 10.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet("Schedule");
		int r=s.getRows();
		int c=s.getColumns();
				System.out.println(r);
		System.out.println(c);
		
		

	}

}
