package Common_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Indent_ConveyorBelt_Element {
	WebDriver driver;

	By Indent_ToolBar1 = By.id("dbIndent");

	By ConveyorBelt = By.id("liCIndent");

	By SAP_Code = By.id("ContentPlaceHolder1_txtType");

	By Belt_Thickness_DropDown = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[3]"
			+ "/div/div[2]/div/table/tbody/tr[1]/td[2]/div/button/span[1]");

	By Belt_Thickness = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[3]/div/div[2]"
			+ "/div/table/tbody/tr[1]/td[2]/div/div/ul/li[2]/a");

	By Length = By.id("ContentPlaceHolder1_txtLength");

	By Width = By.id("ContentPlaceHolder1_txtWidth");

	By Submit = By.id("ContentPlaceHolder1_lnkSubmit");

	By Clear = By.id("ContentPlaceHolder1_lnkReset");

	public Indent_ConveyorBelt_Element (WebDriver driver) {

		this.driver = driver;

	}

	public void Click_indent_Conveyor() {

		WebElement INDENT = driver.findElement(Indent_ToolBar1);

		Actions action = new Actions(driver);

		action.moveToElement(INDENT).build().perform();

		driver.findElement(ConveyorBelt).click();
	}

	public void Enter_SAPCODE(String entSapcode) {
		WebElement Enter_Sap_code = driver.findElement(SAP_Code);

		Enter_Sap_code.sendKeys(entSapcode);

		Enter_Sap_code.sendKeys(Keys.DOWN.ENTER);
	}

	public void select_BeltThickness() {

		WebElement BeltThickness = driver.findElement(Belt_Thickness_DropDown);

		BeltThickness.click();

		Actions action = new Actions(driver);

		action.moveToElement(BeltThickness).build().perform();

		driver.findElement(Belt_Thickness).click();
		
		

	}
	
	

	public void Enter_Length(String entlength) {

		WebElement setLength = driver.findElement(Length);

		setLength.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		setLength.sendKeys(entlength);
	}

	public void Enter_Width(String Entwidth) {

		WebElement width = driver.findElement(Width);

		width.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		width.sendKeys(Entwidth);

		
	}

	public void Click_Submit() {

		driver.findElement(Submit).click();
	}

	public void Click_Clear() {

		driver.findElement(Clear).click();
	}

}
