package MySelen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstCode 
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium-java-4.5.3\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://vctpune.com/");

	}

}
