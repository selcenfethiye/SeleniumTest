package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("searchData"));
        search.click();
        search.sendKeys("bilgisayar");

        WebElement searchButton = driver.findElement(new By.ByCssSelector(".searchBtn"));
        searchButton.click();

        //driver.quit();

    }
}
