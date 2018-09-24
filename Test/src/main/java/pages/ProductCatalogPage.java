package pages;

import framework.Config;
import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextBlock;

import java.util.List;
import java.util.Random;

public class ProductCatalogPage extends Page {
    private static final String URL = Config.getUrl() + "dress&post_type=product";
    private static final By VERIFY_BY = By.id("woocommerce-product-search-field");

    @Name("Searched Element")
    @FindBy(id="woocommerce-product-search-field")
    public static TextBlock searchedKeyword;

    @Name("Product list")
    @FindBy(css = ".noo-product-inner")
    public List<TextBlock> productList;



    public void selectRandomProduct(){
        Random random = new Random();
        productList.get(random.nextInt(productList.size()-1)).click();

    }
}
