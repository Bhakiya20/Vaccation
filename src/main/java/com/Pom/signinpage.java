package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import summertravel.VaccationBase;

public class signinpage  {
	public WebDriver driver;
	public signinpage(WebDriver driver1) {
	driver1=driver;
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//span[@class='logSprite icClose']")
	private WebElement close;
	
	@FindBy(xpath="(//p[text()='Enter city or airport'])[2]")
	private WebElement to;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement text;
	
	@FindBy(xpath="//span[text()='Madurai, India']")
	private WebElement madurai;
	
	
	public WebElement getMadurai() {
		return madurai;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getText() {
		return text;
	}
	
	
}
