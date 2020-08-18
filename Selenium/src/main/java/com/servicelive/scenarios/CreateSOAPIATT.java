package com.servicelive.scenarios;

import java.io.File;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.servicelive.logger.LoggerClass;

public class CreateSOAPIATT {

	public static FirefoxProfile profile=null;
	public static LoggerClass loggerClass;
	
	public static String createATTSO(Properties properties) {
		
		loggerClass=new LoggerClass();
		String result = "";
		
		//home page
		File pathToBinary = new File(properties.getProperty("ffLocation"));
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver webDriver = new FirefoxDriver(ffBinary,firefoxProfile); 
		try{
			WebDriverWait wait = new WebDriverWait(webDriver, 100);
			
			//Date date=new Date(year, month, date, hrs, min, sec)
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date dateNow = new Date();
	
			loggerClass.debugTracker("                                    ");
			loggerClass.debugTracker("CreateSOAPIATT.java");
			
			//home page
			webDriver.get(properties.getProperty("pageUrl"));
			loggerClass.debugTracker("Home Page loaded");
			
			String serverUrl = properties.getProperty("attUrl");
			String key = properties.getProperty("attKey");
			String secret = properties.getProperty("attSecret");
			String oldRequest = properties.getProperty("attRequest");
			//Give unique name for title
			String custRefString = oldRequest.substring(oldRequest.indexOf("<customRef>"), oldRequest.indexOf("</value>"));
			//loggerClass.debugTracker("title>"+title);
			
			String custRef = custRefString.substring(custRefString.indexOf("<name>"), custRefString.indexOf("</name>"));
			
			String refname = custRef.substring(custRef.indexOf(">")+1);
			loggerClass.debugTracker("custRefName"+refname);
			SecureRandom random = new SecureRandom();
			String custRefVal=new BigInteger(25, random).toString(10);
			loggerClass.debugTracker("custRefVal"+custRefVal);
			
			String refVal = custRefString.substring(custRefString.indexOf("<value>"));;
			String refVal1 = "<value>"+custRefVal;
			String custRefStringNew = custRefString.replace(refVal, refVal1);
			String request = oldRequest.replace(custRefString, custRefStringNew);
			
			String req1  = request.substring(0, request.indexOf("<scopeOfWork>"));
			String req2  = request.substring(request.indexOf("<scopeOfWork>"), request.indexOf("<contacts>"));
			String req3  = request.substring(request.indexOf("<contacts>"));
			
			new Select(webDriver.findElement(By.name("rType"))).selectByVisibleText("POST");
			webDriver.findElement(By.name("server")).clear();
			webDriver.findElement(By.name("server")).sendKeys(serverUrl);
			webDriver.findElement(By.id("key")).clear();
			webDriver.findElement(By.id("key")).sendKeys(key);
			webDriver.findElement(By.id("pass")).clear();
			webDriver.findElement(By.id("pass")).sendKeys(secret);
			webDriver.findElement(By.name("params")).clear();
			webDriver.findElement(By.name("params")).sendKeys(req1);
			webDriver.findElement(By.name("params")).sendKeys(req2);
			webDriver.findElement(By.name("params")).sendKeys(req3);
			webDriver.findElement(By.name("button")).click();
			
			Thread.sleep(2000);
			
			//home page
			webDriver.get(properties.getProperty("HomeUrl"));
			loggerClass.debugTracker("Home Page loaded");

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='topNav']/div[3]/a/img")));
			WebElement logInButton=webDriver.findElement(By.xpath("//*[@id='topNav']/div[3]/a/img"));
			logInButton.click();
			
			//login page
			loggerClass.debugTracker("Buyer Login");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='username']")));
			WebElement userNameTextBox=webDriver.findElement(By.xpath("//*[@id='username']"));
			userNameTextBox.clear();			
			userNameTextBox.sendKeys("athakkar");			
			WebElement passwordTextBox=webDriver.findElement(By.xpath("//*[@id='password']"));
			passwordTextBox.clear();
			passwordTextBox.sendKeys(properties.getProperty("password"));
			WebElement submitButton=webDriver.findElement(By.xpath("//*[@id='submit']"));
			submitButton.click();
			
			//dashboard
			webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			loggerClass.debugTracker("dashboard page loaded");
			
			//clicking on service order monitor page
			webDriver.findElement(By.xpath("//*[@id='serviceOrderMonitor']")).click();
			loggerClass.debugTracker("service order monitor link clicked");
			
			Thread.sleep(1000);
			webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			//waiting for search title to load
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='page']/div[4]/div/div[7]/div/span")));

			webDriver.findElement(By.xpath("//div[@id='page']/div[4]/div/div[7]/div/span")).click();

			loggerClass.debugTracker("search tab clicked");
			Thread.sleep(20000);
			//searching
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchType")));
			Thread.sleep(8000);
			webDriver.findElement(By.id("searchType")).click();
			Thread.sleep(1000);
			/*String visibleText = "Ref: "+refname;
			System.out.println(visibleText);
			System.out.println("Ref: CAT_APPT_ID");*/
			new Select(webDriver.findElement(By.id("searchType"))).selectByVisibleText("Ref: CAT_APPT_ID");
		
			webDriver.findElement(By.id("searchValue")).click();
			webDriver.findElement(By.id("searchValue")).clear();
			webDriver.findElement(By.id("searchValue")).sendKeys(custRefVal);
			Thread.sleep(3000);
			webDriver.findElement(By.xpath("//div[@id='searchTerms']/table/tbody/tr/td[3]/input")).click();
			Thread.sleep(3000);
			webDriver.findElement(By.xpath("//div[@id='searchTerms']/table/tbody/tr/td[4]/input")).click();
			Thread.sleep(5000);
			loggerClass.debugTracker("search complete");
			Thread.sleep(8000);
			
			webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@id='SearchmyIframe']")));
			Boolean isPresent = webDriver.findElements(By.xpath("//*[@id='searchCount']")).size()>0;
			if(isPresent){
				WebElement e = webDriver.findElement(By.xpath("/html/body/div/ul/li/span/table/tbody/tr/td[3]"));
				String soId = e.getText();
				loggerClass.debugTracker("SOID>> "+soId);
				loggerClass.debugTracker("SO created successfully");
				result = "SO created successfully>>"+soId;
			}else{
				loggerClass.debugTracker("SO creation failed");
				result = "SO creation failed";
			}
		}catch(Exception e){
			e.printStackTrace();
			loggerClass.debugTracker("Some error occured - SO creation unsuccessful. Error is >>"+e);
			result = "Some Error occured - SO creation unsuccessful. Error is >>"+e;
		}
		
		finally{
			webDriver.close();
		}
		return result;
}
	
	private static String checkIfSelected(List<WebElement> list){
		for(WebElement lst :list){
			loggerClass.debugTracker("lst.getTagName()>>"+lst.getTagName());
			loggerClass.debugTracker("lst.isSelected()>>"+lst.isSelected());
			loggerClass.debugTracker("lst.getText() "+lst.getText());
			loggerClass.debugTracker("st.getSize() "+lst.getSize());

			if(lst.isSelected()){
				return lst.getText();
			}
		}
		return null;
	}
	
}
