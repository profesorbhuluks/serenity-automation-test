package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.pages.BrickLoginPage;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BrickLoginStepDef {

    BrickLoginPage brickLoginPage;

    @Given("^user on brick login page$")
    public void userOnBrickLoginPage() throws Throwable {
        brickLoginPage.openAt();
    }

    @When("^user correct email and password$")
    public void userCorrectEmailAndPassword() throws Throwable {
        brickLoginPage.input_username();
        brickLoginPage.input_passwd();
    }

    @Then("^user successfully login$")
    public void userSuccessfullyLogin() throws Throwable {
        assertThat("error message not match", brickLoginPage.isLogoutBtnDisplayed(), equalTo(TRUE));
    }

    @When("^user input unverified email and password$")
    public void userInputUnverifiedEmailAndPassword() throws Throwable {
        brickLoginPage.input_unverified_username();
        brickLoginPage.input_unverified_passwd();
    }

    @Then("^user see error message \"([^\"]*)\"$")
    public void userSeeErrorMessage(String errorLogin) throws Throwable {
        assertThat("error message not match", brickLoginPage.getErrorLogin(), equalTo(errorLogin));
    }

    @And("^user click Login button on brick login page$")
    public void userClickLoginButtonOnBrickLoginPage() throws Throwable {
        brickLoginPage.click_login();
    }
}
