package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IRegistrationPage;

public class ChristieCookieRegisterTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieRegisterTest.class);
    private IRegistrationPage iRegistrationPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iRegistrationPage = initPlatformPage(iRegistrationPage, "RegistrationPageAction");
    }

    @Test(priority = 0)
    public void testRegistrationForChristieCookie(){
        iRegistrationPage.clickOnRegisterButton();
        iRegistrationPage.enterFirstName(prop.getProperty("FirstName"));
        iRegistrationPage.enterLastName(prop.getProperty("LastName"));
        iRegistrationPage.enterEmail();
        iRegistrationPage.enterCity(prop.getProperty("City"));
        iRegistrationPage.selectState(prop.getProperty("State"));
        iRegistrationPage.enterZip(prop.getProperty("Zip"));
        iRegistrationPage.enterStreetAddress(prop.getProperty("Street"));
        iRegistrationPage.enterPassword(prop.getProperty("EnterPassword"));
        iRegistrationPage.enterConfirmPassword(prop.getProperty("ConfirmPassword"));
        iRegistrationPage.clickOnSubmit();
        iRegistrationPage.verifyRegisterAccount();
    }
}
