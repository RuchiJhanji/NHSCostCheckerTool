package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PregorBirthPage {
	
	@FindBy (id="label-yes")
	private WebElement yesbtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	public PregorBirthPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check3()
	{
		yesbtn.click();
		nxtbtn.click();
	}
	
	
}