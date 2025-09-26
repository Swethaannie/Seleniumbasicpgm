package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandle extends Basee {
	
	public void verifyWindowHandling()
	{
		
driver.navigate().to("https://demo.guru99.com/popup.php");
String parentID=driver.getWindowHandle();
WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
clickhere.click();
Set<String> handleIds=driver.getWindowHandles();
Iterator<String> it=handleIds.iterator();
while(it.hasNext())
{
	String currentId=it.next();
	if(!currentId.equals(parentID))
	{
		driver.switchTo().window(currentId);
	}
	WebElement email=driver.findElement(By.name("emailid"));
	email.sendKeys("abc@gmail.com");
	WebElement submitBtn=driver.findElement(By.name("btnLogin"));
	submitBtn.click();
}
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
MultipleWindowHandle multipleWindowHandle =new MultipleWindowHandle();
multipleWindowHandle.initializeBrowser();
multipleWindowHandle.verifyWindowHandling();
}

}

	