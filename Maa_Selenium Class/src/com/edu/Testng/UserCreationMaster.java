package com.edu.Testng;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserCreationMaster {
	
	
	@Test(priority=1,dependsOnMethods="ModifyUser")
	public void createUser()
	{
		Reporter.log("User Created Sucessfully",true);
		
	}
	
   @Test(priority=2)
	public void ModifyUser()
	{
	   Reporter.log("User Modified Successfully",true);
	   Assert.fail();
}
   
   @Test(priority=3)
   
   public void DeleteUser()
   {
	   Reporter.log("User Deleted Succesfully",true);
	   
   }
   
   
   
}

