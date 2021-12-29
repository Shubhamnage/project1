package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	@FindBy(xpath = "//input[@type='text']")public WebElement Uname;
	@FindBy(xpath = "(//span[@class='su-message'])[1]")public WebElement UIerror;
	@FindBy(xpath = "//input[@type='password']")private WebElement password;
	@FindBy(xpath = "(//span[@class='su-message'])[2]")private WebElement PSerror;
	@FindBy(xpath = "//button[@type='submit']")private WebElement login;
	

	
	 public Pom1(WebDriver d){
		PageFactory.initElements(d,this);
	}
	
    public void Uname() {
    	Uname.sendKeys("SNage");
    }
    public void password() {
    	password.sendKeys("9403319711");
    }
    public void login() {
    	login.click();
    }
    
    public String UIerror() {
    	String act=UIerror.getText();
		return act;
    }
    
    public String PSerro() {
    	String actText=PSerror.getText();
		return actText;
    	
    }
    
    
}
