package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Report_Element {
	WebDriver driver;

	By Report_ToolBar = By.id("dbReport");

	By DayReport = By.id("liRptDay");

	By Company_Name = By.id("ContentPlaceHolder1_txtCompanyName");

	By FromDatePOPUp = By.id("ContentPlaceHolder1_imgPopUp1");

	By ToDatePOPUp = By.id("ContentPlaceHolder1_imgPopUp2");

	By Find = By.id("ContentPlaceHolder1_btnSearch");

	By Clear = By.id("ContentPlaceHolder1_btnClear");

	//Employee conveyence

	By liPayment = By.id("liPayment");

	By viewBILL = By.id("ContentPlaceHolder1_rptPayment_lnkView_0");

	By CloseViewBill = By.id("ContentPlaceHolder1_btnClose");

	By Deduction_Amount = By.id("ContentPlaceHolder1_rptPayment_txtDeduction_0");

	By cleard_Bill = By.id("ContentPlaceHolder1_rptPayment_LnkEdit_0");

	//Alert note
	//my Conveyence

	By my_Conveyence = By.id("liConveyanceRpt");

	By view_Bill = By.id("ContentPlaceHolder1_rptPayment_lnkView_0");


	public Report_Element(WebDriver driver) {

		this.driver = driver;

	}
	
	public void Click_Dayreport() {

		WebElement Report = driver.findElement(Report_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(Report).build().perform();

		driver.findElement(DayReport).click();
	}
	
	public void Enter_Company_Name(String Entcompanyname) {
		
		driver.findElement(Company_Name).sendKeys(Entcompanyname);
	}
	
	public void Click_DATE() {
		
		driver.findElement(FromDatePOPUp).click();
		
		driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_1_0")).click();
		
		driver.findElement(ToDatePOPUp).click();
		
		driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_3_3")).click();
	}
	
	public void Click_Find() {
		
		driver.findElement(Find).click();
	}
	
	public void Click_Clear() {
		
		driver.findElement(Clear).click();
	}
	
	public void Click_ConveyenceOS() {

		WebElement Report = driver.findElement(Report_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(Report).build().perform();

		driver.findElement(liPayment).click();
	}
	
	public void Click_View() {
		
		driver.findElement(viewBILL).click();
	}
	 
	public void Click_CloseView() {
		
		driver.findElement(CloseViewBill).click();
	}
	
	public void Eneter_Deduction_Amount(String entDeduction_Amount) {
		
		WebElement amt = driver.findElement(Deduction_Amount);
		
		amt.clear();
		
		amt.sendKeys(entDeduction_Amount);
	}
	
	public void Click_cleardBill() {
		
		driver.findElement(cleard_Bill).click();
	}
	
	public void Click_My_Conveyence() {
		
		WebElement Report = driver.findElement(Report_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(Report).build().perform();

		driver.findElement(my_Conveyence).click();
	}
	
	public void Clicl_view_MYBill() {
		
		driver.findElement(view_Bill).click();
	}
}