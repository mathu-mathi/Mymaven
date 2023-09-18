package constants;

import utilis.CommonUtils;

public class FileConstants {
	public static final String LOGIN_TESTDATA_FILE_PATH=System.getProperty("user.dir") + "/src/main/resources/testdata/Loginpage(1).xlsx";
	public static final String LOGIN_TESTDATA_FILE_PATH2=System.getProperty("user.dir") + "/src/main/resources/testdata/loginTestData.properties";
	public static final String USER_MENU_PATH=System.getProperty("user.dir") + "/src/main/resources/testdata/usermenu.properties";
	public static final String PROFILE_PHOTO_PATH=System.getProperty("user.dir") + "/src/main/resources/testdata/IMG-1294.jpg";
	public static final String REPORT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtils.getDateAndTimeStamp()+"Mymaven.html";
	public static final String SCREENSHOT_FOLDER_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtils.getDateAndTimeStamp()+"Mymaven.PNG";
	

}
