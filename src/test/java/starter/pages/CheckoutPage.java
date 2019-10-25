package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class CheckoutPage extends PageObject {
    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    private WebElementFacade CheckoutButton;

    @FindBy(xpath = "//div[@class='subheader']")
    private WebElementFacade YourInformationText;

    @FindBy(id = "first-name")
    private WebElementFacade FirstName;

    @FindBy(id = "last-name")
    private WebElementFacade LastName;

    @FindBy(id = "postal-code")
    private WebElementFacade PostalCode;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    private WebElementFacade ContinueBtn;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    private WebElementFacade FinishBtn;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElementFacade Complete;

    public void click_checkout_btn() {
        CheckoutButton.click();
    }

    public boolean get_information_page() {
        return YourInformationText.waitUntilVisible().isVisible();
    }

    public void input_first_name(String firstName) {
        FirstName.type(firstName);
    }

    public void input_last_name(String lastName) {
        LastName.type(lastName);
    }

    public void input_postal_code(String postalCode) {
        PostalCode.type(postalCode);
    }

    public void click_continue_btn() {
        ContinueBtn.click();
    }

    public void click_finish_btn() {
        FinishBtn.click();
    }

    public boolean get_complete_text() {
        return Complete.waitUntilVisible().isVisible();
    }
}
