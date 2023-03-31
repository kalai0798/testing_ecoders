package Checkingurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urltestcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalaiselvan P\\eclipse-workspace\\testing_ecoders\\alljarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/testcase");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String src = driver.getPageSource();
		System.out.println(src);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expectedurl = "http://127.0.0.1:5000/testcase";
		if (expectedurl.equals(url)) {
			System.out.println("url matched test case pass");
		} else {
			System.out.println("url is not matching test case failed");
		}

	}

}
