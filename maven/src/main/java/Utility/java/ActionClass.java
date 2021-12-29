package Utility.java;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import ConfigrationClass.cp;

public class ActionClass {
	WebDriver w;
	public void ss() throws IOException {

		File d = ((TakesScreenshot) w).getScreenshotAs(OutputType.FILE);
		Date a = new Date();
		String date = a.toString().replace(";", ".");
		File s = new File(cp.SC + "fb" + date + ".png");
		FileHandler.copy(d, s);
	}


}
