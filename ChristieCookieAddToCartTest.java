package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IAddToCartPage;


public class ChristieCookieAddToCartTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieAddToCartTest.class);
    private IAddToCartPage iAddToCartPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iAddToCartPage = initPlatformPage(iAddToCartPage, "AddToCartPageAction");
    }

    @Test(priority = 0)
    public void testAddToCartForChristieCookie(){
        iAddToCartPage.clickOnShopLink();
        iAddToCartPage.clickOnProductName();
        iAddToCartPage.addItemForChristieCookie(prop.getProperty("Quantity"));
        iAddToCartPage.verifyAddedItemForChristieCookie();
    }
}
