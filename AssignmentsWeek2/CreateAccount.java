package AssignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize the browser
		driver.manage().window().maximize();
		//enter username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click on login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//click on crm/sfa
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//click on accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//click on create account
		driver.findElement(By.linkText("Create Account")).click();
		
		//fill the details
		driver.findElement(By.className("inputBox")).sendKeys("jane");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		
		//click on create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//verify the title
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Account Details | opentaps CRM")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}
		driver.close();
		
		
		
		
	
		
		
		
		
		
		
	}

}
