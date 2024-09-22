package AssignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://leaftaps.com/opentaps");
		 //username
		 WebElement usrname = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		 usrname.sendKeys("demosalesmanager");
		 //password
		 driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		 //click on login
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 //locate cmpy name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		 
		 //locate first name  createLeadForm_firstName
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandu");
		 
		 //locate last name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nandi");
		 
		 
		 //click on create
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //get the text
		 String leadid=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(leadid);
		 
		 //verify the title
		 String title = driver.getTitle();
		 if(title.equals("View Lead | opentaps CRM")) {
				System.out.println("Title is correct");
			}else {
				System.out.println("Title is not correct");
			}
			driver.close();
}
}
