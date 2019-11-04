package Gmailsignup_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	@FindBy(xpath="(//span[.='Create account'])[1]")
	private WebElement Cralnk;
	
	@FindBy(xpath="(//div[.='For myself'])[1]")
	private WebElement Frbtn;
	
	@FindBy(id="firstName")
	private WebElement FNtbox;
	
	@FindBy(id="lastName")
	private WebElement LNtbox;
	
	@FindBy(id="username")
	private WebElement UNtbox;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//input[@name='ConfirmPasswd']")
	private WebElement Cpwdtbox;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement Nxtbtn;
	
	@FindBy(id="phoneNumberId")
	private WebElement Phntbox;
	
	public Signup(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void GM_CR(){
		Cralnk.click();
	}
	public void GM_FR(){
		Frbtn.click();
	}
	public void GM_FN(String fn)
	{
		FNtbox.sendKeys(fn);
	}
	
	public void GM_LN(String ln)
	{
		LNtbox.sendKeys(ln);
	}
	
	public void GM_UN(String UN){
		UNtbox.sendKeys(UN);
	}
	public void GM_pwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void GM_Cpwd(String Cpwd)
	{
		Cpwdtbox.sendKeys(Cpwd);
	}
	public void GM_nxt()
	{
		Nxtbtn.click();
		
	}
	
	public void GM_phnum(String phn)
	{
		Phntbox.sendKeys(phn);
	}

	
}
