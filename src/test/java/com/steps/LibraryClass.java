package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibraryClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();
		
	}

	public static void LoadWebsite() {
		driver.get("https://www.officeworks.com.au/");
		driver.manage().window().maximize();
	}

	public static void SearchProduct(String value, WebElement element) {
		element.sendKeys(value);
	}

	public static void ClickButton(WebElement element) {
		element.click();
	}

	// To Click Privacy Policy
	public static void Policy() {
		WebElement policy = driver.findElement(
				By.xpath("(//input[@class='sc-bdVaJa sc-dnqmqq Checkbox__CheckboxInput-wqzv8w-1 dfwbaN'])[3]"));
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", policy);
	}

	// To Switch Frame in Credit Card Page
	public static void MoveToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	// Drop Down for selecting address
	public static void DropDown(String num, WebElement element) {
		Select cardExpiry = new Select(element);
		cardExpiry.selectByValue(num);
	}

	// Robot Class For Keyboard functions
	public static void KeyMethod(int loop, int value) throws AWTException, InterruptedException {
		Robot r = new Robot();

		if (loop == 2) {
			for (int i = 0; i < loop; i++) {
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
			}
		}
		if (value == 1) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void CloseIt() {
		driver.quit();
	}
}
