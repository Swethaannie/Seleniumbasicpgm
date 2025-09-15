package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basee{
   
	public WebDriver driver;
  

    // Method to initialize the browser
    public void initializeBrowser() {
        // Launch  browser
        driver = new ChromeDriver();

        // Open URL
        driver.get("https://selenium.qabible.in/");

        // Maximize window
        driver.manage().window().maximize();
    }

 

// Main method
public static void main(String[] args) {
Basee base = new Basee();
base.initializeBrowser();
//base.driverClose();

}}