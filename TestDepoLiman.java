package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDepoLiman {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://127.0.0.1:3000/");
        driver.manage().window().maximize();

        WebElement addStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/a"));
        addStore.click();

        WebElement storeTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[1]/input"));
        storeTitle.click();
        storeTitle.sendKeys("Depo1");

        WebElement xCoordinateStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[2]/input"));
        xCoordinateStore.click();
        xCoordinateStore.sendKeys("31");

        WebElement yCoordinateStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[3]/input"));
        yCoordinateStore.click();
        yCoordinateStore.sendKeys("27");

        WebElement capasiteStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[4]/input"));
        capasiteStore.click();
        capasiteStore.sendKeys("1000");

        WebElement saveButtonStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[5]/button"));
        saveButtonStore.click();

        Thread.sleep(2000);
        WebElement addStore2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/a"));
        addStore2.click();

        WebElement portTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[1]/input"));
        portTitle.click();
        portTitle.sendKeys("Liman1");

        WebElement xCoordinatePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[2]/input"));
        xCoordinatePort.click();
        xCoordinatePort.sendKeys("15");

        WebElement yCoordinatePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[3]/input"));
        yCoordinatePort.click();
        yCoordinatePort.sendKeys("11");

        WebElement capasitePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[4]/input"));
        capasitePort.click();
        capasitePort.sendKeys("1500");

        Thread.sleep(2000);
        WebElement saveButtonPort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[5]/button"));
        saveButtonPort.click();

        Thread.sleep(2000);
        WebElement editStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/table/tbody/tr/td[6]/a"));
        editStore.click();

        WebElement changeStoreTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[1]/input"));
        changeStoreTitle.click();
        changeStoreTitle.sendKeys("1.Depo");

        WebElement changeXCoordinateStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[2]/input"));
        changeXCoordinateStore.click();
        changeXCoordinateStore.sendKeys("23");

        WebElement changeYCoordinateStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[3]/input"));
        changeYCoordinateStore.click();
        changeYCoordinateStore.sendKeys("17");

        WebElement changeCapasiteStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[4]/input"));
        changeCapasiteStore.click();
        changeCapasiteStore.sendKeys("2000");

        WebElement changeButtonStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/form/div[5]/button"));
        changeButtonStore.click();

        Thread.sleep(2000);
        WebElement editPort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/table/tbody/tr/td[6]/a"));
        editPort.click();

        WebElement changePortTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[1]/input"));
        changePortTitle.click();
        changePortTitle.sendKeys("1.Liman");

        WebElement changeXCoordinatePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[2]/input"));
        changeXCoordinatePort.click();
        changeXCoordinatePort.sendKeys("10");

        WebElement changeYCoordinatePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[3]/input"));
        changeYCoordinatePort.click();
        changeYCoordinatePort.sendKeys("7");

        WebElement changeCapasitePort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[4]/input"));
        changeCapasitePort.click();
        changeCapasitePort.sendKeys("500");

        WebElement changeButtonPort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div[5]/button"));
        changeButtonPort.click();

        Thread.sleep(2000);
        WebElement deleteButtonStore = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/table/tbody/tr/td[6]/button"));
        deleteButtonStore.click();

        Thread.sleep(2000);
        WebElement deleteButtonPort = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/table/tbody/tr/td[6]/button"));
        deleteButtonPort.click();
    }
}
