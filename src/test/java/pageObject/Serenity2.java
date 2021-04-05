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

//    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
//    WebElementFacade items;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElementFacade cart;

    @FindBy(xpath = "//*[@id=\"button_order_cart\"]/span")
    WebElementFacade checkout;

    @FindBy(xpath = "//*[@id=\"1_1_0_0\"]/i")
    WebElementFacade delete;


    public void End(){

//        items.containsText("There are 2 items in your cart.");
//        assert items.containsText("There are 2 items in your cart.");

//        items.click();

        Actions builder2= new Actions(getDriver());
        Actions hoverOver2= builder2.moveToElement(cart);
        hoverOver2.build().perform();

        checkout.click();
    }
}
