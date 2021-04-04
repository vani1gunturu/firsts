import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
	


		WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vani\\Downloads\\chromedriver.exe");
      driver.get("https://www.google.com");
	}

}
