package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class TestN11 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        WebElement search = driver.findElement(By.id("searchData"));
        search.click();
        search.sendKeys("bilgisayar");

        WebElement searchButton = driver.findElement(new By.ByCssSelector(".searchBtn"));
        searchButton.click();

        String title2 = driver.getTitle();

        if(title != title2){
            System.out.println("Test başarılı!");
        }
        else{
            System.out.println("Test başarısız!");
        }

        driver.quit();

    }
}
