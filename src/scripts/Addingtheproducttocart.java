package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generlib.Basepage;
import generlib.Propertyfile;
import generlib.Utilies;

import pom.Dresspage;
import pom.HomePage;
import pom.Loginpage;

public class Addingtheproducttocart extends Basepage {
	@Test
	public void addingtocart() throws InterruptedException
	{
		Loginpage l=new Loginpage(driver);
		l.newsettler(Propertyfile.getfiledata(propertyfilepath,"username"));
		l.sumbitbtn();
		String t = driver.getTitle();
		Assert.assertEquals("My Store",t);
		
		HomePage h=new HomePage(driver);
		h.serachtxtfield(Propertyfile.getfiledata(propertyfilepath,"productname"));
		h.serachbutton();
		
		Dresspage d=new Dresspage(driver);
		WebElement ele = d.dropdown();
		Thread.sleep(3000);
		Utilies.dropdown(ele,"Price: Highest first");
		// Utilies.mousehover(driver,d.dressss());
		d.dressss();
		Thread.sleep(3000);
		d.addingtocart();
		Thread.sleep(3000);
		d.proceedtocheckout();
		
		
	}

}
