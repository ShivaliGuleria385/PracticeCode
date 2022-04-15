package Qantily.preprod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewProjectios {
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
	  
	  
	  @Test(priority=2)
	  public void add_new_project() throws Exception {
		
		//click on new project  
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]")).click();
		
		//click on iOS App Storeicon
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]")).click();
		    
	  }
	  
	  @Test(priority=3)
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
	  

	  @Test(priority=4)
	  public void use_ios_method() throws Exception {
		Thread.sleep(3000);  
		  
		  //click on use this method button
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/a/div")).click();
		 Thread.sleep(2000);
		 
		 
	  }
	  
	  @Test(priority=5)
	  public void search_app() throws Exception {
		  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/input")).sendKeys("Hoichoi");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"search-response\"]/div[1]")).click();
		
		Thread.sleep(3000);
		  
	  }
	  
	  @Test(priority=6)
	  public void get_application_name() throws Exception {
		Thread.sleep(9000); 
		
		String heading = driver.findElement(By.xpath("//input[@placeholder='Name of the Application']")).getAttribute("value");
		  
		System.out.println("actual heading --- "+heading);
		  
	  }
	  
	  @Test(priority=7)
	  public void get_Link_to_your_app_on_App_store() throws Exception {
		Thread.sleep(9000); 
		
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/input[2]")).getAttribute("value");
		  
		System.out.println("actual heading --- "+heading);
	  
	}
	  
	  @Test(priority=8)
	  public void verify_cart_summary() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=9)
	  public void verify_platform() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=10)
	  public void verify_baseprise_on_cart() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=11)
	  public void verify_subtotal_on_cart() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[4]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=12)
	  public void click_on_continue() throws Exception {
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button")).click();
		  Thread.sleep(2000);
		  
		  
		  
	  }
	  
	  @Test(priority=13)
	  public void verify_add_basic_deatils() throws Exception {
		  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]")).getText();
		

	  }
	  
	  @Test(priority=14)
	  public void CheckImage() throws Exception {
		  WebElement i = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/img"));
			      // Javascript executor to check image
			      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			      //verify if status is true
			      if (p) {
			         System.out.println("Logo present");
			      } else {
			         System.out.println("Logo not present");
			      }
	  
	}
	  
	  @Test(priority=15)
	  
	  public void choose_package() throws Exception {
		  
		  
		  Thread.sleep(3000);
		  
		  //select package name 
		  Select cpackage = new Select(driver.findElement(By.xpath("//*[@id=\"complexity\"]")));
		  cpackage.selectByVisibleText("High Complex Applications");
			
	  }
	  
	  
	  @Test(priority=16)
	  public void verify_platform_after_package() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=17)
	  public void verify_baseprise_on_cart_after_package() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/div[1]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  
	  @Test(priority=18)
	  public void get_sub_total_value() throws Exception {
			  Thread.sleep(3000);
			  
			  
			String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[4]")).getText();
			Thread.sleep(2000);  
			
			  System.out.println("actual heading --- "+heading); 
			  
			  
		  }  
		  
	 
	  @Test(priority=19)
	public void change_package() throws Exception {
		  
		  
		  Thread.sleep(3000);
		  
		  //select package name 
		  Select cpackage = new Select(driver.findElement(By.xpath("//*[@id=\"complexity\"]")));
		  cpackage.selectByVisibleText("MEDIUM Complex Applications");
			
	  }
		  
		
	  @Test(priority=20)
	  public void verify_baseprise_after_change_package() throws Exception {
		  Thread.sleep(3000);
		  
		  
		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/div[1]")).getText();
		Thread.sleep(2000);  
		
		  System.out.println("actual heading --- "+heading); 
		  
		  
	  }
	  
	  @Test(priority=21)
	  public void get_sub_total_value_after_change_package() throws Exception {
			  Thread.sleep(3000);
			  
			  
			String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[4]")).getText();
			Thread.sleep(2000);  
			
			  System.out.println("actual heading --- "+heading); 
			  
			  
		  }  
		  
	  
	  @Test(priority=22)
	  public void change_package_select_low() throws Exception {
	  	  
	  	  
	  	  Thread.sleep(3000);
	  	  
	  	  //select package name 
	  	  Select cpackage = new Select(driver.findElement(By.xpath("//*[@id=\"complexity\"]")));
	  	  cpackage.selectByVisibleText("LOW Complex Applications");
	  		
	    }
	  	  
	  	
	    @Test(priority=23)
	    public void verify_baseprise_after_select_low() throws Exception {
	  	  Thread.sleep(3000);
	  	  
	  	  
	  	String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/div[1]")).getText();
	  	Thread.sleep(2000);  
	  	
	  	  System.out.println("actual heading --- "+heading); 
	  	  
	  	  
	    }
	    
	    
	    @Test(priority=24)
	    public void get_sub_total_value_after_select_low() throws Exception {
	  		  Thread.sleep(3000);
	  		  
	  		  
	  		String heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[4]")).getText();
	  		Thread.sleep(2000);  
	  		
	  		  System.out.println("actual heading --- "+heading); 
	  		  
	  		  
	  	  }  
	  	  
	    @Test(priority=25)
	    public void click_with_continue() throws Exception {
	    	
	    	Thread.sleep(3000);
	    	
	    	//click on continue button
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button")).click();
	    	Thread.sleep(2000);
	    }
	  
	    @Test(priority=26)
	    public void verify_version() throws Exception {
	    	Thread.sleep(3000);
	    	
	    	//get version of your application
	    	
	   String version = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[6]/input")).getAttribute("value");
	    
	   System.out.println("Your version is "+version);
	    	
	    }
	    
	      @Test(priority=27)
		  public void verify_version_with_other_app() throws Exception {
			Thread.sleep(3000);  
			  
			//click on back button
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]")).click();
			
			// click on back again
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/input")).clear();
			  
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/input")).sendKeys("R");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/button")).click();
			
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"search-response\"]/div[1]")).click();
			
			Thread.sleep(3000);
			
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button")).click();
			Thread.sleep(2000);
			
			
			//click on continue
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button")).click();
			
			//get version 
			String version = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[6]/input")).getAttribute("value");
		    
			   System.out.println("Your version now is "+version);
			
		  }
	    
	      @Test(priority=28)
	      public void provide_build_url() throws Exception {
	    	
	    	Thread.sleep(3000);
	    	//enter url
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[5]/input")).sendKeys("https://www.hoichoi.tv/");
	    	
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button")).click();
			Thread.sleep(2000);
	 }  
	      @Test(priority=29)
	      public void card_details() throws Exception {
	      Thread.sleep(2000);	  
	    	
	      driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("shivaliguleria@gmail.com");
	      Thread.sleep(2000);
	      /*driver.switchTo().frame(0)
	      driver.findElement(By.xpath("//SPAN[@class='Text Text-color--gray800'][text()='Cancel']"));
	      WebElement OTPWindow= driver.findElement(By.xpath("//DIV[@class='VerificationModal-modalContent']"));*/
	      //enter card number
	      
	      driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
	      Thread.sleep(2000);
	      
	      
	      //select expire date
	      driver.findElement(By.id("cardExpiry")).sendKeys("0326");
	      
	      
	    //select cvv number
	      driver.findElement(By.id("cardCvc")).sendKeys("144");
	      
	      
	      //enter billingName
	      driver.findElement(By.id("billingName")).sendKeys("Shivali");
	      Thread.sleep(2000);
	      } 
	      //click on check box
	     @Test(priority=30)
		  public void checkbox_enabled() throws Exception {
			   // Selecting CheckBox		
		        WebElement option1 = driver.findElement(By.xpath("//input[@id='enableStripePass']"));						

		        // This will Toggle the Check box 		
		        option1.click();			

		        // Check whether the Check box is toggled on 		
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }
			  }  
	     
	     @Test(priority=31)
	    	public void enter_phone_number() throws Exception {
	    		Thread.sleep(2000);
	    		
	    		WebElement NumFieldtobeClear=driver.findElement(By.id("phoneNumber"));
	    		 NumFieldtobeClear.sendKeys("8837849566");
	    		 NumFieldtobeClear.sendKeys(Keys.CONTROL,"A");
	    		 NumFieldtobeClear.sendKeys(Keys.BACK_SPACE);
	    		Thread.sleep(2000);
	    		
	    	}  
	     @Test(priority=32)
		  public void checkbox_Disabled() throws Exception {
			   // Selecting CheckBox		
		        WebElement option1 = driver.findElement(By.xpath("//input[@id='enableStripePass']"));						

		        // This will Toggle the Check box 		
		        option1.click();			

		        // Check whether the Check box is toggled on 		
		        if (option1.isSelected()) {					
		            System.out.println("Checkbox is Toggled On");					

		        } else {			
		            System.out.println("Checkbox is Toggled Off");					
		        }
			  }  

	      @Test(priority=33)
	      public void submit_payment() throws Exception {
	    	  Thread.sleep(4000);
	    	  
	    	driver.findElement(By.xpath("//DIV[@class='SubmitButton-IconContainer']")).click();	  
	      }
	      
	      
	      @Test(priority=34)
	      public void get_successfull_message() throws Exception {
	    	  Thread.sleep(5000);
	    	  
	    	  
	    	  String heading = driver.findElement (By.xpath ("//div[@class='message']")).getText();
	    	  
	    	  System.out.println("actual heading --- "+heading); 	  
	      }
	       
	      
	     @AfterClass
	     public void DriverClosed() {
	    	 driver.close();
	     }
	      }
	      
	    

