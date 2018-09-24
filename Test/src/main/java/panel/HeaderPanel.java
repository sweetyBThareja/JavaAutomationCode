package panel;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@Name("Header Bar")
@FindBy(css = ".navbar-wrapper")
public class HeaderPanel extends HtmlElement {

    @Name("Bag icon")
    @FindBy(className = "icon_bag_alt")
    public TextBlock bagIcon;

}
