package com.abc.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\CHETHANA\\eclipse-workspace\\DataDrivenFrameWork\\src\\com\\abc\\Utility\\DataDriven.properties");
Properties p=new Properties();
p.load(fis);

String nurl=p.getProperty("url");
 String nemail=p.getProperty("email");
 String npass=p.getProperty("pass");
 System.out.println(nurl);
 System.out.println(nemail);
 System.out.println(npass);
 
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 driver.get(nurl);
 
 driver.findElement(By.xpath("//a[text()='My Account']")).click();
 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(nemail);
 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(npass);
 driver.findElement(By.xpath("//span[text()='Login']")).click();
 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
 driver.close();



	}

}
