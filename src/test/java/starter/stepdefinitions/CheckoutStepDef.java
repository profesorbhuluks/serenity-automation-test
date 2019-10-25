package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.CheckoutSteps;

public class CheckoutStepDef {

    @Steps
    CheckoutSteps loginSteps;


    @Given("^user on login page$")
    public void userOnLoginPage() {
        loginSteps.homePage();
    }

    @When("^user type \"([^\"]*)\" on username filed$")
    public void userTypeOnUsernameFiled(String user_name) {
        loginSteps.enter_username(user_name);
    }

    @And("^user type \"([^\"]*)\" on password field$")
    public void userTypeOnPasswordField(String password) {
        loginSteps.enter_password(password);
    }

    @And("^user click login button$")
    public void userClickLoginButton() {
        loginSteps.click_login();
    }

    @Then("^User should on Products page$")
    public void userOnProductsPage() {
        loginSteps.get_cart_icon();
    }

    @When("^user on product page add one item to shopping cart$")
    public void useraddoneitemtoshoppingcart() {
        loginSteps.addItemToCart();
    }


    @And("^User should see badges on cart$")
    public void userShouldSeeBadgesOnCart() {
        loginSteps.getBadgesOnCart();
    }

    @And("^user should see remove button on selected item$")
    public void userShouldSeeRemoveButtonOnSelectedItem() {
        loginSteps.getRemoveBtn();
    }

    @And("^User click cart icon$")
    public void userClickCartIcon() {
        loginSteps.clickCart();
    }

    @Then("^User should on cart page$")
    public void userShouldOnCartPage() {
        loginSteps.getCartPage();
    }

    @When("^user click checkout button$")
    public void userClickCheckoutButton() {
        loginSteps.clickCheckoutBtn();
    }

    @Then("^user should see your information page$")
    public void userShouldSeeYourInformationPage() {
        loginSteps.informationPage();
    }

    @And("^user should fill first name by \"([^\"]*)\"$")
    public void userShouldFillFirstNameBy(String firstName) {
        loginSteps.inputFirstName(firstName);
    }

    @And("^user should fill last name by \"([^\"]*)\"$")
    public void userShouldFillLastNameBy(String lastName) {
        loginSteps.inputLastName(lastName);
    }

    @And("^user should fill zip code by \"([^\"]*)\"$")
    public void userShouldFillZipCodeBy(String postalCOde) {
        loginSteps.inputPostalCode(postalCOde);
    }

    @And("^user should click continue button$")
    public void userShouldClickContinueButton() {
        loginSteps.clickContinueBtn();
    }

    @And("^click finish button$")
    public void clickFinishButton() {
        loginSteps.clickFinishBtn();
    }

    @And("^should see ponny express$")
    public void shouldSeePonnyExpress() {
        loginSteps.getPonyExpres();
    }
}
