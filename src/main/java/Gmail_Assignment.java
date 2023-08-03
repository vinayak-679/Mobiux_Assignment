import org.testng.annotations.Test;

public class Gmail_Assignment extends BaseClass {
    @Test
    public void validateGmail() throws InterruptedException {
        String subject = "Test Mail";
        String body = "Test Mail Body";
        //Login to the gmail
        loginToGmail();
        //Clicking on the Compose button
        click(GmailPage.composeEmailButton);
        //Entering the To Address
        sendKeys(GmailPage.toAddress,emailId);
        click(GmailPage.generatedName);
        //Clicking and Entering Subject
        click(GmailPage.subject);
        sendKeys(GmailPage.subject,subject);
        //Clicking and Entering the Mail Body
        click(GmailPage.body);
        sendKeys(GmailPage.body,body);
        //Labeling the Email as 'Social'
        click(GmailPage.threeDotMenu);
        click(GmailPage.label);
        click(GmailPage.socialLabel);
        //Clicking on the Send button
        click(GmailPage.sendButton);
        Thread.sleep(5000);
        //Clicking on the Social tab to verify recently sent Email come under the 'Social' Label
        click(GmailPage.socialLabelTab);
        Thread.sleep(3000);
        //Refreshing the page
        click(GmailPage.refreshButton);
        //Marking the Email as Starred
        click(GmailPage.starIcon);
        //Opening the received email
        click(GmailPage.firstMessage);
        //Comparing the Subject and Body of the Received Email
        verifyAssert(GmailPage.subjectOfTheMail,subject);
        verifyAssert(GmailPage.bodyOfTheMail,body);
        driver.close();
    }
}
