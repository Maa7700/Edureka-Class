package com.edu.Testng;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateUserTask extends MaaaTestnDemo 
{
	

	@Test(dependsOnMethods="DeleteTask")
	public void ModifyTask()
	{
	   Reporter.log("User Modified Task",true);
}

	@Test(invocationCount=5)
	public void DeleteTask()
	{
		Reporter.log("User Deleted Task",true);
		//Assert.fail();
		
	}
}
