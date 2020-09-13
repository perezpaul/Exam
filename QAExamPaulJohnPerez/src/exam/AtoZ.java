package exam;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AtoZ {
	
	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\63948\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://ap-empire.agentimage.com/properties/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-listings\"]/div[1]/div[2]/select/option[5]")));
		Thread.sleep(3000);
		AtoZ AtoZ = new AtoZ();
		AtoZ.sortByAtoZ(driver, wait);
	}
	
	public void sortByAtoZ (WebDriver driver, WebDriverWait wait) throws InterruptedException {
		Select sortBy = new Select (driver.findElement(By.xpath("//*[@id=\"content-listings\"]/div[1]/div[2]/select")));
		sortBy.selectByVisibleText("A-Z");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-listings\"]/div[1]/div[2]/select/option[5]")));
		Thread.sleep(3000);
	}

}
