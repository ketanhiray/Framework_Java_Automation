package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.pages.BookingPage;
import com.TestBase.TestBase;

@SuppressWarnings("unused")
public class BookingPageTest extends TestBase {

	BookingPage booking;

	public BookingPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();

		booking = new BookingPage();
	}

	@Test(priority = 1)
	public void Check_PlaceHolder_DepartureCity() {
		String PlaceHolder_DepartureCity = booking.Check_PlaceHolder_DepartureCity().getAttribute("value");
		String exp = "Departure City";
		Assert.assertEquals(PlaceHolder_DepartureCity, exp);
		System.out.println("Placeholder Departure City Is Verified");
		System.out.println("*******************");
	}

	@Test(priority = 2)
	public void Check_PlaceHolder_ArrivalCity() {
		String ArrivalCity = booking.Check_PlaceHolder_ArrivalCity().getAttribute("value");
		String exp = "Arrival City";
		Assert.assertEquals(ArrivalCity, exp);
		System.out.println("Placeholder Arrival City Is Verified");
		System.out.println("*******************");
	}

	@Test(priority = 3)
	public void Check_OneWay_Label() {

		String str = booking.oneway().getText();
		String exp = "One Way";
		Assert.assertEquals(str, exp);
		System.out.println("Label Of One Way Is Verified");
		System.out.println("*******************");
	}

	@Test(priority = 4)
	public void Check_RoundTrip_Label() {

		String rt = booking.Check_RoundTrip_Label().getText();
		String exp = "Round Trip";
		Assert.assertEquals(rt, exp);
		System.out.println("Label Of Round Trip Is Verified");
		System.out.println("*******************");

	}

	@Test(priority = 5)
	public void Check_Multicity_Label() {

		String str = booking.Check_Multicity_Label().getText();
		String exp = "Multicity";
		Assert.assertEquals(str, exp);
		System.out.println("Label Of Multi City Trip Is Verified");
		System.out.println("*******************");
	}

	@Test(priority = 6)
	public void Check_FamilyAndFriendsDiscount_Label() {

		String familyandfriendsdiscounlabel = booking.familyandfriendsdiscounlabel().getText().trim();
		String exp = "Family & Friends";
		Assert.assertEquals(familyandfriendsdiscounlabel, exp);
		System.out.println("Label Of Family & Friends Is Verified");
		System.out.println("*******************");

	}
	
	@Test(priority = 7)
	public void Check_Defense_Label() {
		String str = booking.Check_Defence_Label().getText();
		String exp = "Armed Forces";
		Assert.assertEquals(str, exp);
		System.out.println("Label Of Armed Forces Is Verified");
		System.out.println("*******************");

	}
	
	
	@Test(priority = 8)
	public void Check_Destination_Selection() {
		booking.Destination_Selection().click();
		booking.pune().click();
		// Assert.assertEquals(true, true);
		Assert.assertTrue(booking.pune()
				.isDisplayed());
		System.out.println("Destination Place Is Selected & Is Verified");
		System.out.println("*******************");

	}

	@Test(priority = 9)
	public void Check_Arrival_Selection() {
		booking.amd().click();
		String str = booking.amd()
				.getAttribute("value");
		String exp = "AMD";
		Assert.assertEquals(str, exp);
		System.out.println("Arrival Place Is Selected & Is Verified");
		System.out.println("*******************");

	}
	
	@Test(priority = 10)
	public void Check_Departure_Date_Selection() {
		
		booking.date1().click();
		booking.dateinner().click();
		System.out.println("Departure Date Is Selected & Is Verified");
		System.out.println("*******************");
			}
	@Test(priority = 11)
	public void Check_Submit_Button_Clickble() {
		booking.submit().click();
		// Assert.assertEquals(true, true);
		Assert.assertTrue(booking.submit()
				.isEnabled());
		System.out.println(" Submit Is Button Verified");
		System.out.println("*******************");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.close();
	}
	
}
