package com.visionit.internetBanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/v4/");
		dr.findElement(By.name("uid")).sendKeys("mngr301183");
		dr.findElement(By.name("password")).sendKeys("unageta");
		dr.findElement(By.name("btnLogin")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		
		dr.findElement(By.name("name")).sendKeys("ABC");
		dr.findElement(By.xpath("//input[@value='f']")).click();
		dr.findElement(By.id("dob")).sendKeys("25122020");
		dr.findElement(By.name("addr")).sendKeys("The address mentioned");
		dr.findElement(By.name("city")).sendKeys("Pune");
		dr.findElement(By.name("state")).sendKeys("Maharashtra");
		dr.findElement(By.name("pinno")).sendKeys("442001");
		
		dr.findElement(By.name("telephoneno")).sendKeys("987654321");
		dr.findElement(By.name("emailid")).sendKeys("ABCPQR@gmail.com");
		dr.findElement(By.name("password")).sendKeys("ABC@123");
		dr.findElement(By.name("sub")).click();
		

	}

}
