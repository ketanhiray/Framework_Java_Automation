package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

@SuppressWarnings("unused")
public class BookingPage extends TestBase {

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	//ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip
	
	@FindBy(id = "ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")
	private WebElement twoways;
	
	@FindBy(id = "ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
	private WebElement destination;

	@FindBy(xpath = "//a[@value='PNQ']")
	private WebElement pune;

	@FindBy(xpath = "(//a[@value='AMD'])[2]")
	WebElement amd;

	@FindBy(xpath = "//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")
	private WebElement dates;

	@FindBy(id = "custom_date_picker_id_1")
	private WebElement date1;

	@FindBy(className = "ui-state-default")
	private List<WebElement> dateiner;

	// ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit

	@FindBy(id = "ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")
	private WebElement submit;

	// ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT
	@FindBy(id = "ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")
	private WebElement Arrivalplace;

	@FindBy(className = "selected-label")
	private WebElement oneway;

	@FindBy(xpath = "//*[@id='familyandfriendsdiscount']/strong/em")
	private WebElement familyandfriendsdiscount;

	@FindBy(xpath = "//*[@id='RoundTrip']/label")
	private WebElement RoundTrip;
	// *[@id=\"TripPlanner\"]/label

	@FindBy(xpath = "//*[@id='TripPlanner']/label")
	private WebElement TripPlanner;
	
	////*[@id=\"defense\"]/strong/em
	
	@FindBy(xpath = "//*[@id='defense']/strong/em")
	private WebElement defenselabel;
	
	/*
	 	
	
	 */

//Methods	
	

	public WebElement TwoWays_Selection() {

		return twoways;
	}
	public WebElement Destination_Selection() {

		return destination;
	}

	public WebElement pune() {

		return pune;
	}

	public WebElement amd() {

		return amd;

	}

	public WebElement dates() {

		return dates;

	}

	public WebElement date1() {

		return date1;

	}

	public WebElement dateinner() {

		@SuppressWarnings("unchecked")
		List<WebElement> date3 = dateiner;
		int count = date3.size();
		for (int i = 0; i < count; i++) {
			String text = date3.get(i).getText();
			if (text.contentEquals("22")) {
				date3.get(i).click();
				break;

			}

			// return (WebElement) date2;
		}  
		return  (WebElement) dateiner;
	}

	public WebElement submit() {

		return submit;

	}

	public WebElement oneway() {

		return oneway;

	}

	public WebElement familyandfriendsdiscounlabel() {

		return familyandfriendsdiscount;
	}

	public WebElement Check_PlaceHolder_DepartureCity() {

		return destination;

	}

	public WebElement Check_PlaceHolder_ArrivalCity() {

		return Arrivalplace;

	}

	public WebElement Check_RoundTrip_Label() {

		return RoundTrip;
	}

	public WebElement Check_Multicity_Label() {

		return TripPlanner;
	}
	
	public WebElement Check_Defence_Label() {
	return defenselabel;
	}
}
