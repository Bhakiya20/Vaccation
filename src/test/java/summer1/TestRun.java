package summer1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Pom.Pom;

import summertravel.VaccationBase;

public class TestRun extends VaccationBase {
	
	WebDriver driver=null;
	Pom p=new Pom();
	@Test(priority = 0)
	public void browser() {
	browserLaunch("chrome");

	}
	@Test(priority = 1)
	public void url() {
		launchingUrl("https://www.goibibo.com/");

	}
	@Test(priority = 2)
	public void click() {
		clickOnElement(p.getsp().getClose());
	}
	@Test(priority = 3)
	public void click1() {
		clickOnElement(p.getsp().getTo());
	}
	@Test(priority = 4)
	
	public void input() {
		userInput(p.getsp().getText(), "madurai");
		mouseClick(p.getsp().getMadurai());
	}

}
