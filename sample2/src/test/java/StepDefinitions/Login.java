package StepDefinitions;



	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
////
	public class Login {
//		
		WebDriver driver;
		
		@When("Open chrome1")
		public void open_chrome1() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@Then("open orangeHRM {string}")
		public void open_orange_hrm(String URL) {
	   
			this.driver.get(URL);
		    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
//
		@When("login username {string} Password {string}")
		public void login_username_password(String username, String password) {
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		}
			@Then("Navigate PIM")
			public void navigate_pim() {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
			}
//	//
//			@Then("Addemployee for below records1")
//			public void addemployee(String firistname, String lastname, String id) {
//				List<WebElement> l1  = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////	//
//				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys(lastname);
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(id);
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(firistname);
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
//				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			//	
////				Thread.sleep(20000);
//				 // JavascriptExecutor js = (JavascriptExecutor) driver;
//			      WebElement elementToClick = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
//			      elementToClick.click();
//			}
//
//		

//		}

	}
