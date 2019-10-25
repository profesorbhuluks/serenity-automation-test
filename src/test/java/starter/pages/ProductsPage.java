package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsPage extends PageObject {
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    private WebElementFacade Item;

    @FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
    private WebElementFacade AddToCartBtn;

    @FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
    private WebElementFacade BadgesCart;


    @FindBy(xpath = "//button[@class='btn_secondary btn_inventory']")
    private WebElementFacade RemoveBtn;

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    private WebElementFacade CartPage;


    public void add_to_cart_btn() {
        AddToCartBtn.click();
    }

    public boolean get_badges_on_cart() {
        return BadgesCart.waitUntilVisible().isVisible();
    }

    public boolean get_remove_btn() {
        return RemoveBtn.waitUntilVisible().isVisible();
    }

    public boolean get_cart_page() {
        return CartPage.waitUntilVisible().isVisible();
    }


}
