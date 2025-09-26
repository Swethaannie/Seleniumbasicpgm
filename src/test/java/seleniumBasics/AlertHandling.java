package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Basee {
	public void verifySimpleAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.id("alertButton"));
		clickme.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMeConfirm = driver.findElement(By.id("confirmButton"));
		clickMeConfirm.click();
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMePrompt = driver.findElement(By.id("promtButton"));
		clickMePrompt.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Eve");
		al.accept();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AlertHandling alerthandling=new AlertHandling();
alerthandling.initializeBrowser();
alerthandling.verifySimpleAlerts();
alerthandling.verifyPromptAlert();
alerthandling.verifySimpleAlerts();
	}

}
