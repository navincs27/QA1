package com.QA1Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_QA1_Goibibo.base.BaseClass;

public class Hotel_Page_Search extends BaseClass {
	public Hotel_Page_Search() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//input[@type='radio'])[1]")     //select india radio button in the hotel page
	private WebElement indiaRadioBtn;              
	public WebElement getIndiaRadioBtn() {
		return indiaRadioBtn;
	}
	@FindBy(id="downshift-1-input")                  //for searching hotels, input(sendkeys)
	private WebElement hotelSearchBox;
	private WebElement getHotelSearchBox() {
		return hotelSearchBox;
	}                                                               //checkin
	@FindBy(xpath="//div[@data-testid='openCheckinCalendar']")     //to open the calender
	private WebElement open_Check_In_Calender;
	public WebElement getOpen_Check_In_Calender() {
		return open_Check_In_Calender;
	}                                                     
	@FindBy(xpath=("//span[text()='19'])[2]"))            //to select date, to change the date just select the text 19 and put your desired date and check [2] wheather it is correct on the dom 
	private WebElement selectDate;
	public WebElement getSelectDate() {
		return selectDate;
	}
	@FindBy(xpath="//div[text()='Check-out']")            //to open calender for checkout
	private WebElement open_Check_Out_Calender;
	public WebElement getOpen_Check_Out_Calender() {
		return open_Check_Out_Calender;
	}
	@FindBy(xpath="(//div[@class='SearchBlockUIstyles__SearchInputWrap-sc-fity7j-11 hfiFam'])[2]/input")
	private WebElement guestAndRooms;                      //to click on the guest&rooms to provide adults count and room count
	public WebElement getGuestAndRooms() {
		return guestAndRooms;
	}
  @FindBy(xpath="(//span[text()='+'])[1]")    // TO ADD MULTIPLE ROOMS
  private WebElement addRooms;
  public WebElement getAddRooms() {
	  return addRooms;
  }
  @FindBy(xpath="(//span[text()='+'])[2]")   // TO ADD NO.OF ADILTS
  private WebElement addAdults;
  public WebElement getAddAdults() {
	  return addAdults;
  }
  @FindBy(xpath="(//span[text()='+'])[3]")   // TO ADD NO.OF CHILDRENS
  private WebElement addChildrens;
  public WebElement getAddChildrens() {
	  return addChildrens;
  }
  @FindBy(xpath="//button[text()='Done']")  //AFTER SLECTION OF THE COUNT OF ROOMS, ADULTS, CHILDRENS
  private WebElement afterSelectingDoneBtn;  
  public WebElement getAfterSelectingDoneBtn() {
	  return afterSelectingDoneBtn;
  }
  @FindBy(xpath="//button[text()='Search']")  // FOR SEARCHING THE HOTEL RESULTS
  private WebElement searchResult;
  public WebElement getSearchResult() {
	  return searchResult;
  }

}
