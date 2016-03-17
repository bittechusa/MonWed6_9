package com.bit.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest
{
	WebDriver dr;
	
	@Before
	public void start() throws IOException
	{
		String s = System.getProperty("ami");
		if(s.equals("FireBug"))
		{
			System.out.println("hi");
			dr = new FirefoxDriver();
			FileInputStream f=new FileInputStream("config.properties");
			Properties p=new Properties();
			p.load(f);
			dr.get(p.getProperty("url"));
		}
		else if(s.equals("Chrom"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/bittech/Desktop/jar/chromedriver");
			dr=new ChromeDriver(); 
			FileInputStream f=new FileInputStream("config.properties");
			Properties p=new Properties();
			p.load(f);
		}
		else if(s.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "/Users/bittech/Desktop/jar/IEDriverServer");
			dr=new InternetExplorerDriver();
			FileInputStream f=new FileInputStream("config.properties");
			Properties p=new Properties();
			p.load(f);
		}
		else
		{
			dr= new FirefoxDriver();
		}
		
		
	/*	FileInputStream f=new FileInputStream("config.properties");
		Properties p=new Properties();
		p.load(f);
		System.setProperty("webdriver.chrome.driver","/Users/bittech/Desktop/jar/chromedriver");
		dr=new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "/Users/bittech/Desktop/jar/IEDriverServer");
		//dr=new InternetExplorerDriver();
		//dr=new FirefoxDriver();
		dr.get(p.getProperty("url"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	}
	@After
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
