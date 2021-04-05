package steps;

import net.thucydides.core.annotations.Step;
import pageObject.Serenity1;

public class firstStep {

    // pageObj je instanca klase Serenity1
    Serenity1 pageObj;

    @Step("this is first step")
    public void firstSteps() throws InterruptedException {
        pageObj.open();
        pageObj.toCart();
        pageObj.end();
    }
}
