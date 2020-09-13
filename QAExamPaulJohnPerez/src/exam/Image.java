package exam;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class Image{
	

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\63948\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,30);
	driver.get("https://ap-empire.agentimage.com/properties/");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-listings\"]/div[1]/div[2]/select")));
	Thread.sleep(2000);
	Image imageswide = new Image();
	imageswide.widthimages(driver, wait);
}

public void widthimages (WebDriver driver, WebDriverWait wait) throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-listings\"]/div[1]/div[2]/select")));
	WebElement imagesold = driver.findElement(By.xpath("//*[@id=\"content-listings\"]/ul[2]/li[1]/div[1]/a/img"));
	String imgsoldwidth = imagesold.getAttribute("width");
	
	if(imgsoldwidth.contentEquals("300")){
		System.out.println("Image 1 width is "+imgsoldwidth+":PASSED");
		}
		else{
		System.out.println("Image 1 width is "+imgsoldwidth+":FAILED");
		}
	Thread.sleep(1000);
	
	for(int a=2;a<=6;a++){
		WebElement image = driver.findElement(By.xpath("//*[@id=\"content-listings\"]/ul[2]/li["+a+"]/div[1]/a/img"));
		String imgwidth = image.getAttribute("width");
		
		if(imgwidth.contentEquals("300")){
			System.out.println("Image "+a+" width is "+imgwidth+":PASSED");
			}
			else{
			System.out.println("Image "+a+" width is "+imgwidth+":FAILED");
			}
	Thread.sleep(2000);
	}
}

}