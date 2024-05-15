package HandlingAlerts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HandlingAlerts {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	       
	        //ALERT BOX
	        driver.findElement(By.id("alertBox")).click(); 
	       System.out.println(driver.switchTo().alert().getText()); 
	       driver.switchTo().alert().accept();
       System.out.println(driver.findElement(By.id("output")).getText());
	       
	       //CONFIRMATION BOX(ACCEPT)
	       driver.findElement(By.id("confirmBox")).click();
	      System.out.println(driver.switchTo().alert().getText()); 
	       driver.switchTo().alert().accept();
	       System.out.println(driver.findElement(By.id("output")).getText());
	      
	       //CONFIRMATION BOX(DISMIS)
	       driver.findElement(By.id("confirmBox")).click();
		      System.out.println(driver.switchTo().alert().getText()); 
	       driver.switchTo().alert().dismiss();
		       System.out.println(driver.findElement(By.id("output")).getText());
		       
		     //PROMPT BOX(ACCEPT)
		       driver.findElement(By.id("promptBox")).click();
		      System.out.println(driver.switchTo().alert().getText()); 
		       driver.switchTo().alert().sendKeys("NANE KANO");
		       driver.switchTo().alert().accept();
		       System.out.println(driver.findElement(By.id("output")).getText());
		      
		       //PROMPT BOX(DISMIS)
		       driver.findElement(By.id("promptBox")).click();
			      System.out.println(driver.switchTo().alert().getText()); 
			       driver.switchTo().alert().dismiss();
			       System.out.println(driver.findElement(By.id("output")).getText());
			       driver.close();
	}

}
