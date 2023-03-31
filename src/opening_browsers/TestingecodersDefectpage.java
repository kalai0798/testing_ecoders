package opening_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingecodersDefectpage {

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
		
		String expectedtitle = "Ecoders-testcase";
		if (expectedtitle.equals(title)) {
			System.out.println("Title matched test case pass");
		} else {
			System.out.println("Title is not matching test case pass");
		}
		

	}

}
