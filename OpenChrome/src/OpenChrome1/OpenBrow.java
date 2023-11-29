package OpenChrome1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrow {

	public static void main(String[] args) throws InterruptedException {

		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Main folder\\Automation_testing\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create an instance of ChromeDriver

		ChromeOptions co = new ChromeOptions();

		co.setBinary("C:\\Users\\Administrator\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		// Navigate to a website (e.g., Google)
		driver.get("https://app.themunim.com/dashboard");
		
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div[1]/p/button")).click();

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("santosh.jadhav@identixweb.in");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("developer");

		System.out.println("Login successfully");

		Thread.sleep(1500);
		
		 // Get and print the current URL
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Current URL: " + currentUrl);

		

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div[1]/div[4]/div[1]/button"))
				.click();

		Thread.sleep(1000);
		// Select dropdown value

		driver.get("https://app.themunim.com/account");

		System.out.println("Account opened");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div[1]/div[2]/button[2]")).click();

		// Close the browser
		// driver.quit();
		driver.close();
		
		

	}

	private static void switchTo() {
		// TODO Auto-generated method stub
		
	}

}
