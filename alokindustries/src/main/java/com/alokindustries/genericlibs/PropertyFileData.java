package com.alokindustries.genericlibs;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileData {
	
	public String getData(String key)
	{
		Properties prop=null;
	
		
		try {
			FileInputStream fin = new FileInputStream(AutoConstants.PROPERTYFILEPATH);
			prop=new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return(prop.getProperty(key));
	}

}
