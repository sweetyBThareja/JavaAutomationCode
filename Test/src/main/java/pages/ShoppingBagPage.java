package pages;

import framework.Config;
import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextBlock;

public class ShoppingBagPage extends Page {

    private static final String URL = Config.getUrl() + "/cart";
    private static final By VERIFY_By = By.cssSelector("div.wc-proceed-to-checkout a");

    @Name("Checkout  Button")
    @FindBy(css="div.wc-proceed-to-checkout a")
    public TextBlock checkoutButton;
}
