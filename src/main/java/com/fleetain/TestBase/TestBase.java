package com.fleetain.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.fleetain.utility.TestUtils;
import com.fleetain.utility.WebEventListner;
import com.fleetain.utility.FileUploadCls;


public class TestBase {
	public static final Logger logg = Logger.getLogger(TestBase.class.getName());
	private static final String TestUtil=null;
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver edriver;
	public static WebEventListner eventListener;
	public TestBase() {
		
		String log4jConfPath = "D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\resource\\log4j.properties";     //Configure Log4j Properties File
		PropertyConfigurator.configure(log4jConfPath);
	 
	 try{
		 prop=new Properties();
		 FileInputStream fis=new FileInputStream("D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\java\\com\\fleetain\\Config\\Config.properties");
		 prop.load(fis);
		 
		 
	 }catch(FileNotFoundException e){
		 e.printStackTrace();
	 }catch(IOException i){
		 i.printStackTrace();
	 }
 }
 
     public static void browserOpen(){
	 String browserName=prop.getProperty("browser");
	 if(browserName.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver", "D:\\FleetainWorkSpace\\FleetainProduct\\chromedriver.exe");
		 driver=new ChromeDriver();
		 logg.info("Launching Chrome Broweser ");
	 }
	 else if(browserName.equals("firefox")){
		 System.setProperty("webdriver.gecko.driver", "D:\\FleetainWorkSpace\\FleetainProduct\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 logg.info("Launching FireFox Browser ");
	 }
		
		  edriver=new EventFiringWebDriver(driver); 
		  eventListener= new WebEventListner();             // create a Object of WebEventListnear
		  edriver.register(eventListener);                 // register the Event Listener
		  driver=edriver;                                  //  Assign EventFiringWebDriver to WebDriver(Main Driver)
		 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIME_OUT,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url"));
	 logg.info("Launching The product URL");
 }
 
 
	
	
}
