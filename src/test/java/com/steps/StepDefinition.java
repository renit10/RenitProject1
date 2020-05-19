package com.steps;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibraryClass{

@Given("Enter website")
public void enter_website() {
    LoadWebsite();
}

@Given("Search Product")
public void search_Product() throws InterruptedException {
	EcommerceObjectClass obj = new EcommerceObjectClass();
    SearchProduct("Chair",obj.getSearchBox());
    Thread.sleep(2000);
}

@Given("Click search button")
public void click_search_button() throws InterruptedException {
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getClickSearchBox());
    
}

@Given("Select the required product")
public void select_the_required_product() throws InterruptedException {
	Thread.sleep(7000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getSelectProduct());
    
}

@Given("Add the selected product to cart")
public void add_the_selected_product_to_cart() throws InterruptedException {
	Thread.sleep(10000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getSelectAddToCart());
    
}

@Given("Cancel the pop-up")
public void cancel_the_pop_up() throws InterruptedException {
	Thread.sleep(10000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getFrameCancel());
    
}

@Given("Select the Cart at top right")
public void select_the_Cart_at_top_right() throws InterruptedException {
	Thread.sleep(8000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getInitialCart());
    
}

@Given("Choose view cart & checkout")
public void choose_view_cart_checkout() throws AWTException, InterruptedException {
	Thread.sleep(7000);
    KeyMethod(2, 3);
    
}

@Given("Continue Checkout")
public void continue_Checkout() throws InterruptedException {
	Thread.sleep(40000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getContinueCheckout());
    
}

@Given("Select Checkout as guest")
public void select_Checkout_as_guest() throws InterruptedException {
	Thread.sleep(25000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
    ClickButton(obj.getGuestLogin());
    
}

@When("Fill Customer details")
public void fill_Customer_details(io.cucumber.datatable.DataTable twodmap) throws InterruptedException {
	Thread.sleep(2000);
    List<Map<String, String>> customerDetails = twodmap.asMaps();
    EcommerceObjectClass obj = new EcommerceObjectClass();
    SearchProduct(customerDetails.get(0).get("First Name"), obj.getFirstName());
    SearchProduct(customerDetails.get(0).get("Last Name"), obj.getLasttName());
    SearchProduct(customerDetails.get(0).get("Email"), obj.getEmailId());
    SearchProduct(customerDetails.get(0).get("Mobile Number"), obj.getPhoneNo());
}

@When("Tick the privacy policy")
public void tick_the_privacy_policy() throws InterruptedException {
    Policy();
    
}

@When("Proceed to delivery preference")
public void proceed_to_delivery_preference() throws InterruptedException {
	Thread.sleep(2000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
	ClickButton(obj.getProceedToDelivery());
	 
}

@When("Select Click and Collect")
public void select_Click_and_Collect() throws InterruptedException {
	Thread.sleep(8000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
	ClickButton(obj.getClickAndCollect());
}

@When("Enter area")
public void enter_area(io.cucumber.datatable.DataTable onedlist) throws InterruptedException {
    List<String> li = onedlist.asList();
    EcommerceObjectClass obj = new EcommerceObjectClass();
    SearchProduct(li.get(0), obj.getEnterArea());
    
}

@When("Enter area using robot class")
public void enter_area_using_robot_class() throws AWTException, InterruptedException {
	Thread.sleep(4000);
   KeyMethod(4, 5);
   
}

@When("Select set as my store")
public void select_set_as_my_store() throws InterruptedException {
	Thread.sleep(8000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
	ClickButton(obj.getSetAsMyStore());
	Thread.sleep(8000);
}

@Then("Enter billing address")
public void enter_billing_address(io.cucumber.datatable.DataTable onedlist1) throws InterruptedException {
    List<String> li1 = onedlist1.asList();
    EcommerceObjectClass obj = new EcommerceObjectClass();
    SearchProduct(li1.get(0), obj.getBillingAddress());
    Thread.sleep(4000);
}

@Then("Select address using keyboard function")
public void select_address_using_keyboard_function() throws AWTException, InterruptedException {
	KeyMethod(6, 1);
	Thread.sleep(6000);
}

@Then("Select proceed to payment")
public void select_proceed_to_payment() throws InterruptedException {
	EcommerceObjectClass obj = new EcommerceObjectClass();
	ClickButton(obj.getProceedPayment());
	Thread.sleep(20000);
	MoveToFrame(obj.getSwitchFrame());
}

@Then("Enter Card Details")
public void enter_Card_Details(io.cucumber.datatable.DataTable onedmap) throws InterruptedException {
	Thread.sleep(10000);
	Map<String, String> mi = onedmap.asMap(String.class, String.class);
    EcommerceObjectClass obj = new EcommerceObjectClass();
    SearchProduct(mi.get("Card Number"), obj.getCardNumber());
    SearchProduct(mi.get("Month Expiry"), obj.getCardExpiryDate());
    SearchProduct(mi.get("Year Expiry"), obj.getCardExpiryYear());
    SearchProduct(mi.get("CVV"), obj.getCvvNumber());
    
}

@Then("Click pay now")
public void click_pay_now() throws InterruptedException {
	Thread.sleep(2000);
	EcommerceObjectClass obj = new EcommerceObjectClass();
	ClickButton(obj.getPayNow());
	Thread.sleep(2000);
}




}
