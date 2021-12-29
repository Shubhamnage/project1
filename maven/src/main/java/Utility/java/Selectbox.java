package Utility.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectbox {

	public void selectbox(WebElement string, String text) {

		Select s = new Select(string);
		s.selectByVisibleText(text);
	}

}
