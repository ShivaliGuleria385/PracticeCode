package Qantily.preprod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ManualMethod {
	WebDriver driver;
	
	  @BeforeClass
		 public void beforeTest() {
		 String driverPath = "C:\\Users\\Shivali\\Downloads\\Eclipse Setup\\chromedriver_win32\\chromedriver.exe\\";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.navigate().to("http://3.108.64.95/");
		//driver.navigate().to("https://staging.qantily.com/");
		driver.navigate().to("https://pre-prod.qantily.com");
		
	  }



       @Test(priority =1)
	  public void login_before_project() throws Exception {
		  
		  //click on login button
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[1]/div[3]/ul/li[1]/a")).click();
		  
		  //enter email address
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/div[1]/input")).sendKeys("sarmisthabi@yahoo.co.in");
		  
		  //enter password
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/div[2]/input")).sendKeys("Timex@1980");
		  
		  //click on login button
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/button[1]")).click();
		  
		 
	  }
	  
       @Test(priority =2)
	  public void add_new_project() throws Exception {
		
		//click on new project  
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]")).click();
		
		//click on Manual method App Storeicon
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div")).click();
		    
	  }
       @Test(priority =3)
	  public void verify_button() throws Exception {
		  
		 Thread.sleep(3000); 
		 String expectedHeading = "Create a New Test\n" + 
		 		"How would you like to share your application?\n" + 
		 		"Android Play Store\n" + 
		 		"iOS App Store\n" + 
		 		"Manual Method\n" + 
		 		"Google Play Store\n" + 
		 		"Select this alternative if the app you want to test is already published on the Google Play Store. Testers can directly download it from Store.\n" + 
		 		"Use this Method"; 
		 
		 String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div")).getText();
			
		 if(expectedHeading.equalsIgnoreCase(heading))
	      	System.out.println("The expected heading is same as actual heading --- "+heading);
		else
	      	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
       @Test(priority =4)
	  public void verfy_manual_string() throws Exception {
		  Thread.sleep(3000);
		  
		String manual = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[3]")).getText();
		  
		  System.out.println("This string is "+ manual);
		  
		  
		  
	  }
       @Test(priority =5)
	  public void verify_description_for_manual() throws Exception {
		  
		 Thread.sleep(3000); 
		 String expectedHeading = "Select this alternative if the app you want to provide application details manually. The testers can download the installable and start.";
		 
		 String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[4]")).getText();
			
		 if(expectedHeading.equalsIgnoreCase(heading))
	      	System.out.println("The expected heading is same as actual heading --- "+heading);
		else
	      	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  } 
	
       @Test(priority =6)
	  public void use_manual_method() throws Exception {
		Thread.sleep(3000);  
		  
		  //click on use this method button
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/a/div")).click();
		 Thread.sleep(2000);
		 
		 
	  }
	  
	
       @Test(priority =7)
	  public void add_project_title() throws Exception {
		Thread.sleep(3000);  
		  
		  //enter the value of project title
		 driver.findElement(By.xpath("//input[@name='title']")).sendKeys("My Project");
		 Thread.sleep(2000);
		 
		 
	  }
	  
       @Test(priority =8)
	  public void select_browser() throws Exception {
		Thread.sleep(3000);  
		  
		  //click on select platform 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]")).click();
		 Thread.sleep(2000);
	
	  }
       @Test(priority =9)
	  public void verify_platform() throws Exception {
		  Thread.sleep(3000);
		  
		   WebElement platforms = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]"));
		  
		 //*[@id="root"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[10]
		  
		  
		  if(platforms.isEnabled()) 
		         System.out.println("Search button is enabled. Return: " +platforms.isEnabled()); 
		      
		     else 
		         System.out.println("Search button is not enabled. Return: " +platforms.isEnabled()); 
		     
		  
	  }
	  
       @Test(priority =10)
	  public void verify_platform_icon() throws Exception {
		  Thread.sleep(3000);
		  
		   WebElement platforms = driver.findElement(By.xpath(" //*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[10]"));
		  
		
		  
		  
		  if(platforms.isEnabled()) 
		         System.out.println("Search button is enabled. Return: " +platforms.isEnabled()); 
		      
		     else 
		         System.out.println("Search button is not enabled. Return: " +platforms.isEnabled()); 
       }
       @AfterClass
       public void driverclosed() {
		     
		  driver.close();
		  
	  }
	  
  }

