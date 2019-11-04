package Gmailsignup_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_singup {

@Test
	
	public void signup_page() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		Signup Sg=new Signup(driver);
				Sg.GM_CR();
				Thread.sleep(500);
				Sg.GM_FR();
				Thread.sleep(500);
				Sg.GM_FN("Nidhisha");
				Thread.sleep(500);
				Sg.GM_LN("Nidhi");
				Thread.sleep(500);
				Sg.GM_UN("NidhishaNidhi13");
				Thread.sleep(500);
				Sg.GM_pwd("Nidhi1100");
				Thread.sleep(500);
				Sg.GM_Cpwd("Nidhi1100");
				Thread.sleep(500);
				Sg.GM_nxt();
				Thread.sleep(500);
				Sg.GM_phnum("9538862037");
				Thread.sleep(500);
				Sg.GM_nxt();
				
				
}
}
