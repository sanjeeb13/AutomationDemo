package learingAutomation;

import org.testng.Assert;

//import org.testng.annotations.Test;
//
//public class LunchGmail {
//
//    @Test
//    public void testRun() {
//        System.out.println("=== TEST OUTPUT ===");
//    } 
//}

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchGmail {
 private String actualTitle;
    @Test
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        
		if (!actualTitle.contains("Toogle")) {
            Assert.fail("Title does not match");
        }
//        driver.quit();
//        System.out.println("successfully completed");
    }
}







