package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SecondStep;
import steps.firstStep;

@RunWith(SerenityRunner.class)
public class firstTest {

    @Steps
    firstStep user;
    @Steps
    SecondStep user2;

    @Managed
    WebDriver driver;

    @Test
    public void userShouldBeAbleToCreateAndUpdateNumberOfUseCases() throws InterruptedException {
        user.firstSteps();
        Thread.sleep(5000);
        user2.second();
    }
}
