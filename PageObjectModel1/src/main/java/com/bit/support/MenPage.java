package com.bit.support;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import junit.framework.Assert;

public class MenPage extends LoadableComponent<MenPage>
{
	FirefoxDriver dr;
	public MenPage(FirefoxDriver x)
	{
		dr=x;
		//PageFactory.initElements(dr, this);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		System.out.println("load");
		dr.get("https://www.eshopper24.com/men");
	}


	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("https://www.eshopper24.com/men"));
		System.out.println("assert");
		
	}
	

}
