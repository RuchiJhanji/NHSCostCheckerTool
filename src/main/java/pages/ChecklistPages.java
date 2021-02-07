package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChecklistPages {
	@FindBy(xpath="//input[@value='Yes']")
	private WebElement yesbtn;
	
	@FindBy (id="next-button")
	private WebElement nxtbtn;
	
	@FindBy (id="label-no")
	private WebElement nobtn;
	
	
	public ChecklistPages(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void check1()
	{
		yesbtn.click();
		nxtbtn.click();
	}
	
	public void check2()
	{
		nobtn.click();
		nxtbtn.click();
	}
}