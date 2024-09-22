package AssignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		// Thread.sleep(2000);
		
		 
		 driver.findElement(By.linkText("Create new account")).click();

		// https://www.facebook.com/
//		//enter details
		 
		 driver.findElement(By.xpath("firstname")).sendKeys("Nandhini");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("V");
		 driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).sendKeys("8099988899");
		 
		 driver.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]")).sendKeys("abcdefg27*");
		 
		 //handling dropdown
		 WebElement Day=driver.findElement(By.id("day"));
		 Select s=new Select(Day);
		 s.selectByValue("27");
		 
		 WebElement month=driver.findElement(By.id("month"));
		 Select s1=new Select(month);
		 s1.selectByIndex(5);
		 
		 WebElement year=driver.findElement(By.id("year"));
		 Select s2=new Select(year);
		 s2.selectByVisibleText("1997");
		 
		 driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		 
		 
		 
		 

	}

}
