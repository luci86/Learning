package steps;

import net.thucydides.core.annotations.Step;
import pageObject.Serenity2;


public class SecondStep {
    Serenity2 pageObj;

    @Step("this is the second step")
    public void second() throws InterruptedException{
        pageObj.open();
        pageObj.end();
    }
}
