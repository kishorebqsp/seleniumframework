package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generlib.Basepage;
import generlib.Propertyfile;
import generlib.Utilies;
import pom.Dresspage;
import pom.HomePage;
import pom.Loginpage;

public class Selectingcolor extends Basepage{
	@Test
	public void selectingcart() throws InterruptedException
	{
		Loginpage l=new Loginpage(driver);
		l.newsettler(Propertyfile.getfiledata(propertyfilepath,"username"));
		l.sumbitbtn();
		
		HomePage h=new HomePage(driver);
		h.serachtxtfield(Propertyfile.getfiledata(propertyfilepath,"productname"));
		h.serachbutton();
		
		Dresspage d=new Dresspage(driver);
		WebElement ele = d.dropdown();
		Thread.sleep(3000);
		Utilies.dropdown(ele,"Price: Highest first");
		
		d.dressss();
		Thread.sleep(3000);
		
		for(int i=0;i<=3;i++)
		{
		d.addbtn();
		}

		Thread.sleep(3000);
		WebElement sizee = d.sizechart();
		Thread.sleep(3000);
		Utilies.dropdown(sizee,"L");
		Thread.sleep(3000);
		d.clordress();
		Thread.sleep(3000);
		d.proceedtocheckout();
	}
}
