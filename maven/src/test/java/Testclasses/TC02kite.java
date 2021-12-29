package Testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.BW;
import POM.Pom1;

public class TC02kite {
	
	WebDriver d;

	@BeforeClass
	public void OpenBrowser() {
		BW b = new BW();
		d = b.Browser();

		Reporter.log("open browsr", true);
	}

	@BeforeMethod
	public void beforemethode_refresh() throws InterruptedException {
		d.navigate().refresh();
		Thread.sleep(1000);
	}

	@Test
	public void LoginScenarion1_EnterOnly_Username() throws InterruptedException {
		Pom1 p = new Pom1(d);
		p.Uname();
		Thread.sleep(1000);
		p.login();
		Thread.sleep(1000);
		p.UIerror();

		Reporter.log("----open browser----", true);

	}
	@Test 
	public void LoginScenarion2_EnterOnly_Password() throws InterruptedException{
		Pom1 p = new Pom1(d);
		p.password();
		Thread.sleep(1000);
		p.login();
		
		Reporter.log("-----open browser-------", true);
		
	}

	@Test
	public void LoginScenarion3() throws InterruptedException
	{
		Pom1 p = new Pom1(d);
		p.Uname();
		p.password();
		p.login();
		
		Reporter.log("-----opem browser------", true);
		
		
	}
	@AfterClass
	public void close() {

		Reporter.log("----close browser----", true);
		close();
	

	}

	
	
}
