import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\JetBrains\\" +
                        "IntelliJ IDEA Community Edition 2020.3.2\\plugins\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, 30);
        Actions hover=new Actions(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver;


        driver.get("http://automationpractice.com/index.php");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
        WebElement target1= driver.findElement(By.linkText("WOMEN"));
        hover.moveToElement(target1).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("T-shirts")));
        WebElement target2= driver.findElement(By.linkText("T-shirts"));
        hover.moveToElement(target2).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")));
        WebElement shirt= driver.findElement(By.xpath
                ("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
        js.executeScript("arguments[0].scrollIntoView();", shirt);
        hover.moveToElement(shirt).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quick view")));
        WebElement quick= driver.findElement(By.linkText("Quick view"));
        hover.moveToElement(quick).click().build().perform();

//

        WebElement frame=driver.findElement(By.cssSelector("#fancybox-frame1615581811484"));
        driver.switchTo().frame(frame);
        System.out.println("Switched");
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("2");



    }
}
