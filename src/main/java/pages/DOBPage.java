package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOBPage {
	@FindBy(id="dob-day")
	private WebElement daytab;
	
	@FindBy (id="dob-month")
	private WebElement monthtab;
	
	
	@FindBy (id="dob-year")
	private WebElement yeartab;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	public DOBPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void dobdetails(String day, String month, String year)
	{
		daytab.sendKeys(day);
		monthtab.sendKeys(month);
		yeartab.sendKeys(year);
		nxtbtn.click();
	}
}