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
	}
	
}
