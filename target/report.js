$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/home/eclipse-workspace/CucumberWebsite/src/test/resources/ecommerce.feature");
formatter.feature({
  "name": "Automation of E-Commerce Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@e2e"
    }
  ]
});
formatter.scenario({
  "name": "Opening E-Commerce Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@e2e"
    },
    {
      "name": "@officework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.search_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the required product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_the_required_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add the selected product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_the_selected_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cancel the pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.cancel_the_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Cart at top right",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_the_Cart_at_top_right()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose view cart \u0026 checkout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.choose_view_cart_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Continue Checkout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.continue_Checkout()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div/button[text()\u003d\u0027Continue checkout\u0027]\"}\n  (Session info: chrome\u003d81.0.4044.129)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HOME-PC\u0027, ip: \u0027192.168.43.244\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.129, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\home\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50228}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2a3b8871a661979c41d9077dd8f1f973\n*** Element info: {Using\u003dxpath, value\u003d//div/button[text()\u003d\u0027Continue checkout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.steps.LibraryClass.ClickButton(LibraryClass.java:34)\r\n\tat com.steps.StepDefinition.continue_Checkout(StepDefinition.java:74)\r\n\tat ✽.Continue Checkout(file:/C:/Users/home/eclipse-workspace/CucumberWebsite/src/test/resources/ecommerce.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select Checkout as guest",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_Checkout_as_guest()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Fill Customer details",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Mobile Number"
      ]
    },
    {
      "cells": [
        "Arokiya Renit",
        "D",
        "reni.renny12@gmail.com",
        "0987333136"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.fill_Customer_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Tick the privacy policy",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.tick_the_privacy_policy()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Proceed to delivery preference",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.proceed_to_delivery_preference()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Click and Collect",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_Click_and_Collect()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter area",
  "rows": [
    {
      "cells": [
        "Caroline Springs"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_area(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter area using robot class",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_area_using_robot_class()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select set as my store",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_set_as_my_store()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter billing address",
  "rows": [
    {
      "cells": [
        "12 Caroline Springs Boulevard, Caroline Springs VIC 3023"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.enter_billing_address(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select address using keyboard function",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_address_using_keyboard_function()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select proceed to payment",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_proceed_to_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Card Details",
  "rows": [
    {
      "cells": [
        "Card Number",
        "2253645956573"
      ]
    },
    {
      "cells": [
        "Month Expiry",
        "11"
      ]
    },
    {
      "cells": [
        "Year Expiry",
        "2023"
      ]
    },
    {
      "cells": [
        "CVV",
        "234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_Card_Details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click pay now",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_pay_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});