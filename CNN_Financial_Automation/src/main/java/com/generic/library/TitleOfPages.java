package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.master.pagefactory.MasterPageFactory;
import com.util.HighLighter;

public class TitleOfPages{



	public static void getTitle(WebDriver driver) throws InterruptedException {
		MasterPageFactory	 pf = PageFactory.initElements(driver, MasterPageFactory.class);
		String TitleBeforeClick = driver.getTitle();
		System.out.println("Found title before click = " + TitleBeforeClick);
		Thread.sleep(3000);
		System.out.println("Totla page number = " + pf.getAllpage().size());
		// ExplicitWait.getMyWait(driver, pf.getAllpage().get(0));
		for (int i = 0; i < pf.getAllpage().size(); i++) {

			while (true) {// never stop===> infinite time

				if (pf.getAllpage().size()> 0) {
					HighLighter.getMultiColor(driver, pf.getAllpage().get(i), i);
					String pageName = pf.getAllpage().get(i).getText();
					//ExplicitWait.getMyWait(driver, pf.getAllpage().get(i));
					pf.getAllpage().get(i).click();// ...............................................................Click
					System.out.println("Click here.............");
					try {
						Thread.sleep(3000);
						//ExplicitWait.getMyTitle(driver,"CNN");
					} catch (InterruptedException e1) {
						
					}
				
					// wait...............for market
					
					System.out.println(" Page  title = "+driver.getTitle() );
					if (driver.getTitle() != null
							&& !driver.getTitle().contains(TitleBeforeClick)) {
						
						for (AllMyPageTitle myEnum : AllMyPageTitle.values()) {
							if (pageName.toUpperCase().contains(myEnum.toString())) {
								System.out.println("Found my Title = " + driver.getTitle());
								//TakeAppScreenShot.captureScreenShot(driver, pageName);
								//Log.screenShot(driver, pageName);
								Assert.assertEquals(driver.getTitle(), myEnum.getTitle());
							}
						}
						break;// break the while loop
					}else {
						
						try {
							System.out.println("Need to wait...............");
							Thread.sleep(3000);
						} catch (InterruptedException e) {
						
					}
					 } 
					  }
				       }

			if (i == 0) {
				driver.get("https://www.cnn.com/BUSINESS");

			}

		}

	}

}
