package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class BrickLoginPage extends PageObject {

    @Step
    public void openAt() {
        openAt("https://brick-qa-assignment.herokuapp.com/login");
    }

    @FindBy(id = "your_email")
    private WebElementFacade userName;

    @FindBy(id = "password")
    private WebElementFacade password;

    @FindBy(name = "login")
    private WebElementFacade loginBtn;

    @FindBy(id = "swal2-content")
    private WebElementFacade errorLogin;

    @FindBy(name = "logout")
    private WebElementFacade logoutBtn;

    public void input_username() {
        userName.type("brickqa@mailinator.com");
    }

    public void input_passwd() {
        userName.type("password");
    }

    public String getErrorLogin() {
        return errorLogin.getText();
    }

    public void click_login() {
        loginBtn.click();
    }

    public Boolean isLogoutBtnDisplayed() {
        return loginBtn.isDisplayed();
    }

    public void input_unverified_username() {
        userName.type("brick@mailinator.com");
    }

    public void input_unverified_passwd() {
        userName.type("password");
    }

}




