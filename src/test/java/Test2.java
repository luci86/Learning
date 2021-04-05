import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "bin/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions hover = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
        WebElement target1 = driver.findElement(By.linkText("WOMEN"));
        hover.moveToElement(target1).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("T-shirts")));
        WebElement target2 = driver.findElement(By.linkText("T-shirts"));
        hover.moveToElement(target2).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")));
        WebElement shirt = driver.findElement(By.xpath
                ("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
        js.executeScript("arguments[0].scrollIntoView();", shirt);
        hover.moveToElement(shirt).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quick view")));
        WebElement quick = driver.findElement(By.linkText("Quick view"));
        hover.moveToElement(quick).click().build().perform();

//

        WebElement frame = driver.findElement(By.tagName("iframe"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("iframe")));
        driver.switchTo().frame(frame);
        System.out.println("Switched");
        driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span/i"))
                .click();
        Select size = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
        size.selectByVisibleText("M");
        driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button")).click();
        System.out.println("Sent");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        System.out.println("Found");

        Thread.sleep(5000);

        String quantity = driver.findElement
                (By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")).getText();

            if
        (quantity.equals("2")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")));
            WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
            hover.moveToElement(cart).build().perform();
            WebElement checkout = driver.findElement
                    (By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a"));
            hover.moveToElement(checkout).click(checkout).build().perform();

            System.out.println("Erased");


        } else {
            driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]")).click();
            System.out.println("WTF");

        }
        Thread.sleep(5000);
        String empty= driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        if(empty.equals("Your shopping cart is empty.")) {
//            driver.quit();
        }
        System.out.println("Done");
    }

}

