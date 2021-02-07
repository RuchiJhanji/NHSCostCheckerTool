package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxcreditsPage {
	
	@FindBy (id="label-no")
	private WebElement nobtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	public TaxcreditsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check2()
	{
		nobtn.click();
		nxtbtn.click();
	}
	
	
}