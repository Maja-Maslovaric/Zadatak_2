package KPKategorije;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class KPBluze {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://novi.kupujemprodajem.com/");
        WebElement acceptCookies = driver.findElement(By.cssSelector(".Button_base__Pz8U1.Button_big__6JOpp.ButtonSecondary_secondary__MOPh4.CookieConsent_button__z3J_H"));
        acceptCookies.click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.cssSelector(".Button_base__Pz8U1.Button_big__6JOpp.ButtonAsLink_asLink__PxD0l.ButtonAsLink_isUnderline__alhwm.ButtonAsLink_primary__tyA67.InputSearch_buttonInner__SI17i"));
        search.click();
        Thread.sleep(2000);
        WebElement categoryField = driver.findElement(By.xpath("//*[@id=\"react-select-categoryId-input\"]"));
        categoryField.click();
        categoryField.sendKeys("Odeca | Zenska");
        categoryField.sendKeys(Keys.RETURN);

        WebElement blouseField = driver.findElement(By.xpath("//*[@id=\"react-select-groupId-input\"]"));
        Thread.sleep(2000);
blouseField.sendKeys("Bluze");
Thread.sleep(2000);
        blouseField.sendKeys(Keys.ENTER);
Thread.sleep(2000);
        WebElement priceFrom = driver.findElement(By.id("priceFrom"));
        priceFrom.click();
        priceFrom.sendKeys("100");

        WebElement onlyWithPricecheckbox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/div/div/div/div[2]/form/section/div/div[2]/div/div/div[1]/div[2]/span/div[2]/div[1]/span/label/span[1]"));
        onlyWithPricecheckbox.click();

        WebElement condition = driver.findElement(By.id("react-select-condition-input"));
        condition.click();

       WebElement conditionNew = driver.findElement(By.xpath("//*[@id=\"react-select-condition-option-0\"]/div/span/span/label/span[1]"));
conditionNew.click();

WebElement conditionAsNew = driver.findElement(By.id("react-select-condition-option-1"));
conditionAsNew.click();

WebElement applyButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/div/div/div/div[2]/form/section/div/div[2]/div/div/div[2]/button[2]"));
applyButton.click();
 Thread.sleep(3000);
WebElement result = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/div[1]/div/div/span/div/span"));
        System.out.println("Rezultat pretrage je " + result.getText());

    }
}

