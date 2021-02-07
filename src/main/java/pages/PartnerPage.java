package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage {
	
	
	//@FindBy (xpath="//input[@id='radio-yes']")
	//private WebElement yesbtn;
	
	//@FindBy (xpath="(//input[@type='radio'])[1]")
	//private WebElement yesbtn;
	
	@FindBy (id="label-no")
	private WebElement nobtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	

	
	public PartnerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check1()
	{
		
		nobtn.click();
		nxtbtn.click();
	}
	
	
}