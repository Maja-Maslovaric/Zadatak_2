package KPOglas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KPOglas {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://novi.kupujemprodajem.com/");
        WebElement acceptCookies = driver.findElement(By.cssSelector(".Button_base__Pz8U1.Button_big__6JOpp.ButtonSecondary_secondary__MOPh4.CookieConsent_button__z3J_H"));
       acceptCookies.click();

        WebElement latestAds = driver.findElement(By.cssSelector(".Link_link__J4Qd8.Button_base__Pz8U1.Button_inherit___tUxa.Button_noPadding__JQU_i.CategoryHeadlineItem_itemOutter__g9aGN.CategoryHeadlineItem_firstItem__M_Qvm"));
        latestAds.click();

   Thread.sleep(2000);

      /*  WebElement ad0 = driver.findElement(By.className("AdItem_adTextHolder__Fmra9"));
        Thread.sleep(2000);
        ad0.click(); */

        WebElement ad1 = driver.findElement(By.className("AdItem_name__RhGAZ"));
        Thread.sleep(2000);
        ad1.click();

        Thread.sleep(2000);
        WebElement addItemToAddressBook = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/section[1]/div[2]/section[2]/section/div[2]/button"));
       Thread.sleep(2000);
        addItemToAddressBook.click();
    }
}