import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Loop 
{

	public static void main(String[] args) 
	{
		/*System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");*/
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		driver.findElement(By.xpath(".//*[@id='main-nav-new']/a")).click();
		
		Thread.sleep(5000);
	
		
		for(int a = 1; a <driver.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();a++)
		{
			
		}
		
		

	}

}
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Loop 
{
	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bluefly.com");	
		
		//Click all product from New Arrival page
		/*driver.findElement(By.xpath(".//*[@id='main-nav-new']/a")).click();		
		Thread.sleep(5000);		
		int newArrivalProductSize = driver.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(newArrivalProductSize);			
		for(int a = 1; a < newArrivalProductSize; a++)
		{
			driver.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}*/
		
		
		//Click all products from Women page
		driver.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();	
		Thread.sleep(5000);		
		int womenProductSize = driver.findElements(By.xpath("//div[@class='lp-featured-slot']//ul/li")).size();
		System.out.println(womenProductSize);			
		for(int a = 1; a < womenProductSize; a++)
		{
			driver.findElement(By.xpath("//div[@class='lp-featured-slot']//ul/li["+a+"]/a")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}

	}

}


