package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	@FindBy(id="selectProductSort")
	private WebElement drop;
	
	
	@FindBy(xpath="//img[@title='Printed Summer Dress']")
	private WebElement dress;
	
	
	@FindBy(xpath="(//span[.='Add to cart'])[1]")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement add;
	
	@FindBy(id="group_1")
	private WebElement dd;
	
	@FindBy(name="Black")
	private WebElement color;
	
	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement dropdown()
	{
		return drop;
	}
	
	public void dressss()
	{
		dress.click();
	}
  	
	public void addingtocart()
	{
		cart.click();
	}
	
	public void proceedtocheckout()
	{
		proceed.click();

}
	
	public void addbtn()
	{
		add.click();
	}
	
	public WebElement sizechart() {
		return dd;
		}
	
	public void clordress()
	{
		color.click();
	}
	

}
