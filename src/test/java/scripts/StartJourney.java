package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.PartnerPage;
import pages.PregorBirthPage;
import pages.SavingsPage;
import pages.TaxcreditsPage;
import pages.WarPensionerPage;
import pages.CarehomePage;
import pages.CountryPage;
import pages.DOBPage;
import pages.DiabetesPage;
import pages.GlaucomaPage;
import pages.HomePage;
//import pages.SelectionPage;
//import pages.PartnerPage;


public class StartJourney extends BaseTest {
	@Test
	public void test2()
	{
		HomePage h=new HomePage(driver);
		
		CountryPage c=new CountryPage(driver);
		
		DOBPage d = new DOBPage(driver);
		
		PartnerPage p = new PartnerPage(driver);
		TaxcreditsPage t = new TaxcreditsPage(driver);	
		PregorBirthPage pb = new PregorBirthPage(driver);
		WarPensionerPage wp = new WarPensionerPage(driver);
		DiabetesPage dp = new DiabetesPage(driver);
		GlaucomaPage g = new GlaucomaPage(driver);
		CarehomePage cp = new CarehomePage(driver);
		SavingsPage s = new SavingsPage(driver);
		
		h.startjourney();
		
		c.countryjrney();
	
		d.dobdetails(Propertyfile.getpropertyfiledata("day"),Propertyfile.getpropertyfiledata("month"),Propertyfile.getpropertyfiledata("year"));
		
		p.check1();
		t.check2();
		pb.check3();
		wp.check4();
		dp.check5();
		g.check6();
		cp.check7();
		s.check8();
		
	}

}
