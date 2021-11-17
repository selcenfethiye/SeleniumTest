package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTrendyol {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com/butik/liste/1/kadin");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(new By.ByCssSelector(".search-box"));
        search.click();
        search.sendKeys("filtre kahve makinesi");

        WebElement searchButton = driver.findElement(new By.ByCssSelector(".search-icon"));
        Thread.sleep(1000);
        searchButton.click();

        //driver.quit();

    }
}
