import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2ETest {


        static WebDriver driver = null;
        public static void main(String args[]){
            System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://shop.demoqa.com/?s=dress&post_type=product");
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("woocommerce-product-search-field")));
            String ele = driver.findElement(By.id("woocommerce-product-search-field")).getAttribute("value");
            Assert.assertTrue(ele.equalsIgnoreCase("dress"));
            List<WebElement> list = driver.findElements(By.cssSelector(".noo-product-inner"));
            list.get(0).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.single_add_to_cart_button.button")));
            driver.findElement(By.cssSelector("button.single_add_to_cart_button.button")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon_bag_alt")));
            driver.findElement(By.className("icon_bag_alt")).click();
            wait.until(ExpectedConditions.titleContains("Cart – Demo Shopping site"));
            driver.findElement(By.cssSelector("a.checkout-button.button.alt")).click();





        }
    }

