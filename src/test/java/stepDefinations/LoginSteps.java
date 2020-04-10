package stepDefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{	
	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    System.out.println("Opened the browser");
	}

	@When("^Maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	    System.out.println("Maximised the browser");
	}

	@Then("^Enter the URL$")
	public void enter_the_URL() throws Throwable {
	    System.out.println("Enterd the URl");
	}

	@Given("^Navigate to login page$")
	public void Navigate_to_login_page()
	{
		System.out.println("User Navigated to login Page");
	}
	
	@When("^user provide valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_provide_valid_username_and_password(String un, String pw) 
	{
	    System.out.println("user logged in and userName is :"+un+"  password is :"+pw);
	}

	@When("click on login btn")
	public void click_on_login_btn() {
		System.out.println("clicked on login btn");
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		System.out.println("Homepage is displayed");
	}

	@And("^verfiy Title$")
	public void verfiy_Title() {
		System.out.println("Verifyed title");
	}
	
	@When("^user provide when user provide followinf information$")
	public void user_provide_when_user_provide_followinf_information(DataTable data) throws Throwable
	{
		List<List<String>> values = data.raw();
		System.out.println(values.get(0).get(0));
		System.out.println(values.get(0).get(1));
		System.out.println(values.get(0).get(2));
		System.out.println(values.get(0).get(3));
	   
	}
	
	@When("^user provide valid username (.+) and password (.+) of diffrent user$")
	public void user_provide_valid_username_name_and_password_password_of_diffrent_user(String un ,String pw) throws Throwable {
	 System.out.println("UN is : "+un);
	 System.out.println("PW is : "+pw);
	}

	@When("^Homepage should be displayed (.+) and status is$")
	public void Homepage_should_displayed_status_is(String text)
	{
		System.out.println("Status is "+text);
	}

}
