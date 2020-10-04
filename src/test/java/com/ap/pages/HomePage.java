package com.ap.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class HomePage extends PageObject {

    @FindBy(css = "a.homefeatured")
    private WebElementFacade popular;

    @FindBy(css = "a.blockbestsellers")
    private WebElementFacade bestSellers;

    @FindBy(css = "a.product-name")
    private List<WebElementFacade> products;

    @FindBy(xpath = "//span[@itemprop='price']")
    private List<WebElementFacade> prices;

    @FindBy(xpath = "//span[.='Add to cart']")
    private WebElementFacade addToCart;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    private WebElementFacade quantity;

    @FindBy(xpath = "//div[@class='product-image-container layer_cart_img']/preceding-sibling::h2")
    private WebElementFacade messageHolder;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElementFacade continueShopping;

    @FindBy(css = "span.ajax_block_products_total")
    private WebElementFacade cartPrice;

    @FindBy(css = "#email")
    private WebElementFacade email;

    @FindBy(css = "#passwd")
    private WebElementFacade password;

    @FindBy(xpath = "//p[@class='lost_password form-group']/following-sibling::p/button/span")
    private WebElementFacade signin;

    @FindBy(css = "a.login")
    private WebElementFacade signinButton;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/a/span")
    private WebElementFacade proceedToCheckout2;

    @FindBy(xpath = "//div[@class='button-container']/a/span")
    private WebElementFacade proceedToCheckout;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/button/span")
    private WebElementFacade proceed;

    @FindBy(xpath = "//p[@class='checkbox']/div/span")
    private WebElementFacade checkBox;

    @FindBy(css = "a.cheque")
    private WebElementFacade payByCheque;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElementFacade sucessMessage;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElementFacade message;

    @FindBy(css = "span.navigation_page")
    private WebElementFacade nextPage;

    @FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
    private WebElementFacade loginError;

    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    private WebElementFacade cart;

    public void clickFirstProduct(String tabname) {
        getDriver().findElement(By.xpath("//ul[@id='" + tabname + "']/li[1]/div[1]/div[2]/h5[1]/a[1]")).click();
        this.addToCart.waitUntilClickable();
    }

    public void clickAddToCart()  {
        this.addToCart.click();
        this.proceedToCheckout.waitUntilClickable();
    }

    public void clickBestSeller()  { this.bestSellers.click(); }

    public void clickProceedToCheckout()  {
        this.proceedToCheckout.click();
        this.proceedToCheckout2.waitUntilClickable();
        this.proceedToCheckout2.click();
        this.proceedToCheckout2.waitUntilNotVisible();
    }

    public void proceed()  {
        this.proceed.click();
        this.nextPage.waitUntilVisible();
    }

    public void agreeToTerms()  { this.checkBox.click(); }

    public void clickCart()  {
        this.cart.click();
        this.nextPage.waitUntilVisible();}

    public void clickSignInButton() {
        this.signinButton.waitUntilClickable();
        this.signinButton.click();
    }

    public void login(String name, String pass)  {
        this.email.click();
        this.typeInto(email,name);
        this.password.click();
        this.typeInto(password,pass);
        this.signin.click();
    }

    public void clickContinueShopping()  {
        this.continueShopping.click();
        this.continueShopping.waitUntilNotVisible();
    }

    public void clickPayByCheque()  {
        this.payByCheque.click();
        this.nextPage.waitUntilVisible();
    }

    public boolean isProductAddedMessageDisplayed()  { return this.messageHolder.getText().equals("Product successfully added to your shopping cart"); }

    public String getDiscountedPrice()  { return this.prices.get(0).getText(); }

    public boolean discountedPriceDisplayedInCart()  { return this.cartPrice.getText().equals(getDiscountedPrice()); }

    public boolean isproductDisplayed()  { return this.addToCart.isDisplayed(); }

    public boolean pageIsDisplayed(String pagename)  { return this.nextPage.getText().equals(pagename); }

    public boolean orderSuccessMessageIsDisplayed()  { return this.sucessMessage.getText().equals("Your order on My Store is complete."); }

    public boolean cartEmptyMessageIsDisplayed()  { return this.message.getText().equals("Your shopping cart is empty."); }

    public boolean loginErrorIsDisplayed(String error)  {
        this.loginError.waitUntilVisible();
        return this.loginError.getText().contains(error); }

}