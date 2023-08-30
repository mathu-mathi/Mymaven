package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.FileConsatant;


public class FileUtils
{
	public static String readPropertiesFile(String path,String key) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		Properties p=new Properties();
		p.load(fr);
		p.load(fr);
		return p.getProperty(key);
		
		
	}
	public static String readUserMenuTestData(String key) throws IOException
	{
		File f=new File(FileConsatant.USER_MENU_TESTDATA_FILE_PATH);
		FileReader fr=new FileReader(f);
		Properties p=new Properties();
		p.load(fr);
		p.load(fr);
		return p.getProperty(key);
		

}
	
	}
