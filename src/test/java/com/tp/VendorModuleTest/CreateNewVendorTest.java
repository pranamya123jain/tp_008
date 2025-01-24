package com.tp.VendorModuleTest;

import org.testng.annotations.Test;

import com.tp.demo.baseutility.BaseClass;
import com.tp.objectRepositoryutility.VenderPage;

public class CreateNewVendorTest extends BaseClass {
@Test
	public void createVendorTest(){
	System.out.println("createVendorTest");
		VenderPage vP=new VenderPage(driver);
		vP.getClickPlusBtn().click();
		System.out.println("open venderPage");
		
		
	}

}
