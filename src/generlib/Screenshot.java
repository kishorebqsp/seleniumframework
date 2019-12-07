package generlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Screenshot {
	public static String getsceenshot(WebDriver driver,String path)
	
	{
	String s="";
	Date d=new Date();
	String sd=d.toString();
	String date=s.replaceAll(":","-");
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest=new File(path+date+".png");
	try {
	FileUtils.copyFile(src, dest);
	}
	catch(Exception e)
	{
		Reporter.log("Testcase failed take photo");
	}
	return s;
	}

}
