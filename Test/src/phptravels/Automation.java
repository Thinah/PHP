package phptravels;
//import java.oi.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class Automation {
	
	private static final TakesScreenshot driver = null;
	public static void main(String[]args) {
		System.setProperty("webriver.chrome.driver", "C:\\Users\\Lulama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        Actions actions = new Actions(driver);

		driver.manage().window().maximize();
		driver.get(" https://phptravels.com/demo/");
	
		//Scroll to the FAQs heading and take a screenshot.
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        //SCREENSHOT
        
		//Hover over “Features” on the navigation and click on the “Newsletter module”.
    	WebElement Newsletter = driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/div/a[7]")); 

        actions.moveToElement(Newsletter).perform();
    	WebElement Newsletter1 = driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/div/a[7]")); 
    	System.out.println("Hover over features");
		driver.get(null);
        driver.findElement(By.id("")).click();//click

		
		driver.findElement(By.id("demouser@travels.com"));
		//Click the “Subscribe” button and take a screenshot.
        driver.findElement(By.xpath("//*[@id=\"email\"]/button")).click();
    	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Click on “Documents” on the navigation, take a screenshot and close the current tab.
        driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click(); 
        ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        driver.close();
        //Click on “Pricing” on the navigation and verify that the heading on the page is “Plans and Prices”.
        driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click(); //click
        //Click the button “BUY NOW” on any (random) of the 4 plans displayed.
        driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/span")).click(); //click on features
        driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/div/a[3]")).click();//click on flights
        driver.findElement(By.xpath("//*[@id=\"UA-container\"]/div/div[4]/div[4]/div[3]/div/div[3]/a")).click();//click on view pricing
		driver.findElement(By.id("4")).click();
		driver.findElement(By.id("order_button")).click();
        ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        


	}
	public static void Takescreenshot(String fileName)
	{
	
	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}

}
