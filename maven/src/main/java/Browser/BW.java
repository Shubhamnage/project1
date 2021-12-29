package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigrationClass.cp;

public class BW {
	
	public WebDriver Browser() {
		
		System.setProperty("webdriver.chrome.driver",cp.driverpath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get(cp.zeroda);
		
		return d;
	}

}
