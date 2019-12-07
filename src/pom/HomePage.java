package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="search_query_top")
	private WebElement serach;
	
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serachtxtfield(String product)
	{
		serach.sendKeys(product);
	}
	
	public void serachbutton()
	{
		serachbtn.click();
	}

}
	


