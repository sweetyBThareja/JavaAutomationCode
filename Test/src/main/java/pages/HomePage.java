package pages;

import framework.Config;
import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextBlock;


public class HomePage extends Page {

    public static final String URL = Config.getUrl();
    public static final By VERIFY_BY = By.cssSelector("a.noo-search.icon_search");

   @FindBy(css="a.noo-search.icon_search")
    public TextBlock searchicon;

   @FindBy(className = "form-control")
   public TextBlock searchBox;

    @FindBy(className = "icon_bag_alt")
    public TextBlock bagIcon;

    @Name("Search Button")
    @FindBy(css="")
    public TextBlock searchButton;
}


