package pages;

import framework.Config;
import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import panel.HeaderPanel;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;


public class ProductDetailPage extends Page {
    private static final String URL = Config.getUrl() + "/product";
    private static final By VERIFY_BY = By.cssSelector("button.single_add_to_cart_button");

    public HeaderPanel headerPanel;

    @Name("AddToCart Button")
    @FindBy(css="button.single_add_to_cart_button")
    public Button addToCartButton;
}
