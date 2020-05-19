package com.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommerceObjectClass extends LibraryClass{
	public EcommerceObjectClass() {
		PageFactory.initElements(driver, this);
	}
	//Initial page
	@FindBy(name = "search-box")
	private WebElement searchBox;
	
	@FindBy(xpath = "//div[@class='SearchBox__SearchIconContainer-sc-18e4eak-1 jFkZNx']")
	private WebElement clickSearchBox;
	
	@FindBy(xpath = "//div[@class='ForcedEnterLocationModal__CloseModal-hvmo27-5 DkCEp']")
	private WebElement cancelPopup1;
	
	public WebElement getCancelPopup1() {
		return cancelPopup1;
	}

	public WebElement getClickSearchBox() {
		return clickSearchBox;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	//product select page
		@FindBy(xpath = "//div[text()='Acton Medium Back Mesh Chair Grey']")
		private WebElement selectProduct;
		
		@FindBy(xpath = "//span[@class='Button__ButtonLabel-e6xond-2 iSQymL']")
		private WebElement selectAddToCart;
		
		@FindBy(xpath = "//button[@aria-label='Close']")
		private WebElement frameCancel;
		
		
		public WebElement getSelectAddToCart() {
			return selectAddToCart;
		}

		public WebElement getSelectProduct() {
			return selectProduct;
		}

		public WebElement getFrameCancel() {
			return frameCancel;
		}
		
	//Initial Cart Page
	@FindBy(xpath = "//div[@class='NavTiles__Tile-pa5y9k-1 dunDws']")
	private WebElement initialCart;
	
	@FindBy(xpath = "//div/button[text()='Continue checkout']")
	private WebElement continueCheckout;
	
	@FindBy(xpath = "//div[text()='Continue checkout as guest']")
	private WebElement guestLogin;
	
	public WebElement getInitialCart() {
		return initialCart;
	}
	public WebElement getContinueCheckout() {
		return continueCheckout;
	}
	public WebElement getGuestLogin() {
		return guestLogin;
	}
	
	//Billing Page
	@FindBy(xpath = "(//div[@class='Delivery__FlexWrapper-h0cxw3-2 ffwfjj'])[2]")
	private WebElement clickAndCollect;
	
	@FindBy(xpath = "//input[@placeholder='Enter your suburb or postcode']")
	private WebElement enterArea;
	
	@FindBy(xpath = "(//button[@class='sc-bdVaJa sc-EHOje hvKtgi Button__BaseButton-e6xond-0 juspqu'])[1]")
	private WebElement setAsMyStore;
	
	@FindBy(id = "downshift-0-input")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//button[text()='Proceed to payment']")
	private WebElement proceedPayment;
	
	public WebElement getClickAndCollect() {
		return clickAndCollect;
	}

	public WebElement getEnterArea() {
		return enterArea;
	}

	public WebElement getSetAsMyStore() {
		return setAsMyStore;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getProceedPayment() {
		return proceedPayment;
	}
	
	//Customer details
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "lastName")
	private WebElement lasttName;
	
	@FindBy(name = "email")
	private WebElement emailId;
	
	@FindBy(name = "mainPhone")
	private WebElement phoneNo;
	
	@FindBy(xpath = "(//input[@class='sc-bdVaJa sc-dnqmqq Checkbox__CheckboxInput-wqzv8w-1 dfwbaN'])[3]")
	private WebElement readPolicy;
	
	@FindBy(xpath = "//div/button[text()='Proceed to delivery preferences']")
	private WebElement proceedToDelivery;
	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLasttName() {
		return lasttName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getReadPolicy() {
		return readPolicy;
	}

	public WebElement getProceedToDelivery() {
		return proceedToDelivery;
	}
	
	//Switch Frame
	@FindBy(id = "checkout-credit-card")
	private WebElement switchFrame;
	
	public WebElement getSwitchFrame() {
		return switchFrame;
	}
	
	//Card Details
	@FindBy(xpath = "//input[@class='form-control card-number-input']")
	private WebElement cardNumber;
	
	@FindBy(xpath = "//select[@class='form-control expiry-month-input']")
	private WebElement cardExpiryDate;
	
	@FindBy(xpath = "//select[@class='form-control expiry-year-input']")
	private WebElement cardExpiryYear;
	
	@FindBy(xpath = "//input[@class='form-control cvv-input']")
	private WebElement cvvNumber;
	
	@FindBy(xpath = "//input[@class='button primary pay-now_button']")
	private WebElement payNow;
	
	public WebElement getPayNow() {
		return payNow;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardExpiryDate() {
		return cardExpiryDate;
	}

	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	
}
