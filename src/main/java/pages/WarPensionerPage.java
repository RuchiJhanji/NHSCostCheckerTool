package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WarPensionerPage {
	
	@FindBy (id="label-no")
	private WebElement nobtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	public WarPensionerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check4()
	{
		nobtn.click();
		nxtbtn.click();
	}
	
	
}