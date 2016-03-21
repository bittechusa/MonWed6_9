package com.bit.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IInvokedMethod;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	
	//git clone https://github.com/bittechusa/WinnerBatch.git
	
	
	FirefoxDriver dr;
	Logger log=Logger.getLogger(BaseTest.class);
	@BeforeMethod
	public void start() throws IOException
	{
		DOMConfigurator.configure("log4j.xml");
		FileInputStream fis=new FileInputStream("config.properties");
		log.info("file initialized");
		log.trace("trace");
		//System.out.println("file initialized");
		Properties p=new Properties();
		p.load(fis);
		dr=new FirefoxDriver();
		dr.get(p.getProperty("url"));
		log.info("url initialized");
		System.out.println();
	}
	public void screenShot() throws IOException
	{
		 File sf=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(sf, new File("/Users/bittech/Desktop/shot"+Math.random()*1000+".png"),true);
	}
	@AfterMethod
	public void end(ITestResult test) throws IOException
	{
		if(test.getStatus()==test.FAILURE)
		{
			log.info("Test Method resides in " + test.getTestClass().getName()+" ,"+test.getMethod());
			screenShot();
		}
		
		dr.quit();
		log.info("browser quit");
	}

}
