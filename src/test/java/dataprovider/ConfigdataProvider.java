package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigdataProvider 
{
	Properties prop;
	
	public ConfigdataProvider() throws IOException
	{
		File file = new File("./Configuration/config.property");
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			/*// TODO Auto-generated catch block
			e.printStackTrace();*/
			System.out.println("File is not found. Error is: "+e.getMessage());
		}
	}
	
	public String getURl()
	{
		String url = prop.getProperty("URL");
		return url;
	}
	
	public String getDRiver()
	{
		String driver = prop.getProperty("ChromeDriver");
		return driver;
	}

}
