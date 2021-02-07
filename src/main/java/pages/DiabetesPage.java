package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage {
	
	@FindBy (id="label-no")
	private WebElement nobtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	public DiabetesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check5()
	{
		nobtn.click();
		nxtbtn.click();
	}
	
	
}