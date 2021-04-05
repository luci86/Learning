package steps;

import net.thucydides.core.annotations.Step;
import pageObject.Serenity2;


public class secondStep {
    Serenity2 pageObj;

    @Step("this is the second step")
    public void Second() throws InterruptedException{
//        pageObj.open();
        pageObj.End();
    }
}
