package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElement UserName;

    @FindBy(id = "password")
    private WebElementFacade Password;

    @FindBy(className = "btn_action")
    private WebElement Login;

    @FindBy(id = "shopping_cart_container")
    private WebElementFacade CartIcon;


    public void username(String user_nama) {
        UserName.sendKeys(user_nama);
    }

    public void password(String password) {
        Password.type(password);
    }

    public void loginBtn() {
        Login.click();
    }

    public boolean get_cart() {
        return CartIcon.withTimeoutOf(20, TimeUnit.SECONDS).waitUntilVisible().isVisible();
    }

    public void click_cart() {
        CartIcon.click();
    }

}