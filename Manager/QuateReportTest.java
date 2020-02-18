package Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_Function.Conveyence_Elemenet;
import Common_Function.Day_Report_Element;
import Common_Function.GRN_And_V_Bellt_Element;
import Common_Function.Indent_And_V_Belt_Element;
import Common_Function.Indent_ConveyorBelt_Element;
import Common_Function.QuateReport_Element;
import Common_Function.Report_Element;
import login_page.login_properties;

public class QuateReportTest {
	WebDriver driver;

	public String expected = null;

	public String actual = null;

	login_properties objlogin;

	Report_Element objReport;

	Day_Report_Element  objDayReport;

	Conveyence_Elemenet objConveyence;

	GRN_And_V_Bellt_Element objGRn;

	Indent_And_V_Belt_Element objIndent;


	@BeforeTest
	public void log_in() throws IOException {

		File file = new File("D:\\new install\\Lakhotia_so\\config.properties");

		FileInputStream fileInput = null;

		fileInput = new FileInputStream(file);

		Properties prop = new Properties();

		prop.load(fileInput);

		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));

		driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
			
		driver.manage().window().maximize();

		objlogin = new login_properties (driver);
		
		objlogin.setusername(prop.getProperty("mgrusername"));

		objlogin.setpassword(prop.getProperty("mgrpassword"));

		objlogin.clicklogin();

		String expectedtitle = "Lakhotia";

		String actualTitle = driver.getTitle();
		
		System.out.println("title"+driver.getTitle());
		
		Assert.assertEquals(actualTitle, expectedtitle);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}


	/*@Test(priority=1)
	public void MyConveyence_TEST() {

		objReport = new Report_Element(driver);

		objReport.Click_My_Conveyence();

		objReport.Clicl_view_MYBill();

		objReport.Click_CloseView();
	 */
	@Test(priority=7)
	public void Conveyence_TESt() {

		objConveyence = new Conveyence_Elemenet(driver);

		objConveyence.ClickConveyance();

		String expectedcoveyence = "liConveyance";

		String actualcoveyence = driver.getTitle();

		objConveyence.EnterStartingKM("100");

		objConveyence.EnterEndKM("300");

		objConveyence.selectSpeedMeter_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test(priority=8)
	public void Conveyence_otherExpenses1_2() {

		objConveyence.EnterOtherExpenses1_name("exp1 Tea");

		objConveyence.EnterOtherExpenses1_Amount("50");

		objConveyence.selectOtherExpense1_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objConveyence.EnterOtherExpenses2_name("Exp2 Petrol");

		objConveyence.EnterOtherExpenses2_Amount("100");

		objConveyence.selectOtherExpense2_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);



	}

	@Test(priority=9)
	public void Conveyence_otherExpenses3_4() {

		objConveyence.EnterOtherExpenses3_name("Exp3 Food");

		objConveyence.EnterOtherExpenses3_Amount("200");

		objConveyence.selectOtherExpense3_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objConveyence.EnterOtherExpenses4_name("Exp4 stationary");

		objConveyence.EnterOtherExpenses4_Amount("20");

		objConveyence.selectOtherExpense4_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		//objConveyence.ClickSubmit();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		/*Alert Alt = driver.switchTo().alert();

		Alt.accept();
		 */
		//objlogin.LogoutClick();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

/*	@Test
	(priority=10)
	public void RE_login(){

		Properties prop = new Properties();

		objlogin.setusername(prop.getProperty("mgrusername"));

		objlogin.setpassword(prop.getProperty("mgrpassword"));

		objlogin.clicklogin();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test(priority=11)
	public void GRN_Report() {

		objGRn = new GRN_And_V_Bellt_Element(driver);

		objGRn.ClickGRN();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objGRn.SelectBrandName("Fenner");

		objGRn.SetAssignBranch();

		objGRn.selectLength_pitch("1100-H");

		objGRn.EnterWitdh("W30");

		objGRn.EnterQTY("10");

		objGRn.EnterBuyPrice("250");

	}
	@Test(priority=12)
	public void GRN_ADD() {

		objGRn.ClickADDbelt();

		objGRn.selectLength_pitch1("1200-H");

		objGRn.EnterWitdh1("W40");

		objGRn.EnterQTY1("5");

		objGRn.EnterBuyPrice1("190");

		objGRn.Clicksubmit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	@Test(priority=13)
	public void V_Belt_TEST() {

		objGRn.ClickV_Belt();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objGRn.SelectBrandName("Fenner");

		objGRn.SetAssignBranch();

		objGRn.selectLength_pitch("1000-11M");

		objGRn.EnterQTY("10");

		objGRn.EnterBuyPrice("250");
	}

	@Test(priority=14)
	public void V_Belt_ADD() {

		objGRn.ClickADDbelt();

		objGRn.selectLength_pitch1("2000-3/11M");

		objGRn.EnterQTY1("5");

		objGRn.EnterBuyPrice1("190");

		objGRn.Clicksubmit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
*/
	}




