package Test.CTR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfclick {
	
	public static void main (String args[]) throws IOException
	{
		
				
				 //Create File In D: Driver. 
				String TestFile = "C:\\delete.txt"; 
				File FC = new File(TestFile);        //Created object of java File class. 
				FC.createNewFile(); //Create file.
				
				
				 //Reading from file. 
				//Create Object of java FileReader and BufferedReader class. 
				FileReader FR = new FileReader(TestFile); 
				BufferedReader BR = new BufferedReader(FR); 
				String Content = ""; 
				
				
				// open browser
				
				WebDriver driver = new FirefoxDriver ();
				driver.get ("http://snapdeal.com");
				
				
				//Loop to read all lines one by one from file and print It. 
				
				while((Content = BR.readLine())!= null)
				{ 
					
			     	driver.findElement(By.id("inputValEnter")).sendKeys(Content);
					driver.findElement(By.id("inputValEnter")).sendKeys(Keys.ENTER);
					driver.findElement(By.className("product-image")).click();;
						
				} 
				
				BR.close();
				driver.close();
}
}
