package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class BrickSignUpPage extends PageObject {

    @Step
    public void openAt() {
        openAt("https://brick-qa-assignment.herokuapp.com/");
    }

    @FindBy(id = "firstName")
    private WebElementFacade firstName;

    @FindBy(id = "lastName")
    private WebElementFacade lastName;

    @FindBy(id = "email")
    private WebElementFacade email;

    @FindBy(id = "phoneNumber")
    private WebElementFacade phoneNumber;

    @FindBy(id = "address")
    private WebElementFacade address;

    @FindBy(id = "password")
    private WebElementFacade password;

    @FindBy(id = "confirm_password")
    private WebElementFacade confirmPassword;

    @FindBy(name = "register")
    private WebElementFacade registerButton;

    @FindBy(xpath = "//a[contains(text(),'Login']")
    private WebElementFacade loginLink;

    @FindBy(xpath = "//body/div[2]/div[1]")
    private WebElementFacade popupSuccess;

    @FindBy(xpath = "//button[contains(text(),'OK']")
    private WebElementFacade popupOKBtn;

    @FindBy(id = "password-error")
    private WebElementFacade passwordError;


    public void input_first_name(String first_name) {
        firstName.sendKeys(first_name);
    }

    public void input_last_name(String last_name) {
        lastName.sendKeys(last_name);
    }

    public void input_email(String new_email) {
        email.sendKeys(new_email);
    }

    public void input_phone_number(String phone_number) {
        phoneNumber.sendKeys(phone_number);
    }

    public void input_address(String alamat) {
        address.sendKeys(alamat);
    }

    public void input_password(String Password) {
        password.sendKeys(Password);
    }

    public void input_confirm_password(String confirm_passwd) {
        confirmPassword.sendKeys(confirm_passwd);
    }

    public void click_register_button() {
        registerButton.click();
    }

    public void click_login_link() {
        loginLink.click();
    }

    public Boolean ispopupSuccessDisplayed() {
        return popupSuccess.isDisplayed();
    }

    public String geterrorPasssword() {
        return passwordError.getText();
    }

    public void click_confirm_password() {
        confirmPassword.click();
    }

    public void click_password() {
        password.click();
    }

    public String getLoginUrl() {
        return getDriver().getCurrentUrl();
    }

}
