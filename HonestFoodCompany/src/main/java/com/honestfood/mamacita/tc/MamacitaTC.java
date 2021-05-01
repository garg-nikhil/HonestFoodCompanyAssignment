package com.honestfood.mamacita.tc;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.honestfood.mamacita.testbase.TestBase;

public class MamacitaTC extends TestBase{
	public static Logger log = Logger.getLogger(TestBase.class);
	
	@Test
	public void addMamaCitaProductToCart() {
		driver.get(""+getURL());
		log.info("Launching the website:- "+getURL());
		
		driver.findElement(By.xpath("//a[@href='/speisekarte/mamacita/kagranerplatz/' and @class='button-home is--primary']")).click();
		log.info("Clicking on mamacita order now button:-");
		
		driver.findElement(By.xpath("//button[@class='buybox--button ']")).click();
		
	}

}
