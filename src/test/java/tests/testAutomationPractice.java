package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class testAutomationPractice {

    @Test

    public void form(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());

        By nameField = By.id("name");
        By emailField = By.id("email");
        By phoneField = By.id("phone");
        By address = By.id("textarea");
        By radio = By.id("female");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String todayDate = today.format(formatter);


        driver.findElement(nameField).sendKeys("Divya Choudhary");
        driver.findElement(emailField).sendKeys("serialkillerseeyou@gmail.com");
        driver.findElement(phoneField).sendKeys("9582172111");
        driver.findElement(address).sendKeys("Sector 8, Rohini, Delhi");
        driver.findElement(radio).click();
        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.id("monday")).click();

        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText("China");
        driver.findElement(By.id("datepicker")).sendKeys(todayDate);

        driver.quit();
    }


}
