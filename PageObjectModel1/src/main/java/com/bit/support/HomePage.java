package com.bit.support;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	FirefoxDriver dr;
	@FindBy(how=How.XPATH ,using="html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a/b")
	public WebElement menLink;
	@FindBy(how=How.XPATH ,using="html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")
	public WebElement womenLink;
	
	public HomePage(FirefoxDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public MenPage clickMenLink()
	{
		//WebElement ele=dr.findElement(By.xpath("//a[@href='/men']"));
		menLink.click();
		return new MenPage(dr);
	}

	public void shahidul()
	{
		System.out.println("shahidul");
	}

	public void abdul()
	{
		System.out.println("abdul");

	}

}
