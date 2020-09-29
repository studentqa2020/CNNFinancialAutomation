package com.generic.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ModulesValidation {
	
	String[] reqmodules = { "markets", "tech", "media", "success", "perspectives", "videos" };

	
	public void getModules(WebDriver driver) {
		
		List<WebElement> appmodules = driver.findElements(By.xpath("(//*[@class='sc-cSHVUG bYPcOh'])[1]/li"));
		System.out.println("Modules number from req = " + reqmodules.length);
		System.out.println("Modules number from application = " + appmodules.size());

		Assert.assertEquals(appmodules.size(), reqmodules.length);
		
								
		appmodules.forEach(m -> { //>>>>> Application modules name
			for (String s : reqmodules) {//>>>>>Req modules name

				if(m.getAttribute("data-section").contains(s)) {
					System.out.println("Found application modules name = "+m.getAttribute("data-section") + "  Req modules name ="+ s);
					Assert.assertTrue(m.getAttribute("data-section").contains(s),"Test passed>> found modules name");
				}
				
			}	
		});
	}

}
