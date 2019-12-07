package generlib;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
	public static String getfiledata(String path,String key)
	{
		String s="";
		try {
		Properties p=new Properties();
		 p.load(new FileInputStream(path));
		 s = p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return s;
	}

}
