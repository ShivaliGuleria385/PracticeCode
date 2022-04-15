package Qantily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class forgotPassword {
	
	WebDriver driver;
	
	  @BeforeClass
		 public void beforeTest() {
		 String driverPath = "C:\\Program Files\\Eclipse Setup\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.navigate().to("https://staging.qantily.com/");
	  }
	  
	  @Test(priority =1)
	  public void verify_forgot_password_Button() throws Exception {
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='header-control-section']//a[@class='inherit'][normalize-space()='LOGIN']")).click();
		 Thread.sleep(2000);
		 WebElement forgotBtn = driver.findElement(By.xpath("//a[@class='forgot-pass']"));
		 if(forgotBtn.isDisplayed()) {
			 System.out.println("Forgot button is displayed");
		 }
	  }
	  @Test(priority =2)
	  public void verify_forgot_Button_Clicked() throws Exception {
		  Thread.sleep(3000);
		  WebElement forgotBtn = driver.findElement(By.xpath("//a[@class='forgot-pass']"));
		  forgotBtn.click();
		  WebElement forgotPage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]"));
		  if(forgotPage.isDisplayed()){
			 String pageText= driver.findElement(By.xpath("//div[@class='message-bold']")).getText();
			  System.out.println(" Forgot Button is clickable  " +pageText);		  
		  }}
	  
	  @Test(priority =3)
      public void verify_textbox() throws Exception {
		 Thread.sleep(2000);  
	    String headingtext = driver.findElement(By.xpath("//label[normalize-space()='Email Address']")).getText();
	    System.out.println(headingtext);
		WebElement textbox=driver.findElement(By.xpath("//input[@placeholder='****@gmail.com']"));
		if(textbox.isEnabled()&& textbox.isDisplayed()){
			System.out.println("Test is passed for text box");
		}
	  } 

	  @Test(priority =4)
      public void verify_Send_RecoveryMail_Button() throws Exception {
		 Thread.sleep(2000);
		 WebElement recoveryBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		 if (recoveryBtn.isDisplayed()) {
			 System.out.println("Send Recovery mail button is displayed");
		 }
		 else {
			 System.out.println("Send Recovery mail button is not present");
		 }
	  }
	  
	  @Test(priority =5)
      public void verify_With_invalid_EmailID() throws Exception {
		 Thread.sleep(2000);
	 WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='****@gmail.com']"));
	 textbox.sendKeys("Shivaliguleria385@gmail.com");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(2000);
	 String errorMsg= driver.findElement(By.xpath("//div[contains(text(),'Email not found')]")).getText();
	 //String errorMsg = driver.switchTo().alert().getText();
	 if (errorMsg.equals("Email not found")) {
		 System.out.println("Test is passed  "+ errorMsg);
	 }
    else {
			 System.out.println("Test is failed ");
		 }
	 }

	  @Test(priority =6)
      public void verify_With_valid_EmailID() throws Exception {
		 Thread.sleep(2000);
		 WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='****@gmail.com']"));
	     textbox.sendKeys(Keys.CONTROL,"A");
		 textbox.sendKeys(Keys.BACK_SPACE);
		 textbox.sendKeys("shivaliguleria385@gmail.com");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 String sentMsg= driver.findElement(By.xpath("//div[@class='message-bold']")).getText();
		 if (sentMsg.contains("Email sent")) {
			 System.out.println("Recovery " + sentMsg);
		 }
		 else {
			 System.out.println("Test is failed");
		 }
	  }
	  
		  @AfterClass
		  public void driverclosed() {
			  System.out.println("Driver is closed");
			  driver.close();	  
		  }
	}


