package com.tp.objectRepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tp.demo.generic.webdriverutility.WebDriverUtility;

public class VenderPage {
	public WebDriverUtility wutils=new WebDriverUtility();
	WebDriver driver;
	    public VenderPage(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath ="//a[text()='More']")
	    private WebElement moreLink; 
	    
	    @FindBy(name = "Vendors")
	    private WebElement venderLink;
	    
	    @FindBy(xpath ="//img[@onmouseout='fnRemoveWindow();']")
	    private WebElement clickPlusBtn;

		public WebElement getMoreLink() {
			return moreLink;
		}

		public WebElement getVenderLink() {
			return venderLink;
		}
		
	    
	    public WebElement getClickPlusBtn() {
			return clickPlusBtn;
		}

		public void clickOnVender() {
	    	wutils.mouseHoverAndClickElement(driver, moreLink);
	    	venderLink.click();
	    	
	    	
	    }
}
