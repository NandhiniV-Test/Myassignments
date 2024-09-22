package AssignmentsWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 //username
		 WebElement usrname = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		 usrname.sendKeys("demosalesmanager");
		 //password
		 driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		 //click on login
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 
		 //click on CRM/SFA
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 //click on contacts
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
		 //click on merge contacts
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 
		 //Click on the widget of the "From Contact".
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		 
		//get all the window addr
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			
		//convert set into list
			List<String> window=new ArrayList<String>(windowHandles);
			
		//transfer the driver control
			driver.switchTo().window(window.get(1));
			
			
		//click on Click on the first resulting contact.
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			
			
			
		//get back to the previous window
			driver.switchTo().window(window.get(0));
			
		//Click on the widget of the "to Contact".
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			
			//get the window handles
			Set<String> windowHandles2 = driver.getWindowHandles();
			
			List<String> win2=new ArrayList<String>(windowHandles2);
			
			
		//transfer the driver control
			driver.switchTo().window(win2.get(1));	
			
		// Click on the second resulting contact.
			driver.findElement(By.xpath("//a[text()=\"ca1\"]")).click();
			
		//get back to the previous window
			driver.switchTo().window(win2.get(0));	
		
		//click on merge
			driver.findElement(By.xpath("//a[text()=\"Merge\"]")).click();
		//handle the alert
			Alert alert = driver.switchTo().alert();
			
			alert.accept();
			String title = driver.getTitle();
			System.out.println(title);
			
			
			
			
			
		
		
	}

}
