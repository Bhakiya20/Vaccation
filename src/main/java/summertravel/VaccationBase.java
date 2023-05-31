package summertravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VaccationBase {
	public static WebDriver driver=null;
	public static WebDriver browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhakiyalakshmi\\Desktop\\Eclipse\\2019-12\\Amazon\\Driver\\chromedriver.exe");
			//ChromeOptions cp = new ChromeOptions();
			//cp.addArguments("incognito");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			//driver =new ChromeDriver(cp);
		}else if (value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.driver.gecko","path");
			driver=new FirefoxDriver();
		}else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.driver.edge", "path");
			driver=new EdgeDriver();
			
			
		}
		driver.manage().window().maximize();
		return driver;	
	}
	public static void launchingUrl(String value) {
		driver.get(value);
	}
	public void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static String getText(WebElement element) {
		String xtext=element.getText();
		return xtext;
	}
	public static boolean isDisplayed(WebElement element) {
		boolean display=element.isDisplayed();
		return display;
	}
	
	public static void mouseClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.click(ele);
	}

}
