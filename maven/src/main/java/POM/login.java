package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.java.Selectbox;

public class login {

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement F;
	@FindBy(xpath = "(//input[@name='lastname'])[1]")
	private WebElement S;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement M;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement pass;
	@FindBy(xpath = "(//select[@id='day'])[1]")
	private WebElement day;
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;
	@FindBy(xpath = "(//label[@class='_58mt'])[2]")
	private WebElement male;

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void name() {
		F.sendKeys("shubham");
	}

	public void Sirname() {
		S.sendKeys("nage");
	}

	public void mobailno() {
		M.sendKeys("9403319711");
	}

	public void password() {
		pass.sendKeys("shubhamnage");
	}

	public void select() {
		Selectbox sb = new Selectbox();
		sb.selectbox(day, "10");
		sb.selectbox(month, "Jan");
		sb.selectbox(year, "2010");
	}

	public void male() {
		male.click();
	}
	

}
