package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class Serenity2 extends PageObject {
    @Managed ()
    WebDriver driver;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6")
    WebElementFacade items;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    WebElementFacade proceed;

    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    WebElementFacade cart;

    @FindBy(css = "#button_order_cart > span")
    WebElementFacade checkout;

    @FindBy(xpath = "//*[@id=\"1_1_0_0\"]/i")
    WebElementFacade delete;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElementFacade finish;


    public void end(){

//        assert items.getText().equals("There are 2 items in your cart.");

//        items.click();

//
        Actions builder2= new Actions(getDriver());
        Actions hoverOver2= builder2.moveToElement(cart);
        hoverOver2.build().perform();

        checkout.click();

        delete.click();

        waitFor(finish);
        assert finish.getText().equals("Your shopping cart is empty.");
    }
}
