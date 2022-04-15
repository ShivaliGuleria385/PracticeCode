package Qantily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class allLogin {
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
	  
	  @Test(priority =1,description = "This test will login in the admin portal" )
	  public void adminlogin() throws InterruptedException   {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='header-control-section']//a[@class='inherit'][normalize-space()='LOGIN']")).click();
		  driver.findElement(By.xpath("//input[@name='user']")).sendKeys("shivali@nexgsolution.com");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nexg@123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		 // driver.switchTo().alert().accept();
		  if(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]")).isDisplayed()){
			  System.out.println("Test is passed for admin login");
		  }
	  }
		@Test(priority =2,description = "This test will logout from the admin portal" )
		public void adminlogout() throws Exception {
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div/div/h4/span[2]")).click();
		String text= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]")).getText();
		if(text.contentEquals("Logged Out")) {
			  System.out.println("  Admin is  " + text);
		}
	  }
		@Test(priority =3,description = "This test will login in the tester profile" )
		  public void testerlogin() throws InterruptedException   {
			Thread.sleep(3000);
			  driver.findElement(By.xpath("//div[@class='header-control-section']//a[@class='inherit'][normalize-space()='LOGIN']")).click();
			  driver.findElement(By.xpath("//input[@name='user']")).sendKeys("shivaliguleria385@gmail.com");
			  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nexg@123");
			  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			  if(driver.findElement(By.xpath("//div[@class='dashboard-body']")).isDisplayed()) {
				  System.out.println("Tester is logged-in");
			  }
		}
		@Test(priority =4,description = "This test will logout from the tester profile" )
		public void testerlogout() throws Exception {
			Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
		String text= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]")).getText();
		if(text.contentEquals("Logged Out")) {
			  System.out.println("  Tester is  " + text);
		}
		}
	  @Test(priority =5,description = "This test will login in the Client profile" )
	  public void clientlogin() throws InterruptedException   {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='header-control-section']//a[@class='inherit'][normalize-space()='LOGIN']")).click();
		  driver.findElement(By.xpath("//input[@name='user']")).sendKeys("shivaliguleria12@gmail.com");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nexg@123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  if(driver.findElement(By.xpath("//div[contains(@class,'dashboard-body')]")).isDisplayed()) {
			  System.out.println("Client is logged-in");
		  }
	}
	@Test(priority =6,description = "This test will logout from the Client profile" )
	public void clientlogout() throws Exception {
		Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
	String text= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]")).getText();
	if(text.contentEquals("Logged Out")) {
		  System.out.println("  Client is  " + text);
	}
	}
	 
	    
	  @AfterClass
	  public void driverclosed() {
		  System.out.println("Driver is closed");
		  driver.close();	  
	  }
}
	  
