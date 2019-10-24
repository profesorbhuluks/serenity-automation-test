package starter.hooks;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupWebDriverHooks {

    public static boolean isInitialized = false;

    @Before
    public void setup() {
        System.out.println("INITIALIZE");
        if (!isInitialized) {
            WebDriverManager.chromedriver().setup();
            isInitialized = true;
        }
    }
}
