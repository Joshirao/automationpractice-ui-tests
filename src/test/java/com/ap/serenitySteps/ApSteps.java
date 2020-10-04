package com.ap.serenitySteps;

import com.ap.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ApSteps extends ScenarioSteps {
    private static final String AUTOMATION_PRACTICE_PAGE = "http://automationpractice.com/index.php";

    private HomePage onHomePage() {
        return  getPages().get(HomePage.class);
    }
    @Step
    public void openHomePage() {
        onHomePage().openUrl(AUTOMATION_PRACTICE_PAGE);
    }

    public void clickFirstProduct() { onHomePage().clickFirstProduct("homefeatured"); }

    public void clickBestSellerFirstProduct() { onHomePage().clickFirstProduct("blockbestsellers"); }

    public void clickAddToCart() {
        onHomePage().clickAddToCart();
    }

    public void clickCart() {
        onHomePage().clickCart();
    }

    public void getMessage() { assertThat("Product added message is not displayed", onHomePage().isProductAddedMessageDisplayed(), is(true)); }

    public void isproductDisplayed() { assertThat("Home page is not displayed", onHomePage().isproductDisplayed(), is(true)); }

    public void discountedPriceDisplayedInCart() { assertThat("Discounted price is not displayed in cart", onHomePage().discountedPriceDisplayedInCart(), is(true)); }

    public void login(String username, String password) { onHomePage().login(username,password); }

    public void addressPageIsDisplayed() { assertThat("Address page is not displayed", onHomePage().pageIsDisplayed("Addresses"), is(true)); }

    public void shippingPageIsDisplayed() { assertThat("Shipping page is not displayed", onHomePage().pageIsDisplayed("Shipping"), is(true)); }

    public void paymentPageIsDisplayed() { assertThat("Payment page is not displayed", onHomePage().pageIsDisplayed("Your payment method"), is(true)); }

    public void loginErrorIsDisplayed(String error) { assertThat("Login error is not displayed", onHomePage().loginErrorIsDisplayed(error), is(true)); }

    public void cartEmptyMessageIsDisplayed() { assertThat("Cart empty message is not displayed", onHomePage().cartEmptyMessageIsDisplayed(), is(true)); }

    public void orderConfirmationPageIsDisplayed() { assertThat("order Confirmation page is not displayed", onHomePage().pageIsDisplayed("Order confirmation"), is(true)); }

    public void orderSuccessMessageIsDisplayed() { assertThat("order Success Message is not displayed", onHomePage().orderSuccessMessageIsDisplayed(), is(true)); }

    public void clickContinueShopping() { onHomePage().clickContinueShopping(); }

    public void clickBestSeller() { onHomePage().clickBestSeller(); }

    public void clickProceedToCheckout() { onHomePage().clickProceedToCheckout(); }

    public void clickSignInButton() { onHomePage().clickSignInButton(); }

    public void proceed() { onHomePage().proceed(); }

    public void agreeToTerms() { onHomePage().agreeToTerms(); }

    public void clickPayByCheque() { onHomePage().clickPayByCheque(); }

    public void deleteAllCookies() { getDriver().manage().deleteAllCookies(); }
}
