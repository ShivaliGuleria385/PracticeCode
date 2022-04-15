package Qantily;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReportBug {
	WebDriver driver;
	  @BeforeClass
		 public void beforeTest() {
		 String driverPath = "C:\\Program Files\\Eclipse Setup\\chromedriver_win32\\chromedriver.exe";
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
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/div[1]/input")).sendKeys("shivaliguleria385@gmail.com");
		  
		  //enter password
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/div[2]/input")).sendKeys("Nexg@123");
		  
		  //click on login button
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[3]/form/button[1]")).click();
		  
		 
	  }
	  
	  
	  
	  @Test(priority=2)
	  public void Begin_Testing_button() throws Exception {
		 Thread.sleep(2000); 
		  
	//click on Begin Testing button	  
	driver.findElement(By.xpath("(//BUTTON[text()='Begin Testing'])[1]")).click();	  
	  }
	  
	  
	  @Test(priority=3)
	  public void Report_a_Bug() throws Exception {
			 Thread.sleep(2000); 
			  
		//click on Report a Bug button	  
		driver.findElement(By.xpath("//button[contains(text(), 'Report a Bug')]")).click();
		
			  
		  }
	  
	  @Test(priority=4)
	  public void enter_value_defect_summary() throws Exception {
			 Thread.sleep(2000); 
			  
		//enter value in defect_summary text	  
		driver.findElement(By.xpath("//input[@class='inputbox' and @placeholder='Add brief summary']")).sendKeys("logo");
		
			  
		  }
	  
	  @Test(priority=5)
	  public void enter_value_Component() throws Exception {
			 Thread.sleep(2000); 
			  
		//click on Begin Testing button	  
		driver.findElement(By.xpath("//input[@class='inputbox' and @name='component']")).sendKeys("login");
		
			  
		  }
	  
	  
	  
	  @Test(priority=6)
	  public void select_Severity() throws Exception {
			 Thread.sleep(2000); 
			  
		//select_Severity	  
			 Select Severity = new Select(driver.findElement(By.xpath("//select[@class='dropbox'  and @name='priority']")));
			 Severity.selectByVisibleText("CRITICAL");
			  
		  }
	  
	  @Test(priority=7)
	  public void Device_Used_For_Testing() throws Exception {
			 Thread.sleep(2000); 
			  
		//select_Severity	  
			 Select Severity = new Select(driver.findElement(By.xpath("//select[@class='dropbox'  and @id='deviceList']")));
			 //Severity.selectByVisibleText("vivo v9");
			 Severity.selectByIndex(1);
			  
		  }
	  
	  
	  @Test(priority=8)
	  public void enter_value_in_description() throws Exception {
			 Thread.sleep(2000); 
			  
		//click on Begin Testing button	  
		driver.findElement(By.xpath("//textarea[@class='FormFillUp-textarea' and @name='description']")).sendKeys("we are getting some error in login page");
		
			  
		  }
	  
	
	  
	  @Test(priority=9)
	  public void click_on_submit() throws Exception {
			 Thread.sleep(2000); 
			  
		//click on submit button	  
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
				  
		  }
	  @AfterClass
	  public void driverClosed() {
		  driver.close();
		  System.out.println("Test is Completed");
	  }
	  
}
