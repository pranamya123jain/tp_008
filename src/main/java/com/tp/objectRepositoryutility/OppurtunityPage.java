package com.tp.objectRepositoryutility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tp.demo.baseutility.BaseClass;

public class OppurtunityPage extends BaseClass{
	WebDriver driver;
	public OppurtunityPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//a[@href='index.php?module=Potentials&action=EditView&return_action=DetailView&parenttab=Sales']/parent::b")
		private WebElement createOppLink;
		
		public WebElement getCreateOpp() {
			return createOppLink;
		}
		
		@FindBy(xpath="//input[@name='potentialname']")
		private WebElement oppNameTf;
		public WebElement getCreateOppLink() {
			return createOppLink;
		}

		public WebElement getOppNameTf() {
			return oppNameTf;
		}
		
		@FindBy(xpath="//input[@name=\"related_to_display\"]/following-sibling::img[@title=\"Select\"]")
		private WebElement plusIcon;
		public WebElement getPlusIcon() {
			return plusIcon;
		}
		
		@FindBy(xpath="//input[@name=\"related_to_display\"]")
		private WebElement oppTf;
		public WebElement getOppTf() {
			return oppTf;
		}
		
		
		@FindBy(xpath="//input[@name=\"search_text\"]")
		private WebElement popupOrgTf;
		public WebElement getPopupOrgTf() {
			return popupOrgTf;
		}
		
		@FindBy(xpath="//input[@name=\"search\"]")
		private WebElement serachNowBtn;
		public WebElement getSerachNowBtn() {
			return serachNowBtn;
		}
		
		@FindBy(xpath="//a[@id=\"1\"]")
		private WebElement selectOrg;
		
		
		public WebElement getSelectOrg() {
			return selectOrg;
		}
		
		@FindBy(xpath="//td[@class=\"tabUnSelected\"]//a[text()='Opportunities']")
		private WebElement oppLink;

		public WebElement getOppLink() {
			return oppLink;
		}

		public void createOppurtunity() throws InterruptedException
		{
			oppLink.click();
			createOppLink.click();
			oppNameTf.sendKeys("Windchill_4668");
	        plusIcon.click();
	       
			
		}
}

		
		
		
		
	
	


