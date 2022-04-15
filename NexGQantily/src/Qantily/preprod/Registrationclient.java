package Qantily.preprod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Registrationclient {
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
	  @Test(priority=1)
	  public void register() throws Exception {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[1]/div[3]/ul/li[2]")).click();
		Thread.sleep(2000);
		
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div")).getText();
		
		System.out.println("actual heading --- "+heading);
		  
	  }

	  @Test(priority=2)
	  public void click_start_testing_now() throws Exception {
		 
		  Thread.sleep(2000);  
		  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[1]/div[3]/div")).click();
		Thread.sleep(2000);
	  }

	  @Test(priority=3)
	  public void verify_specified_fields() throws Exception {
		  String expectedHeading = "Set up your Account today!"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/h2")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  
	  
	  @Test(priority=4)
	  public void social_logins() throws Exception {
		  
		  Thread.sleep(3000);
		  
		  WebElement socialbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/div[1]"));
		 
		if(socialbutton.isDisplayed()) 
		         System.out.println("Social button is enabled. Return: " +socialbutton.isDisplayed()); 
		      
		     else 
		         System.out.println("Social button is not enabled. Return: " +socialbutton.isDisplayed()); 
		     
		  
	  }
	  
	  
	  
	  @Test(priority=5)
	  public void verify_name_fields() throws Exception {
		  String expectedHeading = "Your Name *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[1]/label")).getText(); 
		
		
		
		
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  @Test(priority=6)
	  public void verify_email_address_field() throws Exception {
		  String expectedHeading = "Email Address *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[2]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  @Test(priority=7)
	  public void verify_password_field() throws Exception {
		  String expectedHeading = "Password *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[3]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  @Test(priority=8)
	  public void verify_repeat_field() throws Exception {
		  String expectedHeading = "Confirm Password *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[4]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Test(priority=9)
	  public void enter_name_fields() throws Exception {
		 Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@name='name' and @type='text' ]")).sendKeys("Mohammad Shad");
		Thread.sleep(1000);
	  }
	 
	  //Verify the email id filed With Missing @ sign and domain
	  @Test(priority=10)
	  public void email_address_field_without_Sign_domain() throws Exception {
		  String expectedHeading = "Enter Valid Email";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("shad");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error' ]")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	Thread.sleep(2000);  
	
	
	  }
	  
	  
	  @Test(priority=11)
	  public void email_address_field_without_Sign() throws Exception {
		  String expectedHeading = "Enter Valid Email";
		  Thread.sleep(2000); 
		
		//driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("shad@nexgsolutioncm");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	Thread.sleep(2000);
	
	  
	  }
	  
	  @Test(priority=12)
	  public void verify_with_valid_email_address() throws Exception {
		 // String expectedHeading = "Enter Valid Email";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("abadakbar07@gmail.com");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	  }
	  
	  
	  
	  
	  @Test(priority=13)
	  public void verify_with_valid_password() throws Exception {
		  //String expectedHeading = "Password is not matched";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Shad@1234");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	  
	  } 
	  
	  
	  @Test(priority=14)
	  public void verify_with_invalid_repeat_password() throws Exception {
		  String expectedHeading = "Password is not matched";
		  Thread.sleep(2000); 
		
		//enter repeat password
		  driver.findElement(By.xpath("//input[@type='password' and @name='passwordRep']")).sendKeys("Shad@123");
		Thread.sleep(2000);
		
		//click on next button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//div[@class='app-alerts']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	
	
	  
	  } 
	  
	  
	  @Test(priority=15)
	  public void verify_with_valid_repeat_password() throws Exception {
		  //String expectedHeading = "Password is not matched";
		  Thread.sleep(2000); 
		  
		//enter repeat password
		  driver.findElement(By.xpath("//input[@type='password' and @name='passwordRep']")).clear();
		Thread.sleep(2000);
		
		//enter repeat password
		  driver.findElement(By.xpath("//input[@type='password' and @name='passwordRep']")).sendKeys("Shad@1234");
		Thread.sleep(2000);
		
		//click on next button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
		
	
	  
	  } 
	  
	  
	  
	  
	  
	  @Test(priority=16)
	  public void linkedin_social_logins_on_details() throws Exception {
		  
		  Thread.sleep(3000);
		  
		  WebElement socialbutton = driver.findElement(By.xpath("//button[@id='linkedin' and @class='submit-form']"));
		 
		if(socialbutton.isDisplayed()) 
		         System.out.println("Social button is enabled. Return: " +socialbutton.isDisplayed()); 
		      
		     else 
		         System.out.println("Social button is not enabled. Return: " +socialbutton.isDisplayed()); 
		     
		  
	  }
	  
	  
	  
	  
	  @Test(priority=17)
	  public void google_social_logins_on_details() throws Exception {
		  
		  Thread.sleep(3000);
		  
		  WebElement socialbutton = driver.findElement(By.xpath("//button[@id='google' and @class='submit-form']"));
		 
		if(socialbutton.isDisplayed()) 
		         System.out.println("Social button is enabled. Return: " +socialbutton.isDisplayed()); 
		      
		     else 
		         System.out.println("Social button is not enabled. Return: " +socialbutton.isDisplayed()); 
		     
		  
	  }
	  
	  
	  @Test(priority=18)
	  public void verify_phone_field() throws Exception {
		  String expectedHeading = "Phone Number *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[1]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	
	  @Test(priority=19)
	  public void verify_domain_field() throws Exception {
		  String expectedHeading = "Position *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[2]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  
	  
	  @Test(priority=20)
	  public void validation_on_numeric_field_phone_number_by_entering_alphabets_and_special_characters() throws Exception {
		  String expectedHeading = "Enter a valid phone number";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("shad@#70932");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
	driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).clear();
	  
	  } 

	  
	  
	  @Test(priority=21)
	  public void Verify_phone_number_field_with_less_than_10_digits() throws Exception {
		  String expectedHeading = "Enter a valid phone number";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("955555");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
	driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).clear();	  
	  }   
	  
	  
	  @Test(priority=22)
	  public void Verify_phone_number_field_with_more_than_10_digits() throws Exception {
		  String expectedHeading = "Enter a valid phone number";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("955555098734");
		Thread.sleep(2000);
		
		//click on submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	  
	  }   
	  
	  
	  
	  
	  @Test(priority=23)
	  public void Verify_phone_number_field_with_10_zeros() throws Exception {
		  String expectedHeading = "Enter a valid phone number";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("0000000000");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	  
	  }   
	  
	  
	 
	@Test(priority=24)
	  public void Verify_phone_number_field_with_minus_values() throws Exception {
		  String expectedHeading = "Enter a valid phone number";
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).clear();
		
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("-432687654");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	Assert.assertEquals(expectedHeading, emailerror);
	
	
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
	
	driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).clear();
	  
	  }   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Test(priority=25)
	  public void verify_with_valid_phone_number() throws Exception {
		  String expectedHeading = "Enter Valid Email";
		  Thread.sleep(2000); 
		
		  driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).clear();
		  Thread.sleep(2000);
		  
		  
		driver.findElement(By.xpath("//input[@type='number' and @name='phone']")).sendKeys("9555571932");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	  
	  } 
	  
	  
	  @Test(priority=26)
	  public void verify_with_blank_position() throws Exception {
		  String expectedHeading = "Enter a valid Position";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='text' and @name='position']")).sendKeys("");
		Thread.sleep(2000);
		
		//click on next button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	if(expectedHeading.equalsIgnoreCase(emailerror))
     	System.out.println("The expected heading is same as actual heading --- "+emailerror);
	else
     	System.out.println("The expected heading doesn't match the actual heading --- "+emailerror);
 
	  
	  } 
	  
	  
	  
	  @Test(priority=27)
	  public void verify_with_valid_position() throws Exception {
		  //String expectedHeading = "Enter Valid Email";
		  Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@type='text' and @name='position']")).sendKeys("shad Engineers");
		Thread.sleep(2000);
		
		//click on submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	//String emailerror =	driver.findElement(By.xpath("//small[@class='show-error']")).getText();
	
	  
	  } 
	  
	  
	  
	  
	  
	  @Test(priority=28)
	  public void linkedin_social_logins_on_location() throws Exception {
		  
		  Thread.sleep(3000);
		  
		  WebElement socialbutton = driver.findElement(By.xpath("//button[@id='linkedin' and @class='submit-form']"));
		 
		if(socialbutton.isDisplayed()) 
		         System.out.println("Social button is enabled. Return: " +socialbutton.isDisplayed()); 
		      
		     else 
		         System.out.println("Social button is not enabled. Return: " +socialbutton.isDisplayed()); 
		     
		  
	  }
	  
	  
	  
	  
	  @Test(priority=29)
	  public void google_social_logins_on_location() throws Exception {
		  
		  Thread.sleep(3000);
		  
		  WebElement socialbutton = driver.findElement(By.xpath("//button[@id='google' and @class='submit-form']"));
		 
		if(socialbutton.isDisplayed()) 
		         System.out.println("Social button is enabled. Return: " +socialbutton.isDisplayed()); 
		      
		     else 
		         System.out.println("Social button is not enabled. Return: " +socialbutton.isDisplayed()); 
		     
		  
	  }
	  
	  
	  
	  @Test(priority=30)
	  public void verify_Headquarters_fields() throws Exception {
		  String expectedHeading = "Headquarters *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[1]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	  
	  
	  
	  
	  
	 
	  @Test(priority=31)
	  public void verify_Number_of_Employees() throws Exception {
		  String expectedHeading = "Number of Employees *";
		  //String countryfirstexpacted = "Select country first";
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[2]/label")).getText(); 
		
		//String	countryfirst = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[8]/div[1]/small")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
	   	
	   	
		  
	  }
	  
	  @Test(priority=32)
	  public void verify_Website_URL_field() throws Exception {
		  String expectedHeading = "Website URL *"; 
		 Thread.sleep(2000); 
		 //String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]")).getText();
		 //System.out.println("actual heading --- "+heading); 
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[3]/label")).getText(); 
		
	   	if(expectedHeading.equalsIgnoreCase(heading))
	         	System.out.println("The expected heading is same as actual heading --- "+heading);
	   	else
	         	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		 
		  
	  }
	
	  
	   
		  @Test(priority=33)
		  public void select_Headquarters() throws Exception {
			  
			  Thread.sleep(3000);
			  //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[7]/select")).click();
			  
			  
			  Select fruits = new Select(driver.findElement(By.xpath("//select[@class='input-select'  and @name='country']")));
				fruits.selectByVisibleText("India (91)");
				//fruits.selectByIndex(1);
			  
			  
		  }
	  
	  
		  @Test(priority=34)
		  public void enter_employees_value() throws Exception {
			  
			  //enter emplyees value
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//input[@type='number'  and @name='employees']")).sendKeys("10");
			  
			  
		  }
		  
		  
		  @Test(priority=35)
		  public void enter_Website_URL() throws Exception {
			  
			  //enter website url
			  Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='text'  and @name='website']")).sendKeys("https://staging.qantily.com/");
			  
		  }
		  
	  
		  @Test(priority=36)
		  public void checkbox_string1() throws Exception {
			 
			
				  String expectedHeading = "I am in a position to make decision for my firm *";
				  Thread.sleep(2000); 
				
				 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[5]/div[1]/span")).getText();
				Thread.sleep(2000);
				
			//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
			if(expectedHeading.equalsIgnoreCase(checkbox1))
		     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
			else
		     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
		 
			  
			  }  
			 
			
		  @Test(priority=37)
		  public void checkbox_string2() throws Exception {
			 
			
				  String expectedHeading = "I accept the privacy notice for the crowd services & cloud services *";
				  Thread.sleep(2000); 
				
				 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[5]/div[2]/span")).getText();
				Thread.sleep(2000);
				
			//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
			if(expectedHeading.equalsIgnoreCase(checkbox1))
		     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
			else
		     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
		 
			  
			  }  
			
		  
		  @Test(priority=38)
		  public void checkbox_string3() throws Exception {
			 
			
				  String expectedHeading = "By Signing up you agree to our Terms and Conditions and Privacy Policy.*";
				  Thread.sleep(2000); 
				
				 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[4]/form/div/div[5]/div[3]/span")).getText();
				Thread.sleep(2000);
				
			//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
			if(expectedHeading.equalsIgnoreCase(checkbox1))
		     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
			else
		     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
		 
			  
			  }  
		   
		  
		  @Test(priority=39)
		  public void first_checkbox_enabled() throws Exception {
			 
			
			  // Selecting CheckBox		
		        WebElement option1 = driver.findElement(By.xpath("//input[@type='checkbox'  and @name='decision']"));						

		        // This will Toggle the Check box 		
		        option1.click();			

		        // Check whether the Check box is toggled on 		
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }	
			  }  
		  
		  
		  @Test(priority=40)
		  public void second_checkbox_enabled() throws Exception {
			 
			
			  // Selecting CheckBox		
		        WebElement option1 = driver.findElement(By.xpath("//input[@type='checkbox'  and @name='declaration']"));						

		        // This will Toggle the Check box 		
		        option1.click();			

		        // Check whether the Check box is toggled on 		
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }	
			  }  
		  
		  @Test(priority=41)
		  public void third_checkbox_enabled() throws Exception {
			 
			
			  // Selecting CheckBox		
		        WebElement option1 = driver.findElement(By.xpath("//input[@type='checkbox'  and @name='accept']"));						

		        // This will Toggle the Check box 		
		        option1.click();			

		        // Check whether the Check box is toggled on 		
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }	
		  }
		        @AfterClass
		  	  public void driverClosed() {
		  		  driver.close();
			  }  
  
}
