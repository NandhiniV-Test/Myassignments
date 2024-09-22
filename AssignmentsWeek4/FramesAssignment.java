package AssignmentsWeek4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
      	driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert alert=driver.switchTo().alert();
		String PromptAlertText = alert.getText();
		System.out.println(PromptAlertText);
		alert.sendKeys("Nandhini");
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
	}

}
