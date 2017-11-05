package factory;

import java.io.IOException;

import dataprovider.ConfigdataProvider;
import dataprovider.ExceldataProvider;

public class DataProviderFactory 
{
	public static ExceldataProvider getExcel() throws IOException
	{
		ExceldataProvider excel = new ExceldataProvider();
		return excel;
	}
	
	public static ConfigdataProvider getConfig() throws IOException
	{
		ConfigdataProvider config = new ConfigdataProvider();
		return config;
	}

}
