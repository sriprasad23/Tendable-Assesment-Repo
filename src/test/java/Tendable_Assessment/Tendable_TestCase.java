package Tendable_Assessment;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tendable_TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		
			// Our Story 
		
			WebElement ourstory=driver.findElement(By.xpath("//a[contains(text(),'Our Story')]"));
			ourstory.click();
			WebElement ourstoryrequestdemo = driver.findElement(By.xpath("//header/div[1]/div[1]/a[3]"));
			String actualourstoryrequestdemo = ourstoryrequestdemo.getText();
			Assert.assertEquals("Request a Demo", actualourstoryrequestdemo);
			System.out.println("In Our Story page Request a Demo link is Avaialable");
			
			// Our Solution 
			
			WebElement oursolution =driver.findElement(By.xpath("//a[contains(text(),'Our Solution')]"));
			oursolution.click();
			WebElement oursolutionrequestdemo = driver.findElement(By.xpath("//header/div[1]/div[1]/a[3]"));
			String actualoursolutiorequestdemo = oursolutionrequestdemo.getText();
			Assert.assertEquals("Request a Demo", actualoursolutiorequestdemo);
			System.out.println("In Our Solution page Request a Demo link is Avaialable");
			
			//Why Tendable?
			
			WebElement whytable =driver.findElement(By.xpath("//a[contains(text(),'Why Tendable?')]"));
			whytable.click();
			WebElement whytendablerequestdemo = driver.findElement(By.xpath("//header/div[1]/div[1]/a[3]"));
			String actualwhytendable = whytendablerequestdemo.getText();
			Assert.assertEquals("Request a Demo", actualwhytendable);
			System.out.println("In Why Tendable? page Request a Demo link is Avaialable");

			// Contact Us
			
			WebElement contactus =driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
			contactus.click();
			WebElement marketing =driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
			marketing.click();
			WebElement fullname = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]"));
			fullname.sendKeys("Sriprasad");
			WebElement orgname = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]"));
			orgname.sendKeys("ABCD Ltd");
			WebElement phonenumber = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]"));
			phonenumber.sendKeys("1234567890");
			WebElement emailfield = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/input[1]"));
			emailfield.sendKeys("abcdefgh@gmail.com");
			
			WebElement jobrole = driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/select[1]"));
			Select sel = new Select(jobrole);
			sel.selectByIndex(4);
			
			WebElement messagefield = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/textarea[1]"));
			messagefield.sendKeys("");
			
			Thread.sleep(2000);
			WebElement iagree = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/label[2]/input[1]"));
			iagree.click();
			
			Thread.sleep(1000);
			WebElement submitbutton =driver.findElement(By.xpath("//button[contains(@data-loading-text,'Loading...')][normalize-space()='Submit']"));
			submitbutton.click();
			
			// Warning Message 
			WebElement errormessage =driver.findElement(By.xpath("//li[normalize-space()='This field is required']"));
			
			if(errormessage.isDisplayed())
			{
				System.out.println("The Test is PASS");
			}
			else
			{
				System.out.println("The Test is FAIL");
			}
			
			Thread.sleep(2000);
			driver.close();
	}
}
