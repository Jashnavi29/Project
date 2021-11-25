package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;
     public static WebDriver launchBrowser(String browser) {
    	 switch(browser) {
    	 case "Chrome":
    		 WebDriverManager.chromedriver().setup();
    		 driver=new ChromeDriver();
    		 break;
    	 case "Firefox":
    		 WebDriverManager.firefoxdriver().setup();
    		 driver=new FirefoxDriver();
    		 break;
    	 case "Edge":
    		 WebDriverManager.edgedriver().setup();
    		 driver=new EdgeDriver();
    		 break;
    	 }
		return driver;
     }	
	public static void launchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
     }
	public static void implicitiWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	 }
	public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void switchTo(int index) {
		Set<String> allId = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(allId);
		driver.switchTo().window(li.get(index));
		}
	public static void quitBrowser() {
		driver.quit();
		}
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		}	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
		}
	public static void selectByvalue(WebElement e,String value) {
		Select s= new Select(e);
         s.selectByValue(value);
	}
	public static WebElement findElement(String locatorName,String value) {
		WebElement e=null;
      if(locatorName.equals("id")) {
    	  e = driver.findElement(By.id(value));
      }
      if(locatorName.equals("name")) {
           e = driver.findElement(By.name(value));
      }
      if(locatorName.equals("xpath")) {
    	   e = driver.findElement(By.xpath(value));
      }
      return e;
       }
	
	

}
