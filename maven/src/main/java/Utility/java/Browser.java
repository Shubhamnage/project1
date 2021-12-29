package Utility.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigrationClass.cp;

public class Browser {
	
	public WebDriver browseer() {
		
		System.setProperty("webdriver.chrome.driver",cp.driverpath);
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get(cp.FBsignup);
		
		return w;
	}
  
	
	
}
