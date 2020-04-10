package cucumberRunner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{

	/*@Before("@RegTest")
	public void beforeRegTest()
	{
		System.out.println("Before Regression Test");
	}
	
	@Before("@smokeTest")
	public void beforeSmokeTest()
	{
		System.out.println("Before Smoke Test");
	}
	
	@After("@RegTest")
	public void afterRegTest()
	{
		System.out.println("After Regression Test");
	}
	
	@After("@smokeTest")
	public void afterSmokeTest()
	{
		System.out.println("After Smoke Test");
	}*/
	
	
	@Before
	public void beforeRegTest()
	{
		System.out.println("Before Secnario Test");
	}
	
	@After
	public void afterRegTest()
	{
		System.out.println("After Secnario Test");
	}
	
	
}
