package com.honestfood.mamacita.tc;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.honestfood.mamacita.testbase.TestBase;

public class MamacitaTC extends TestBase {
	public static Logger log = Logger.getLogger(TestBase.class);

	@Test
	public void addMamaCitaProductToCart() throws InterruptedException {
		
		driver.get("" + getURL());
		log.info("Launching the website:-"+driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//button[@class='agree-cookie']")).click();
		log.info("accepting the cookie");

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(""+size);
		
		driver.findElement(By.xpath("//div[@class='restaurant--description left']//a[@class='button-home is--primary'][1]")).click();
		log.info("Clicking on mamacita order now button:-");
		
		driver.findElement(By.xpath("//input[@name='road']")).sendKeys("Seidengasse 44, 1070 Wien, Austria");
		log.info("Adding the address:-");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='buybox--button ']")).click();
		log.info("Adding my fav item to cart:- ");
		log.info("Currently browsing " + driver.getTitle() + "menu");

		driver.findElement(By.xpath("//button[@name='In den Warenkorb']")).click();
		log.info("Finalizing my order before ordering to cart:-");

		String str = driver.findElement(By.xpath("//div[@class='platform-content']")).getText();
		log.info("While placing the order user is facing error as:- " + str);

	}

}
