package starter.pages;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    DuckDuckGoHomePage duckDuckGoHomePage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        duckDuckGoHomePage.open();
    }
}
