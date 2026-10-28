package learingAutomation;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utility;

import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.Assert;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchGmail {
	private String actualTitle;
	WebDriver driver;
    @BeforeTest
    public void openGoogle() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
       System.out.println(driver.getTitle());
        driver.quit();
        
    }  
        @Test
    public void verifytitle() {

//       String expectedTitle="Togle";
//       String actualTitle= driver.getTitle();
//       
//      Assert.assertEquals(actualTitle, expectedTitle);
     
        
//		if (!actualTitle.contains("Toogle")) {
//            AssertJUnit.fail("Title does not match");
//        }
    }

//        System.out.println("successfully completed");
        
        @AfterMethod
        public void takeScreenshot(ITestResult result) throws IOException
        {
        	if(ITestResult.FAILURE==result.getStatus())
        	{
        		Utility.takingScreenshot(driver, result.getName());
        		//Utility.takingScreenshot(driver, null);
        		
        	}
        }
        
    }








