package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void takingScreenshot(WebDriver driver, String screenshotname) throws IOException {
	
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./Screenshot/" +screenshotname+".png"));
	//FileUtils.copyFile(src, new File("/Users/sanjeebkumar/Desktop/automation/ss.png"));
	}

	

}
