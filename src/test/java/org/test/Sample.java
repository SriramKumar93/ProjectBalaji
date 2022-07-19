package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailbtn = driver.findElement(By.id("email"));
		emailbtn.sendKeys("balaji");
		WebElement passwordbtn = driver.findElement(By.id("pass"));
		passwordbtn.sendKeys("654321");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}
	

}
