package com.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/configure" +"/configure.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\testing\\demo\\src\\demo\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}else {
			
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
	 public static String capture(String screenshotName) throws IOException {
		 File source =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	        String dest = System.getProperty("user.dir") + "/ErrorScreenshot/"+ screenshotName + ".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);
	        return dest;
	    }
	
	

	
}
