package com.facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
  
	public WebDriver driver;
	
	public void openUrl() {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation_QE7\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	}
	
	public void userName(String uName) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uName);
	}
	
	public void password(String pass) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	
	}
	
	public void loginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void verifyLogin() {
		System.out.println("Login Successfully");
	}
	
	public void createNewAccount() {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	}
	
	public void verifySignup() {
		System.out.println("Signup Successfully");
	}
}
