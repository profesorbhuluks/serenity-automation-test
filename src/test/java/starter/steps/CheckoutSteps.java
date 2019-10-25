package starter.steps;


import net.thucydides.core.annotations.Step;
import starter.pages.CheckoutPage;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSteps {
    LoginPage loginPage;
    ProductsPage productsPage;
    CheckoutPage checkoutPage;

    @Step
    public void homePage() {
        loginPage.openAt("https://www.saucedemo.com/");
    }

    @Step
    public void enter_username(String user_name) {
        loginPage.username(user_name);
    }

    @Step
    public void enter_password(String password) {
        loginPage.password(password);
    }

    @Step
    public void click_login() {
        loginPage.loginBtn();
    }

    @Step
    public void get_cart_icon() {
        loginPage.get_cart();
    }

    @Step
    public void addItemToCart() {
        productsPage.add_to_cart_btn();
    }

    @Step
    public void getBadgesOnCart() {
        productsPage.get_badges_on_cart();
    }

    @Step
    public void getRemoveBtn() {
        productsPage.get_remove_btn();
    }

    @Step
    public void clickCart() {
        loginPage.click_cart();
    }

    @Step
    public void getCartPage() {
        productsPage.get_cart_page();
    }

    @Step
    public void clickCheckoutBtn() {
        checkoutPage.click_checkout_btn();
    }

    @Step
    public void informationPage() {
        Boolean actual = checkoutPage.get_information_page();
        assertThat("Information Page Not Show", actual, equalTo(true));
    }

    @Step
    public void inputFirstName(String firstName) {
        checkoutPage.input_first_name(firstName);
    }

    @Step
    public void inputLastName(String lastName) {
        checkoutPage.input_last_name(lastName);
    }

    @Step
    public void inputPostalCode(String postalCode) {
        checkoutPage.input_postal_code(postalCode);
    }

    @Step
    public void clickContinueBtn() {
        checkoutPage.click_continue_btn();
    }

    @Step
    public void clickFinishBtn() {
        checkoutPage.click_finish_btn();
    }

    @Step
    public void getPonyExpres() {
        Boolean actual = checkoutPage.get_complete_text();
        assertThat("Complete Text Not Show", actual, equalTo(true));
    }
}
