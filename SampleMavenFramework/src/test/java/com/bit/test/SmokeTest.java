package com.bit.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest
{
	
	//git clone https://github.com/bittechusa/WinnerBatch.git
	
		
		Logger log=Logger.getLogger(SmokeTest.class);
	@Test
	public void test1()
	{
		log.info("test1 started");
		dr.findElement(By.xpath("gjg")).click();
	}
	@Test
	public void test2()
	{
		
	}

}
