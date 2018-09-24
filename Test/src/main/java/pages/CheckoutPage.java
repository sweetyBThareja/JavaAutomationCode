package pages;

import framework.Config;
import framework.Page;
import org.openqa.selenium.By;

public class CheckoutPage extends Page {

    private static final String URL = Config.getUrl() + "/checkout";
    private static final By VARIFY_By = By.cssSelector("h1.page-title");
}
