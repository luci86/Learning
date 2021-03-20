import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;


public class Bojanovo {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\JetBrains" +
                "\\IntelliJ IDEA Community Edition 2020.3.2\\plugins\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver,30);
        Random mail=new Random();
        int mail_int1=mail.nextInt(1000);

        driver.get("http://automationpractice.com/index.php");
        WebElement login= driver.findElement(By.cssSelector(".login"));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
        driver.findElement(By.cssSelector("#email_create")).sendKeys
                (mail_int1+"@gmail.com");
        driver.findElement(By.cssSelector("#email_create")).submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#id_gender1")));
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Sale");
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Sale");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("12345");
        Select selectDay= new Select(driver.findElement(By.cssSelector("#days")));
        Select selectMonth= new Select (driver.findElement(By.cssSelector("#months")));
        Select selectYr= new Select(driver.findElement(By.cssSelector("#years")));
        selectDay.selectByValue("30");
        selectMonth.selectByValue("4");
        selectYr.selectByValue("2000");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Boulevard");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dark side");
        Select selectState= new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        selectState.selectByVisibleText("Alabama");
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("25250");
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("132");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).
                click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".info-account")));
        System.out.println("Done");






    }

}