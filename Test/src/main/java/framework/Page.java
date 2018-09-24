package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.logging.Level;

public abstract class Page {
    private static Page currentPage;

    public Page() {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(Browser.getDriver())), this);
        currentPage = this;
    }

    public static final String getCurrentPageName() {
        return currentPage.getClass().getSimpleName() + " page";
    }

    public static final String getPageClassName(String pageClassName) {
        return Page.class.getName().replace("framework.Page", "pages." + pageClassName.replace(" ", "."));
    }

    public static final Page visit(String pageClassName){
        pageClassName = getPageClassName(pageClassName);
        try{
            return visit(Class.forName(pageClassName));
        }catch(ClassNotFoundException e){
            throw new RuntimeException(pageClassName + " not found!");
        }

    }

    public static final Page visit(Class pageClass) {
        try {
            Browser.getDriver().navigate().to((String) pageClass.getDeclaredField("URL").get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return onPage(pageClass);
    }

    public static Page onPage(String PageClassName){
        PageClassName = getPageClassName(PageClassName);
        try{
            return onPage(Class.forName(PageClassName));

        }catch(ClassNotFoundException e){
            throw new RuntimeException(PageClassName + " not  found");
        }
    }

    public static Page onPage(Class pageClass){
        try{
            pageClass.newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }

        return getCurrentPage();

    }

    public static Page getCurrentPage(){
        return currentPage;
    }
}
