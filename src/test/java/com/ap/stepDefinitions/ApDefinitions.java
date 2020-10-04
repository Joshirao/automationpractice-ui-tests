package com.ap.stepDefinitions;

import com.ap.serenitySteps.ApSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ApDefinitions {

    @Steps
    ApSteps apSteps;

    @Given("^I open the automation practice homepage$")
    public void openHomePage() {
        apSteps.openHomePage();
    }

    @When("^I add first product under popular to cart$")
    public void addFirstProductUnderPopular() {
        apSteps.clickFirstProduct();
        apSteps.clickAddToCart();
        apSteps.getMessage(); }

    @When("^I click on continue shopping$")
    public void clickContinueShopping() { apSteps.clickContinueShopping(); }

    @Then("^the product should be displayed$")
    public void isproductDisplayed() { apSteps.isproductDisplayed(); }

    @When("^I add any discounted product under bestseller to cart$")
    public void addFirstProductUnderBestSellerr() {
        apSteps.clickBestSeller();
        apSteps.clickBestSellerFirstProduct();
        apSteps.clickAddToCart();
        apSteps.getMessage(); }

    @When("^I click on Proceed to checkout$")
    public void clickProceedToCheckout() { apSteps.clickProceedToCheckout(); }

    @Then("^the discounted price should appear in cart$")
    public void discountedPriceDisplayedInCart() { apSteps.discountedPriceDisplayedInCart(); }

    @When("^sign in with (.*) and (.*)$")
    public void login(String username, String password) { apSteps.login(username,password); }

    @Then("^address page is displayed$")
    public void addressPageIsDisplayed() { apSteps.addressPageIsDisplayed(); }

    @When("I click on Proceed$")
    public void proceed() { apSteps.proceed(); }

    @Then("^shipping page is displayed$")
    public void shippingPageIsDisplayed() { apSteps.shippingPageIsDisplayed(); }

    @When("I agree to terms and Proceed to checkout$")
    public void agreeAndProceed() {
        apSteps.agreeToTerms();
        apSteps.proceed(); }

    @Then("^payment page is displayed$")
    public void paymentPageIsDisplayed() { apSteps.paymentPageIsDisplayed(); }

    @When("I click on pay by check and confirm my order$")
    public void clickPayByChequeAndProceed() {
        apSteps.clickPayByCheque();
        apSteps.proceed(); }

    @Then("^order is successfully placed$")
    public void orderIsSuccessfullyPlaced() {
        apSteps.orderConfirmationPageIsDisplayed();
        apSteps.orderSuccessMessageIsDisplayed();}

    @When("I click on cart without adding any product$")
    public void clickCart() { apSteps.clickCart();}

    @Then("^the cart is empty message is displayed$")
    public void proceedToCheckoutIsDisplayed() {
            apSteps.cartEmptyMessageIsDisplayed();}

    @When("I click on sign in$")
    public void clickSignInButton() { apSteps.clickSignInButton();}

    @Then("^I see (.*)$")
    public void proceedToCheckoutIsDisplayed(String error) {
        apSteps.loginErrorIsDisplayed(error);}


}
