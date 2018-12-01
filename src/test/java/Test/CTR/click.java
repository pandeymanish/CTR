package Test.CTR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;


public class click {

	public static void main(String args[]) throws IOException,
			InterruptedException {

		// Create File In D: Driver.
		String TestFile = "C:\\delete.txt";
		File FC = new File(TestFile); // Created object of java File class.
		FC.createNewFile(); // Create file.

		// Reading from file.
		// Create Object of java FileReader and BufferedReader class.
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";

		// Loop to read all lines one by one from file and print It.

		while ((Content = BR.readLine()) != null) {
			
			// open browser

			WebDriver driver = new FirefoxDriver();
			driver.get("http://m.snapdeal.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='js-focus-search']"));
			driver.findElement(By.xpath("//input[@id='js-focus-search']"))
					.sendKeys(Content);
			System.out.println(Content);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='searchModal']/div[1]/span[2]/span")).click();		
			System.out.println("Here 2");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='app-shell']/div[3]/div[1]/a[1]/div")).click();
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			driver.close();

		}

		BR.close();
		
	}

}
