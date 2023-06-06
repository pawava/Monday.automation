package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IAddToCartPage;
import pageinterface.IProductPage;


public class ChristieCookieProductTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieProductTest.class);
    private IProductPage iProductPage;
    private  IAddToCartPage iAddToCartPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iAddToCartPage=initPlatformPage(iAddToCartPage,"AddToCartPageAction");
        iProductPage = initPlatformPage(iProductPage, "ChristieCookieProductPageAction");
    }

    @Test(priority = 0)
    public void testAddToCartForChristieCookie(){
        iAddToCartPage.clickOnShopLink();
        iProductPage.clickOnProduct();
        iProductPage.verifyIngredients();
        iProductPage.mouseHoverIngredients();

    }
}
