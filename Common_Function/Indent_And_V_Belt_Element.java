package Common_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Indent_And_V_Belt_Element {
	WebDriver driver;

	By Indent_ToolBar = By.id("dbIndent");

	By Indent = By.id("liindent");

	By Specification = By.xpath("//*[@id=\"ContentPlaceHolder1_txtLength\"]");

	By customerName = By.id("ContentPlaceHolder1_txtCompanyName");

	By Option1 = By.id("ContentPlaceHolder1_rptFenner_lnkFenner_0");

	By option2 = By.id("ContentPlaceHolder1_rptFenner_lnkFenner_3");

	By Width = By.id("ContentPlaceHolder1_txtWidth");

	By Qty = By.id("ContentPlaceHolder1_txtQty");

	By Remark = By.id("ContentPlaceHolder1_txtRemarks");

	By AddMore_Submit = By.id("ContentPlaceHolder1_lnkAddMore"); 

	//IndentReport

	By IndentReport = By.id("lisleeverpt");

	By Delivered = By.id("ContentPlaceHolder1_rptreport_lnkSubmit_1");

	// V_Belt

	By V_Belt = By.id("liPuindent");

	//V_Belt_Report

	By V_Belt_Report = By.id("liPUsleeverpt");

	By V_Options = By.id("ContentPlaceHolder1_rptGates_lnkGates_0");

	By V_options1 = By.id("ContentPlaceHolder1_rptFenner_lnkFenner_0");

	public Indent_And_V_Belt_Element (WebDriver driver) {

		this.driver = driver;

	}

	public void Click_Indent() {

		WebElement INDENT = driver.findElement(Indent_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(INDENT).build().perform();

		driver.findElement(Indent).click();
	}

	public void Select_Specification(String EntSpecification) {


		WebElement Enter_Specification = driver.findElement(Specification);

		Enter_Specification.click();

		Enter_Specification.sendKeys(EntSpecification);

		Enter_Specification.sendKeys(Keys.DOWN.ENTER);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	public void Enter_customerName(String EntcustomerName) {

		WebElement cus_name = driver.findElement(customerName);

		cus_name.sendKeys(EntcustomerName);

		cus_name.sendKeys(Keys.DOWN.ENTER);
	}

	public void Select_Options() {

		driver.findElement(Option1).click();

		driver.findElement(option2).click();
	}

	public void Enter_Width(String EntWidth) {

		WebElement WIDTH = driver.findElement(Width);

		WIDTH.click();

		WIDTH.sendKeys(EntWidth);
	}

	public void Enter_Qty(String EntQty) {

		WebElement EnQty = driver.findElement(Qty);

		EnQty.sendKeys(EntQty);

		EnQty.sendKeys(Keys.ENTER);
	}

	public void Enter_Reamark(String Entreamrk) {

		driver.findElement(Remark).sendKeys(Entreamrk);
	}

	public void ClickaddMore_Submit() {

		driver.findElement(AddMore_Submit).click();
	}

	//Indent Report

	public void Enter_IndentReport() {

		WebElement INDENT = driver.findElement(Indent_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(INDENT).build().perform();

		driver.findElement(IndentReport).click();
	}

	public void Enter_delivered() {

		//driver.findElement(Delivered).click();
	}

	//V_belt

	public void Click_V_Belt() {

		WebElement Vbelt = driver.findElement(Indent_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(Vbelt).build().perform();

		driver.findElement(V_Belt).click();
	}

	public void Click_Voptions() {

		driver.findElement(V_Options).click();
	}

	public void Click_Voptions1() {

		driver.findElement(V_options1).click();
	}

	public void Click_V_Belt_Report() {

		WebElement Vbelt = driver.findElement(Indent_ToolBar);

		Actions action = new Actions(driver);

		action.moveToElement(Vbelt).build().perform();

		driver.findElement(V_Belt_Report).click();
	}

}
