package generlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basepage implements Autoconstant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(Propertyfile.getfiledata( propertyfilepath,"url"));
	}
	
	@AfterMethod
	public void closeapp(ITestResult r )
	{
		int status = r.getStatus();
		if(status==2)
		{
			Screenshot.getsceenshot(driver,photopath);
		}
		driver.close();
	}

}
