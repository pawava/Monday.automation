package monday.com.tests;

import monday.com.TestSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageinterface.IAddToCartPage;
import pageinterface.ICheckoutPage;

public class ChristieCookieCheckOutTest extends TestSession {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristieCookieCheckOutTest.class);
    private IAddToCartPage iAddToCartPage;
    private ICheckoutPage  iCheckOutPage;

    @BeforeClass(alwaysRun = true)
    public void class_objects_setup() throws Exception {
        LOGGER.info("Running Monday.com tests");
        iAddToCartPage = initPlatformPage(iAddToCartPage, "AddToCartPageAction");
        iCheckOutPage = initPlatformPage(iCheckOutPage, "CheckoutPageAction");
    }
    @Test(priority = 0)
    public void testCheckOutForChristieCookie(){

        iCheckOutPage.switchToUrl(prop.getProperty("SubUrl"));
        Assert.assertTrue(iCheckOutPage.verifyOutOfStock(),"Item is in stock");
        iCheckOutPage.switchToUrl(prop.getProperty("Url"));
        iAddToCartPage.clickOnShopLink();
        iAddToCartPage.clickOnProductName();
        //iAddToCartPage.verifyProductPrice();
        //iAddToCartPage.verifyItemQuantityValidation(prop.getProperty("ExceedQuantity"));
        iAddToCartPage.addItemForChristieCookie(prop.getProperty("Quantity"));
        iCheckOutPage.verifyStateBeforeCheckOut();
        iCheckOutPage.verifyZipBeforeCheckOut();
        iCheckOutPage.verifyGroundDeliveryBeforeCheckOut();
        iCheckOutPage.clickOnCheckoutBtn();
        iCheckOutPage.enterEmail();
        iCheckOutPage.enterFirstName(prop.getProperty("FirstName"));
        iCheckOutPage.enterLastName(prop.getProperty("LastName"));
        iCheckOutPage.enterStreetAddress(prop.getProperty("Street"));
        iCheckOutPage.enterCity(prop.getProperty("City"));
        iCheckOutPage.selectState(prop.getProperty("State"));
        iCheckOutPage.enterZip(prop.getProperty("Zip"));
        iCheckOutPage.addGiftMessage(prop.getProperty("From"));
        iCheckOutPage.verifyPaymentMethod();
        iCheckOutPage.verifyTotalPrice();
        iCheckOutPage.clickONPaymentMethod();
        iCheckOutPage.clickOnBillingShippingSameCheckBox();
        iCheckOutPage.enterCardNumber(prop.getProperty("CardNumber"));
        iCheckOutPage.selectMonth(prop.getProperty("Month"));
        iCheckOutPage.selectYear(prop.getProperty("Year"));
        iCheckOutPage.enterCVV(prop.getProperty("CVV"));
        //iCheckOutPage.clickOnPlaceOrderBtn();
        //Assert.assertTrue(iCheckOutPage.verifySuccessMessage(),"Success Message is not display");
    }



}
