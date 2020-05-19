@e2e
Feature: Automation of E-Commerce Website

  @officework
  Scenario: Opening E-Commerce Website
    Given Enter website
    And Search Product
    And Click search button
    
    And Select the required product
    And Add the selected product to cart
    And Cancel the pop-up
    And Select the Cart at top right
    And Choose view cart & checkout
    And Continue Checkout
    And Select Checkout as guest
    When Fill Customer details
      | First Name    | Last Name | Email                  | Mobile Number |
      | Arokiya Renit | D         | reni.renny12@gmail.com |    0987333136 |
    And Tick the privacy policy
    And Proceed to delivery preference
    And Select Click and Collect
    And Enter area
      | Caroline Springs |
    And Enter area using robot class
    And Select set as my store
    Then Enter billing address
      | 12 Caroline Springs Boulevard, Caroline Springs VIC 3023 |
    And Select address using keyboard function
    And Select proceed to payment
    And Enter Card Details
      | Card Number  | 2253645956573 |
      | Month Expiry |            11 |
      | Year Expiry  |          2023 |
      | CVV          |           234 |
    And Click pay now
