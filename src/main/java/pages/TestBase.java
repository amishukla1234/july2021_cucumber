  package pages;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestBase {
	public static WebDriver driver;
	   
	   public static void initDriver() {
		   System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
	   }
	
	   public static void takescreenshot(WebDriver driver) throws IOException {
		   TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourcefile =  ts.getScreenshotAs(OutputType.FILE);
		   String currentDirectory = System.getProperty("user.dir");
		   SimpleDateFormat formatter = new SimpleDateFormat("MMDDYY_HHmmss");
		   Date date = new Date();
		   String label = formatter.format(date);
		   
		   FileUtils.copyDirectory(sourcefile, new File (currentDirectory + "/screenshot/" +label + ".png"));
	   }
	  
	   
	  }
