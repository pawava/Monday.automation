package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.ILoginPage;

public class ChristieCookieLoginTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieLoginTest.class);
    private ILoginPage iLoginPage;


    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iLoginPage = initPlatformPage(iLoginPage, "LoginPageAction");
    }

    @Test(priority = 0)
    public void testLoginForChristieCookie(){
        iLoginPage.verifyFields();
        iLoginPage.verifyMandatoryFields();
        iLoginPage.verifyMandatoryValidations();
        iLoginPage.enterUserName(prop.getProperty("Username"));
        iLoginPage.enterPassword(prop.getProperty("Password"));
        iLoginPage.clickOnLoginButton();
        iLoginPage.clickOnAccountLink();
        iLoginPage.verifyLogin();
    }
}
