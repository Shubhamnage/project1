package Testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import POM.login;
import Utility.java.ActionClass;

public class TC01 {
	
	WebDriver w;

	@BeforeClass
	public void Browser() {
		Utility.java.Browser b = new Utility.java.Browser();
		w = b.browseer();
	}

	@BeforeMethod
	public void Login() {
		Reporter.log("loging to fb page ", true);
	}

	@Test
	public void login() throws InterruptedException, IOException {

		login a = new login(w);
		Thread.sleep(1000);
		a.name();
		Thread.sleep(1000);
		a.Sirname();
		Thread.sleep(1000);
		a.mobailno();
		Thread.sleep(1000);
		a.password();
		Thread.sleep(1000);
		a.select();
		Thread.sleep(1000);
		a.male();
		Thread.sleep(1000);
		ActionClass u = new ActionClass();
		u.ss();

		Reporter.log("login", true);
	}

	@AfterMethod
	public void Logout(TestResult rec) {

		Reporter.log("logout the fb page", true);
		
	}

	@AfterClass
	public void close() {
		w.quit();
	}
}
