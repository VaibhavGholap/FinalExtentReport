package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.basePackage.BaseClass;
import com.extentManager.ExtentManager;

public class OrangeHRMTest extends BaseClass {
	
	@Test
	public void loginPageTest() throws InterruptedException {
		Thread.sleep(4000);
		WebElement imgElement=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Assert.assertTrue(imgElement.isDisplayed());
	}
	@Test
	public void loginTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        String expectedTitle="OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void sampleCase() {
		ExtentManager.test.createNode("Validation1");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation2");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation3");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation4--changes--");
		Assert.assertTrue(true);
	}
}
