package cucumberFeature1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefination 
{
	@Given("^user able to open the Browser$")
	public void user_able_to_open_the_Browser() throws Throwable 
	{
		System.out.println("user able to open the Browser$");	
	}

	@Given("^user able to enter the URL$")
	public void user_able_to_enter_the_URL() throws Throwable
	{
		System.out.println("^user able to enter the URL$");	
	}

	@Given("^user able to enter the username$")
	public void user_able_to_enter_the_username() throws Throwable 
	{
		System.out.println("^user able to enter the username$");
	}

	@Given("^user able to enter the password$")
	public void user_able_to_enter_the_password() throws Throwable 
	{
		System.out.println("^user able to enter the password$");
	}

	@Then("^user able to click on the login$")
	public void user_able_to_click_on_the_login() throws Throwable
	{
		System.out.println("^user able to click on the login$");
	}

	@Then("^user able to login sucessfully$")
	public void user_able_to_login_sucessfully() throws Throwable 
	{
		System.out.println("^user able to login sucessfully$");
	}



}
