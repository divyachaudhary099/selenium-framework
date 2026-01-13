package tests;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class nopCommerce {

    @Test
    public void nopcommerce() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Page Tile: "  +  driver.getTitle());

        By searchbox = By.id("small-searchterms");
        By searchButton = By.cssSelector("button.search-box-button");

        driver.findElement(searchbox).sendKeys("camera");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        driver.findElement(searchButton).click();
        System.out.println("Page Tile: "  +  driver.getTitle());
        driver.quit();
    }


}
