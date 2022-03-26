package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.pages.BrickSignUpPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BrickSignUpStepDef {

    BrickSignUpPage brickSignUpPage;

    @Given("^user on sign up page$")
    public void userOnSignUpPage() throws Throwable {
        brickSignUpPage.openAt();
    }

    @When("^user click registration button$")
    public void userClickRegistrationButton() throws Throwable {
        brickSignUpPage.click_register_button();
    }

    @Then("^user successfully register$")
    public void userSuccessfullyRegister() throws Throwable {
        assertThat("Popup success not show", brickSignUpPage.ispopupSuccessDisplayed(), equalTo(true));
    }

    @Then("^user see the error message \"([^\"]*)\"$")
    public void userSeeTheErrorMessage(String errorMessage) throws Throwable {
        brickSignUpPage.click_confirm_password();
        assertThat("error message not match", brickSignUpPage.geterrorPasssword(), equalTo(errorMessage));
    }

    @When("^user input password \"([^\"]*)\"$")
    public void userInputPassword(String passwd) throws Throwable {
        brickSignUpPage.input_password(passwd);
    }

    @And("^user input confirm password \"([^\"]*)\"$")
    public void userInputConfirmPassword(String confirm_passwd) throws Throwable {
        brickSignUpPage.input_confirm_password(confirm_passwd);
    }

    @When("^user click login link on sign up page$")
    public void userClickLoginLinkOnSignUpPage() throws Throwable {
        brickSignUpPage.click_login_link();
    }

    @Then("^user successfully direct to Login page$")
    public void userSuccessfullyDirectToLoginPage() throws Throwable {
        String loginUrl = "https://brick-qa-assignment.herokuapp.com/login";
        assertThat("error message not match", brickSignUpPage.getLoginUrl(), equalTo(loginUrl));
    }

    @When("^user input first name \"([^\"]*)\"$")
    public void userInputFirstName(String first_name) throws Throwable {
        brickSignUpPage.input_first_name(first_name);
    }

    @And("^user input last name \"([^\"]*)\"$")
    public void userInputLastName(String last_name) throws Throwable {
        brickSignUpPage.input_last_name(last_name);
    }

    @And("^user input email \"([^\"]*)\"$")
    public void userInputEmail(String email) throws Throwable {
        brickSignUpPage.input_email(email);
    }

    @And("^user input phone number \"([^\"]*)\"$")
    public void userInputPhoneNumber(String phone) throws Throwable {
        brickSignUpPage.input_phone_number(phone);
    }

    @And("^user input address \"([^\"]*)\"$")
    public void userInputAddress(String address) throws Throwable {
        brickSignUpPage.input_address(address);
    }
}
