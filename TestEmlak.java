package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEmlak {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\selce\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://127.0.0.1:3000/");
        driver.manage().window().maximize();

        WebElement kiralikPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/kiralik\"]"));
        kiralikPage.click();

        WebElement satilikPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/satilik\"]"));
        satilikPage.click();

        WebElement hakkimizdaPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/hakkimizda\"]"));
        hakkimizdaPage.click();

        WebElement githubButton = driver.findElement(By.className("fa-github"));
        js.executeScript("arguments[0].scrollIntoView();",githubButton);
        Thread.sleep(2000);
        githubButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        WebElement linkedinButton = driver.findElement(By.className("fa-linkedin"));
        js.executeScript("arguments[0].scrollIntoView();",linkedinButton);
        Thread.sleep(2000);
        linkedinButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        WebElement gmailButton = driver.findElement(By.className("fa-envelope"));
        js.executeScript("arguments[0].scrollIntoView();",gmailButton);
        Thread.sleep(2000);
        gmailButton.click();

        driver.get("http://127.0.0.1:3000/hakkimizda");

        WebElement anasayfaPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/anasayfa\"]"));
        anasayfaPage.click();

        WebElement cardLeftButton = driver.findElement(new By.ByCssSelector(".carousel-control-prev-icon[aria-hidden='true']"));
        cardLeftButton.click();

        WebElement cardRightButton = driver.findElement(new By.ByCssSelector(".carousel-control-next-icon[aria-hidden='true']"));
        cardRightButton.click();

        WebElement adminPage = driver.findElement(By.xpath("//*[@id=\"navbarText\"][@href=\"/admin\"]"));
        Thread.sleep(2000);
        adminPage.click();

        WebElement addAdvertPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[2]"));
        Thread.sleep(2000);
        addAdvertPage.click();

        WebElement advertName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        advertName.click();
        advertName.sendKeys("Doktordan temiz!!!");

        WebElement advertPrice = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        advertPrice.click();
        advertPrice.sendKeys("3000");

        WebElement advertProperties = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        advertProperties.click();
        advertProperties.sendKeys("Yerden ısıtmalı");

        WebElement selectionCity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]"));
        selectionCity.click();

        WebElement selectionCity1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[1]"));
        Thread.sleep(2000);
        selectionCity1.click();

        WebElement selectionCity2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[2]"));
        Thread.sleep(2000);
        selectionCity2.click();

        WebElement selectionCity3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[1]/option[3]"));
        Thread.sleep(2000);
        selectionCity3.click();

        WebElement selectionTypeofSales = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]"));
        selectionTypeofSales.click();

        WebElement selectionTypeofSales1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[1]"));
        Thread.sleep(2000);
        selectionTypeofSales1.click();

        WebElement selectionTypeofSales2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[2]"));
        Thread.sleep(2000);
        selectionTypeofSales2.click();

        WebElement selectionTypeofSales3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[2]/option[3]"));
        Thread.sleep(2000);
        selectionTypeofSales3.click();

        WebElement selectionTypeofActivity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]"));
        selectionTypeofActivity.click();

        WebElement selectionTypeofActivity1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[1]"));
        Thread.sleep(2000);
        selectionTypeofActivity1.click();

        WebElement selectionTypeofActivity2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[2]"));
        Thread.sleep(2000);
        selectionTypeofActivity2.click();

        WebElement selectionTypeofActivity3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/select[3]/option[3]"));
        Thread.sleep(2000);
        selectionTypeofActivity3.click();

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        Thread.sleep(2000);
        addButton.click();

        WebElement deleteAdvertPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[3]"));
        Thread.sleep(2000);
        deleteAdvertPage.click();

        WebElement deleteButton = driver.findElement(By.id("29"));
        Thread.sleep(2000);
        deleteButton.click();

        WebElement changeAdvertActiviyPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[4]"));
        Thread.sleep(2000);
        changeAdvertActiviyPage.click();

        driver.findElement(By.xpath("//*[@id=\"1\"][@class=\"select\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"1\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"1\"][@class=\"button\"]")).click();

        WebElement addTeamMemberPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[5]"));
        Thread.sleep(2000);
        addTeamMemberPage.click();

        WebElement personName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        Thread.sleep(2000);
        personName.click();
        personName.sendKeys("Selcen Fethiye");

        WebElement personSurname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        personSurname.click();
        personSurname.sendKeys("MERSİNLİ");

        WebElement personMission = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        personMission.click();
        personMission.sendKeys("Tester");

        WebElement personGithub = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]"));
        personGithub.click();
        personGithub.sendKeys("selcenfethiye");

        WebElement personLinkedin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[5]"));
        personLinkedin.click();
        personLinkedin.sendKeys("selcen-fethiye-mersinli-59180b19b");

        WebElement personMail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[6]"));
        personMail.click();
        personMail.sendKeys("selcenfethiyemersinli@gmail.com");

        WebElement addButton2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        addButton2.click();

        WebElement arrangementTeamMemberPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[6]"));
        Thread.sleep(2000);
        arrangementTeamMemberPage.click();

        WebElement arrangementBox = driver.findElement(By.xpath("//*[@id=\"9\"][@type=\"text\"]"));
        arrangementBox.click();
        arrangementBox.sendKeys("selcenfethiye");

        WebElement arrangementButton = driver.findElement(By.xpath("//*[@id=\"9\"][@class=\"button\"]"));
        Thread.sleep(1000);
        arrangementButton.click();

        WebElement deleteTeamMemberPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[7]"));
        Thread.sleep(2000);
        deleteTeamMemberPage.click();

        WebElement deleteButton2 = driver.findElement(By.id("9"));
        deleteButton2.click();

        WebElement editCompanyInformationPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[8]"));
        Thread.sleep(2000);
        editCompanyInformationPage.click();

        WebElement companyName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[1]"));
        companyName.click();
        companyName.sendKeys("Mersinli");

        WebElement companySector = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[2]"));
        companySector.click();
        companySector.sendKeys("Gayrimenkul Satışı");

        WebElement companyGoal = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[3]"));
        companyGoal.click();
        companyGoal.sendKeys("Ticaret");

        WebElement companyAddress = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/input[4]"));
        companyAddress.click();
        companyAddress.sendKeys("Yenişehir/Mersin");

        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button"));
        editButton.click();


        WebElement backMainPage = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/a[1]"));
        Thread.sleep(2000);
        backMainPage.click();


        Thread.sleep(2000);
        driver.quit();
    }
}
