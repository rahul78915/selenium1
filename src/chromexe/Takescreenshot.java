package chromexe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Desktop\\Manual &Selenium\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	 
		driver.get("http://www.google.com");
		driver.navigate().refresh();
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:/Sw@T!/Workk/Java_Examples/selenium/src/chromexe/google.png");
		FileUtils.copyFile(srcFile, destFile);
	
	}

}
