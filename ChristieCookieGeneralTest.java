package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IGeneralPage;

public class ChristieCookieGeneralTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieGeneralTest.class);
    private IGeneralPage igeneralPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        igeneralPage = initPlatformPage(igeneralPage, "GeneralPageAction");
    }

    @Test(priority = 0)
    public void testGeneralPageForChristieCookie(){
        igeneralPage.clickOnSearch();
        igeneralPage.enterSearchText(prop.getProperty("searchText"));
        igeneralPage.verifySearch(prop.getProperty("searchText"));
        igeneralPage.verifySearchResult(prop.getProperty("Result"));
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyThanksgiving();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyHalloweenTreats();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifySweetThankYou();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyBirthdaySurprise();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifySportsFan();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyCarePackage();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyGoodCause();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyHolidayGift();
        igeneralPage.switchToUrl(prop.getProperty("homePageUrl"));
        igeneralPage.clickOnDropDown();
        igeneralPage.verifyMyBestFriend();




    }


}
