package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class Serenity1 extends PageObject {
    @Managed ()
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElementFacade women;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    public WebElementFacade shirt;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
    public WebElementFacade picture;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[1]/a")
    public WebElementFacade quickview;

    @FindBy (tagName = "iframe")
    public WebElementFacade iframe;

    @FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
    public WebElementFacade number;

    @FindBy(css = "#uniform-group_1")
    public WebElementFacade size;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElementFacade addtocart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]")
    WebElementFacade items;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElementFacade proceed;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElementFacade cart;

    @FindBy(xpath = "//*[@id=\"button_order_cart\"]/span")
    WebElementFacade checkout;

    @FindBy(xpath = "//*[@id=\"1_1_0_0\"]/i")
    WebElementFacade delete;


    // toCart je method
    public void toCart() throws InterruptedException {
        Actions builder= new Actions(getDriver());
        Actions hoverOver= builder.moveToElement(women);
        hoverOver.build().perform();

        shirt.click();
        
        Actions builder1= new Actions(getDriver());
        Actions hoverOver1= builder1.moveToElement(picture);
        hoverOver1.build().perform();

        quickview.click();

        Thread.sleep(5000);

        getDriver().switchTo().frame(iframe);

        number.click();

        size.click();

        addtocart.click();



    }

    public void end(){

//        assert items.containsText("There are 2 items in your cart.");
        proceed.click();

        Actions builder2= new Actions(getDriver());
        Actions hoverOver2= builder2.moveToElement(cart);
        hoverOver2.build().perform();

        checkout.click();

        delete.click();

    }
}