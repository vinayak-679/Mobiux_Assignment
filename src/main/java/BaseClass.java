import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    String emailId = "testmail121212123@gmail.com";
    String password = "Test@123456";

    public BaseClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raks\\Downloads\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?cid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7Va2QWMmlTX695VVirazR0Kh665PuRREOxfqg30H22ldyRf1tbehUfCeWVvPXwoIEZAD36HTw&osid=1&passive=1209600&service=mail");
        System.out.println(driver.getTitle());
    }

    public void sendKeys(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void verifyAssert(By locator,String expected){
        Assert.assertEquals(driver.findElement(locator).getText().trim(),expected);
    }

    public void loginToGmail() {
        sendKeys(By.id("identifierId"), emailId);
        click(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
        sendKeys(By.xpath("//input[@name='Passwd']"),password);
        click(By.id("passwordNext"));
    }
}
