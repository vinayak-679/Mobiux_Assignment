import org.openqa.selenium.By;

public class GmailPage {
    public static By composeEmailButton = By.xpath("//div[@class='z0']/div");
    public static By toAddress = By.xpath("//input[@peoplekit-id='BbVjBd']");
    public static By generatedName = By.xpath("//div[@class='agJ aFw bjE']");
    public static By subject = By.xpath("//input[@name='subjectbox']");
    public static By body = By.xpath("//div[@role='textbox']");
    public static By threeDotMenu = By.xpath("//div[@class='J-JN-M-I J-J5-Ji Xv L3 T-I-ax7 T-I']/div[@class='J-J5-Ji J-JN-M-I-JG']");
    public static By label = By.xpath("//div[@class='J-Ph Gi J-N']/div");
    public static By socialLabel = By.xpath("//div[@class='J-LC'][1]/div");
    public static By sendButton = By.xpath("//div[@class='dC']/div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");
    public static By socialLabelTab = By.xpath("//div[@aria-label='Social']/div[@class='aKw']");
    public static By refreshButton = By.xpath("//div[@aria-label='Refresh']/div");
    public static By starIcon = By.xpath("//div[@class='yW']/span[@class='bA4']/span[text()='me']/ancestor::td/preceding-sibling::td[@class='apU xY']/span");
    public static By firstMessage = By.xpath("//div[@class='yW']/span[@class='bA4']/span[text()='me']");
    public static By subjectOfTheMail = By.xpath("//div[@class='ha']/h2");
    public static By bodyOfTheMail = By.xpath("//div[@class='ii gt'][1]/div[@class='a3s aiL ']");
}
