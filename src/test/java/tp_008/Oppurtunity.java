package tp_008;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.tp.demo.baseutility.BaseClass;
import com.tp.objectRepositoryutility.OppurtunityPage;

public class Oppurtunity extends BaseClass{
	@Test
	public void createOpp() throws InterruptedException
	{
		
		OppurtunityPage op=new OppurtunityPage(driver);
		op.createOppurtunity();
	}

}
