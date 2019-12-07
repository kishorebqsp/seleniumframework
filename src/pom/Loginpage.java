package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="newsletter-input")
	private WebElement newset;
	
	
	@FindBy(name="submitNewsletter")
	private WebElement submit;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void newsettler(String us)
	{
		newset.sendKeys(us);
	}
	
	public void sumbitbtn()
	{
		submit.click();
	}

}
