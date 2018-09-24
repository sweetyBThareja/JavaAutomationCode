package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ProductCatalogPage;
import pages.ProductDetailPage;
import pages.ShoppingBagPage;

import static framework.Hooks.log;
import static framework.Page.*;

public class E2ESteps {
    HomePage homePage = new HomePage();
    ProductCatalogPage searchedPage = new ProductCatalogPage();
    ProductDetailPage pdp = new ProductDetailPage();

    @Given("^I visit the website as a guest user$")
    public void iVisitTheWebsiteAsAGuestUser() throws Throwable {
        visit("HomePage");
        log().info("Navigated to website");
    }

    @When("^I search for the product \"([^\"]*)\" from searchbox$")
    public void iSearchForTheProductFromSearchbox(String keyword) throws Throwable {
        homePage.searchicon.click();
        homePage.searchBox.sendKeys(keyword);
        homePage.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("^I navigate to product details page$")
    public void iNavigateToProductDetailsPage() throws Throwable {
        onPage("ProductCatalogPage");
        String value = searchedPage.searchedKeyword.getAttribute("value");
//        Assert.assertTrue(value.equalsIgnoreCase("dress"));
    }

    @When("^I select a random product$")
    public void iSelectARandomProduct() throws Throwable {
        searchedPage.selectRandomProduct();
    }

    @And("^I navigate to PDP$")
    public void iNavigateToPDP() throws Throwable {
        onPage("ProductDetailPage");
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String button) throws Throwable {
        if(button.equalsIgnoreCase("ADD TO CART")){
            ((ProductDetailPage) getCurrentPage()).addToCartButton.click();
        }
    }

    @When("^I click on bag icon from header$")
    public void iClickOnBagIconFromHeader() throws Throwable {
        pdp.headerPanel.bagIcon.click();
    }

    @Then("^I navigate to shopping bag page$")
    public void iNavigateToShoppingBagPage() throws Throwable {
        onPage("ShoppingBagPage");
        WebDriverWait wait = new WebDriverWait(Browser.getDriver(), 15);
        wait.until(ExpectedConditions.titleContains("Cart – Demo Shopping site"));

    }

    @When("^I proceed to checkout as guest$")
    public void iProceedToCheckoutAsGuest() throws Throwable {
        ((ShoppingBagPage) getCurrentPage()).checkoutButton.click();
    }

    @Then("^I navigate to checkout page$")
    public void iNavigateToCheckoutPage() throws Throwable {
        onPage("CheckoutPage");
    }
}
