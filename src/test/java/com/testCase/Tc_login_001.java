package com.testCase;

import org.junit.Assert;
import org.testng.annotations.Test;

 
import com.pageObject.Loginpage;


public class Tc_login_001 extends Baseclass { 
	@Test
public void loginTest() {
		driver.get(url);
		Loginpage lp= new Loginpage(driver);
		lp.setUsername(userName);
		lp.setpassword(password);
		lp.clicksubmit();
		
	
		if(driver.getTitle().equals("Rai-Kpsr-Bams" )) {
		Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	
}
	
}
