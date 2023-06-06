package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IAddToCartPage;
import pageinterface.IGeneralPage;
import pageinterface.IShopPage;

public class ChristieCookieShopPageTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieShopPageTest.class);
    private IShopPage iShopPage;
    private IAddToCartPage iAddToCartPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iShopPage = initPlatformPage(iShopPage, "ChristieCookieShopPageAction");
        iAddToCartPage = initPlatformPage(iAddToCartPage, "AddToCartPageAction");
    }

    @Test(priority = 0)
    public void testShopPageForChristieCookie(){
        iAddToCartPage.clickOnShopLink();
        iShopPage.FromTheKitchenLink();
        iShopPage.moreLink();



    }


}

