import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	FirefoxDriver dr;
@Given("^i enter facebook$")
public void i_enter_facebook() throws Throwable {
	dr=new FirefoxDriver();
	dr.get("http://www.facebook.com"); 
}


@When("^i enter email \"([^\"]*)\"$")
public void i_enter_email(String arg1) throws Throwable {
	dr.findElement(By.id("email")).sendKeys(arg1); 
}

@When("^i enter pass \"([^\"]*)\"$")
public void i_enter_pass(String arg1) throws Throwable {
	dr.findElement(By.id("pass")).sendKeys(arg1);
}

@When("^i enter firstname$")
public void i_enter_firstname() throws Throwable {
    System.out.println("first name");
}

@When("^i enter lastname$")
public void i_enter_lastname() throws Throwable {
	System.out.println("last name");
}

@Then("^i should see signup page$")
public void i_should_see_signup_page() throws Throwable {
	System.out.println("signup");
}


@Then("^i should see login page$")
public void i_should_see_login_page() throws Throwable {
    System.out.println("verified");
    dr.quit();
}

}
